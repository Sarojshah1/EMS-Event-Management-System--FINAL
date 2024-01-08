
package calander;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;


public class PanelDate extends javax.swing.JLayeredPane {
    private int month;
    private int year;

    public PanelDate(int month,int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
        
    }

    private void init() {
        sun.asTitle();
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        setDate();
    }
    
     private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //  up 1 day
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new calander.Cell();
        mon = new calander.Cell();
        tue = new calander.Cell();
        wed = new calander.Cell();
        thu = new calander.Cell();
        fri = new calander.Cell();
        sat = new calander.Cell();
        cell8 = new calander.Cell();
        cell9 = new calander.Cell();
        cell10 = new calander.Cell();
        cell11 = new calander.Cell();
        cell12 = new calander.Cell();
        cell13 = new calander.Cell();
        cell14 = new calander.Cell();
        cell15 = new calander.Cell();
        cell16 = new calander.Cell();
        cell17 = new calander.Cell();
        cell18 = new calander.Cell();
        cell19 = new calander.Cell();
        cell20 = new calander.Cell();
        cell21 = new calander.Cell();
        cell22 = new calander.Cell();
        cell23 = new calander.Cell();
        cell24 = new calander.Cell();
        cell25 = new calander.Cell();
        cell26 = new calander.Cell();
        cell27 = new calander.Cell();
        cell28 = new calander.Cell();
        cell29 = new calander.Cell();
        cell30 = new calander.Cell();
        cell31 = new calander.Cell();
        cell32 = new calander.Cell();
        cell33 = new calander.Cell();
        cell34 = new calander.Cell();
        cell35 = new calander.Cell();
        cell36 = new calander.Cell();
        cell37 = new calander.Cell();
        cell38 = new calander.Cell();
        cell39 = new calander.Cell();
        cell40 = new calander.Cell();
        cell41 = new calander.Cell();
        cell42 = new calander.Cell();
        cell43 = new calander.Cell();
        cell44 = new calander.Cell();
        cell45 = new calander.Cell();
        cell46 = new calander.Cell();
        cell47 = new calander.Cell();
        cell48 = new calander.Cell();
        cell49 = new calander.Cell();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(7, 7));

        sun.setText("Sun");
        sun.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(sun);

        mon.setText("Mon");
        mon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(mon);

        tue.setText("Tue");
        tue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Wed");
        wed.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Thu");
        thu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(fri);

        sat.setForeground(new java.awt.Color(255, 0, 51));
        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(sat);

        cell8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell8);

        cell9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell9);

        cell10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell10);

        cell11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell11);

        cell12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell12);

        cell13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell13);

        cell14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell14);

        cell15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell15);

        cell16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell16);

        cell17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell17);

        cell18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell18);

        cell19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell19);

        cell20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell20);

        cell21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell21);

        cell22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell22);

        cell23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell23);

        cell24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell24);

        cell25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell25);

        cell26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell26);

        cell27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell27);

        cell28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell28);

        cell29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell29);

        cell30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell30);

        cell31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell31);

        cell32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell32);

        cell33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell33);

        cell34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell34);

        cell35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell35);

        cell36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell36);

        cell37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell37);

        cell38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell38);

        cell39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell39);

        cell40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell40);

        cell41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell41);

        cell42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell42);

        cell43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell43);

        cell44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell44);

        cell45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell45);

        cell46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell46);

        cell47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell47);

        cell48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell48);

        cell49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cell49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void cell8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell8ActionPerformed
System.out.println("clicked");

    }//GEN-LAST:event_cell8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private calander.Cell cell10;
    private calander.Cell cell11;
    private calander.Cell cell12;
    private calander.Cell cell13;
    private calander.Cell cell14;
    private calander.Cell cell15;
    private calander.Cell cell16;
    private calander.Cell cell17;
    private calander.Cell cell18;
    private calander.Cell cell19;
    private calander.Cell cell20;
    private calander.Cell cell21;
    private calander.Cell cell22;
    private calander.Cell cell23;
    private calander.Cell cell24;
    private calander.Cell cell25;
    private calander.Cell cell26;
    private calander.Cell cell27;
    private calander.Cell cell28;
    private calander.Cell cell29;
    private calander.Cell cell30;
    private calander.Cell cell31;
    private calander.Cell cell32;
    private calander.Cell cell33;
    private calander.Cell cell34;
    private calander.Cell cell35;
    private calander.Cell cell36;
    private calander.Cell cell37;
    private calander.Cell cell38;
    private calander.Cell cell39;
    private calander.Cell cell40;
    private calander.Cell cell41;
    private calander.Cell cell42;
    private calander.Cell cell43;
    private calander.Cell cell44;
    private calander.Cell cell45;
    private calander.Cell cell46;
    private calander.Cell cell47;
    private calander.Cell cell48;
    private calander.Cell cell49;
    private calander.Cell cell8;
    private calander.Cell cell9;
    private calander.Cell fri;
    private calander.Cell mon;
    private calander.Cell sat;
    private calander.Cell sun;
    private calander.Cell thu;
    private calander.Cell tue;
    private calander.Cell wed;
    // End of variables declaration//GEN-END:variables
}
