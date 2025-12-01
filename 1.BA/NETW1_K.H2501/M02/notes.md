# Navigation

- [IOS Navigation](#ios-navigation)
    - [Primary Command Modes](#primary-command-modes)
    - [Configuration Mode und Subconfiguration Mode](#configuration-mode-und-subconfiguration-mode)
    - [Navigate between IOS Modes](#navigate-between-ios-modes)
- [Basic Device Configuration](#basic-device-configuration)
    - [Device Names](#device-names)
    - [Configure Passwords](#configure-passwords)
    - [Encrypt Passwords](#encrypt-passwords)
    - [Banner Messages](#banner-messages)
- [Configuration](#configuration)
    - [Altering the Running Config](#altering-the-running-config)
- [Ports and Addresses](#ports-and-addresses)
    - [Switch Virtual Interface Configuration](#switch-virtual-interface-configuration)

# IOS Navigation

## Primary Command Modes

Cisco IOS has two command modes:

- User EXEC Mode
    - limited capabilities
    - does not allow change of the configuration
    - mainly for checking stuff and monitoring
    - this mode is signified by ">"
- Privileged EXEC Mode
    - privileged capabilities
    - this mode is signified "#"

## Configuration Mode und Subconfiguration Mode

To configure a devuce a user must enter global configuration mode (aka global config mode). From here changes are made that affect the operation of the device as a whole. 
This mode is identified by the promt ending with "(config)#". Global config mode is accessed before other specific configuration modes. Two common subconfiguration modes are:

- Line Configuration Mode: To configure SSH, Telnet or AUX access: "(config-line)#"
- Interface Configuration Mode: To configure a switchport or router network interface: "(config-if)#"

## Navigate between IOS Modes

Starting in User Exec Mode, switch to Privileged Exec Mode, then back to User Exec Mode

```
enable
disable
```

Starting in User Exec Mode, switch to Privileged Exec Mode and then enter global config mode and finally exit global configuration mode

```
enable 
configure terminal
exit
```

Starting in global config mode enter line subconfig mode, then switch to interface config mode

```
line config 0       # configure switch-port 0
interface vlan 1    # configure interface on vlan 1
```

> [!TIP]
> In Cisco IOS you can use "?" the same way as "help" in linux.

# Basic Device Configuration

## Device Names

Guidelines for Host names:

- Start with Letters
- Contain no spaces
- End with a letter or digit
- Use only letters, digits and hashes
- Has to be less than 64 characters long

A naming convention makes it easier to understand the type of device and its location. An example for switches on the different floors of an office could be:

- sw-floor-3
- sw-floor-2
- sw-floor-1

Here's an example on how to change the hostname of a device:

```
configure terminal
hostname sw-floor-1
```

## Configure Passwords

Here's how to configure the user exec mode password

```
configure terminal
line console 0
password cisco
login
end
```

Setting the privileged exec mode password

```
configure terminal
enable secret class
exit
```

Configure a password for a cisco VTY (Virtual Terminal for SSH/Telnet access)

```
configure terminal
line vty 0 15 # selecting the vty 0 15
password cisco
login
end
```

## Encrypt Passwords

The startup-config displays most passwords in plaintext, to encrypt them we need to enable the service password-encryption

```
configure terminal
service password-encryption
```

You can check if the passwords are encrypted by using the command `show running-config``

## Banner Messages

We will dd a banner message saying "Authorized Access Only" to the device like this:

```
configure terminal
banner motd #Authorized Access Only#
```

# Configuration

There are two system files that store device configurations:

- startup-config: configuration file that is saved in NVRAM that contains all the commands the device will use upon startup
- running-config: reflects current configuration but is stored in RAM and will be lost on restart

The command `show running-config` is used to display the complete configuration currently stored in ram.

The command `show startup-config` is used to display the complete startup configuration

## Altering the Running Config

If changes made to the running-config do not have the desired affect, reload using the command `reload`without saving the config. The same counts for the startuü-config, 
except if it has been saved you need to delete it from NVRAM using the command `erase startup-config`. This will revert the device to the startup-config that it ships with.

# Ports and Addresses

## Switch Virtual Interface Configuration

To access the switch remotely an IP address and subnet mask need to be configure to the SVI

```
configure terminal
interface vlan 1
ip address 192.168.1.20 255.255.255.0
no shutdown
exit
ip default-gateway 192.168.1.1
```



