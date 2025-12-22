import numpy as np
import matplotlib.pyplot as plt
import matplotlib as mpl

# ---- Your results (I01..I12) ----
scores = np.array([4, 4, 4, 4, 4, 3, 2, 4, 4, 4, 4, 3], dtype=float)  # E0..E4

indicator_names = [
    "Operative Anschlussfähigkeit",
    "Berichtete Nutzenargumente",
    "Wissenschaftliche Rezeption",
    "Wahrgenommene strategische Bedeutung",
    "Integrationspfade",
    "Kompetenzanforderungen",
    "Aufwandseinschätzung",
    "Organisatorische Voraussetzungen",
    "Pflegemechanismen",
    "Standardinteroperabilität",
    "Tool-Resilienz",
    "Langfristige Anwendbarkeit",
]

groups = [
    (indicator_names[0:4], scores[0:4], "", "radar_relevanz.png"),
    (indicator_names[4:8], scores[4:8], "", "radar_umsetzbarkeit.png"),
    (indicator_names[8:12], scores[8:12], "", "radar_nachhaltigkeit.png"),
]

norm = mpl.colors.Normalize(vmin=0, vmax=4)
cmap = mpl.cm.get_cmap("Blues")  # shades of blue

for group_labels, group_scores, title, filename in groups:
    fig, ax = plt.subplots(figsize=(9, 6), subplot_kw=dict(polar=True))

    N = len(group_labels)
    angles = np.linspace(0, 2 * np.pi, N, endpoint=False)

    # Close polygon
    angles_closed = np.r_[angles, angles[0]]
    values_closed = np.r_[group_scores, group_scores[0]]

    # Fill sectors
    for i in range(N):
        a0 = angles[i]
        a1 = angles[(i + 1) % N]
        r0 = group_scores[i]
        r1 = group_scores[(i + 1) % N]

        col = cmap(norm((group_scores[i] + group_scores[(i + 1) % N]) / 2))

        ax.fill([a0, a0, a1], [0, r0, r1],
                color=col, alpha=0.55, edgecolor="none")

    # Outline polygon + markers
    ax.plot(angles_closed, values_closed, "k-", linewidth=2)
    ax.scatter(
        angles, group_scores,
        c=group_scores, cmap=cmap, norm=norm,
        s=120, zorder=3, edgecolors="black", linewidth=1.5
    )

    # Radial axis
    ax.set_yticks([0, 1, 2, 3, 4])
    ax.set_ylim(0, 4)
    ax.grid(True)
    ax.set_title(title, pad=20, fontsize=16, fontweight="bold")

    # --- IMPORTANT PART: custom labels (no xticklabels) ---
    ax.set_xticks(angles)
    ax.set_xticklabels([])  # hide default polar tick labels

    r_label = 4.35  # how far outside the circle the labels sit

    for lbl, ang in zip(group_labels, angles):
        deg = (np.degrees(ang) + 360) % 360

        # default: top/bottom stay horizontal
        rotation = 0

        # right label (0°) = I05 in your Umsetzbarkeit plot
        # Make TOP of text face center -> rotate 270°
        if np.isclose(deg, 0):
            rotation = 270

        # left label (180°) = I07 in your Umsetzbarkeit plot
        # Make TOP of text face center -> rotate 90°
        elif np.isclose(deg, 180):
            rotation = 90

        ax.text(
            ang, r_label, lbl,
            ha="center", va="center",
            fontsize=12,
            rotation=rotation,
            rotation_mode="anchor",
            clip_on=False,
        )

    plt.tight_layout()
    plt.savefig(filename, dpi=300, bbox_inches="tight")
    plt.close()
    print(f"Saved: {filename}")

print("\nAll radar charts saved successfully!")
