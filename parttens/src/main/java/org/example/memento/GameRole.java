package org.example.memento;

/**
 * 游戏角色类（发起人角色）
 */
public class GameRole {
    private int vit; // 生命值
    private int atk; // 攻击力
    private int def; // 防御力

    // 初始化状态
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 战斗后状态
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoverState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void displayState() {
        System.out.println("角色当前生命值：" + vit);
        System.out.println("角色当前攻击力：" + atk);
        System.out.println("角色当前防御力：" + def);
    }

    public int getVit() { return vit; }
    public void setVit(int vit) { this.vit = vit; }
    public int getAtk() { return atk; }
    public void setAtk(int atk) { this.atk = atk; }
    public int getDef() { return def; }
    public void setDef(int def) { this.def = def; }
}

