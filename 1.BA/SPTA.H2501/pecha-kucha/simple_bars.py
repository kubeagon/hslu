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
    (indicator_names[0:4], scores[0:4], "Relevanz", "bar_relevanz.png"),
    (indicator_names[4:8], scores[4:8], "Umsetzbarkeit", "bar_umsetzbarkeit.png"),
    (indicator_names[8:12], scores[8:12], "Nachhaltigkeit", "bar_nachhaltigkeit.png"),
]

# Color mapping
norm = mpl.colors.Normalize(vmin=0, vmax=4)
cmap = mpl.cm.get_cmap("Blues")

for group_labels, group_scores, title, filename in groups:
    fig, ax = plt.subplots(figsize=(12, 6))
    
    # Create horizontal bars with gradient
    y_pos = np.arange(len(group_labels))
    BAR_HEIGHT = 0.6
    N = 400  # gradient resolution
    
    for y, score in zip(y_pos, group_scores):
        # Create gradient from 0 to score value
        x = np.linspace(0, score, N).reshape(1, -1)
        ax.imshow(
            x,
            aspect='auto',
            cmap=cmap,
            norm=norm,
            extent=[0, score, y - BAR_HEIGHT / 2, y + BAR_HEIGHT / 2],
            interpolation='bilinear'
        )
    
    # Add black border to bars
    for y, score in zip(y_pos, group_scores):
        ax.plot([0, score, score, 0, 0], 
                [y - BAR_HEIGHT/2, y - BAR_HEIGHT/2, y + BAR_HEIGHT/2, y + BAR_HEIGHT/2, y - BAR_HEIGHT/2],
                'k-', linewidth=1.5)
    
    ax.set_yticks(y_pos)
    ax.set_yticklabels(group_labels, fontsize=14)
    ax.set_xlim(0, 4.5)
    ax.set_xticks([0, 1, 2, 3, 4])
    ax.set_xticklabels(['E0', 'E1', 'E2', 'E3', 'E4'], fontsize=14)
    ax.set_title(title, fontsize=20, fontweight='bold', pad=20)
    ax.grid(axis='x', alpha=0.3, linestyle='--')
    ax.invert_yaxis()  # Top to bottom
    
    plt.tight_layout()
    plt.savefig(filename, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close()
    print(f"Saved: {filename}")

print("\nAll bar charts saved successfully!")
