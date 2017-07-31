
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class association {

    ArrayList<features> data = new ArrayList<features>();
    ArrayList<features> validation = new ArrayList<features>();
    ArrayList<String> classlabelTruth = new ArrayList<String>();
    ArrayList<String> truthFile = new ArrayList<String>();
    
    
   public void car() throws FileNotFoundException, IOException {
        RandomAccessFile file = new RandomAccessFile("car_training.txt", "rw");
        String text = file.readLine();
        double good = 0, vgood = 0, acc = 0, unacc = 0;

        while (text != null) {
            String spl[] = text.split(",");
            features obj = new features();
            obj.setAtt1(Integer.parseInt(spl[0]));
            obj.setAtt2(Integer.parseInt(spl[1]));
            obj.setAtt3(Integer.parseInt(spl[2]));
            obj.setAtt4(Integer.parseInt(spl[3]));
            obj.setAtt5(Integer.parseInt(spl[4]));
            obj.setAtt6(Integer.parseInt(spl[5]));
            obj.setClassLabel(spl[6]);
            if (spl[6].equals("acc")) {
                acc++;

            } else if (spl[6].equals("unacc")) {
                unacc++;
            } else if (spl[6].equals("good")) {
                good++;
            } else if (spl[6].equals("vgood")) {
                vgood++;
            }
            data.add(obj);
            text = file.readLine();
        }

        RandomAccessFile file2 = new RandomAccessFile("Car_validation_features.txt", "rw");
        text = file2.readLine();

        while (text != null) {
            String spl[] = text.split(",");
            features obj = new features();
            obj.setAtt1(Integer.parseInt(spl[0]));
            obj.setAtt2(Integer.parseInt(spl[1]));
            obj.setAtt3(Integer.parseInt(spl[2]));
            obj.setAtt4(Integer.parseInt(spl[3]));
            obj.setAtt5(Integer.parseInt(spl[4]));
            obj.setAtt6(Integer.parseInt(spl[5]));
            obj.setClassLabel(null);
            validation.add(obj);
            text = file2.readLine();
        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println(i + " data : " + data.get(i).getAtt1() + "," + data.get(i).getAtt2() + "," + data.get(i).getAtt3() + "," + data.get(i).getAtt4()
                    + "," + data.get(i).getAtt5() + "," + data.get(i).getAtt6() + "," + data.get(i).getClassLabel());
        }

        for (int i = 0; i < validation.size(); i++) {
            System.out.println(i + " validation: " + validation.get(i).getAtt1() + "," + validation.get(i).getAtt2() + "," + validation.get(i).getAtt3() + "," + validation.get(i).getAtt4()
                    + "," + validation.get(i).getAtt5() + "," + validation.get(i).getAtt6() + "," + validation.get(i).getClassLabel());
        }

        double good1 = 0, vgood1 = 0, acc1 = 0, unacc1 = 0;
        double good2 = 0, vgood2 = 0, acc2 = 0, unacc2 = 0;
        double good3 = 0, vgood3 = 0, acc3 = 0, unacc3 = 0;
        double good4 = 0, vgood4 = 0, acc4 = 0, unacc4 = 0;
        double good5 = 0, vgood5 = 0, acc5 = 0, unacc5 = 0;
        double good6 = 0, vgood6 = 0, acc6 = 0, unacc6 = 0;

        for (int i = 0; i < validation.size(); i++) {
            for (int j = 0; j < data.size(); j++) {
                if (validation.get(i).getAtt1() == data.get(j).getAtt1()) {
                    if (data.get(j).getClassLabel().equals("acc")) {
                        acc1++;
                        //System.out.println(j+"1 acc "+acc1);
                    } else if (data.get(j).getClassLabel().equals("unacc")) {
                        unacc1++;

                        //System.out.println(j+" 1 unacc "+unacc1);
                    } else if (data.get(j).getClassLabel().equals("good")) {
                        good1++;

                        //  System.out.println(j+"1 good  "+good1);
                    } else if (data.get(j).getClassLabel().equals("vgood")) {
                        vgood1++;

                        //System.out.println(j+"1 vgood  "+vgood1);
                    }
                }
                if (validation.get(i).getAtt2() == data.get(j).getAtt2()) {
                    if (data.get(j).getClassLabel().equals("acc")) {
                        acc2++;
                        // System.out.println("2 acc "+acc2);
                    } else if (data.get(j).getClassLabel().equals("unacc")) {
                        unacc2++;
                        // System.out.println("2 unacc "+unacc2);
                    } else if (data.get(j).getClassLabel().equals("good")) {
                        good2++;
                        //  System.out.println(" 2 good  "+good2);
                    } else if (data.get(j).getClassLabel().equals("vgood")) {
                        vgood2++;
                        // System.out.println(" 2 vgood  "+vgood2);
                    }
                }
                if (validation.get(i).getAtt3() == data.get(j).getAtt3()) {
                    if (data.get(j).getClassLabel().equals("acc")) {
                        acc3++;
                        //System.out.println("3 acc "+acc3);
                    } else if (data.get(j).getClassLabel().equals("unacc")) {
                        unacc3++;
                        //System.out.println("3 unacc "+unacc3);
                    } else if (data.get(j).getClassLabel().equals("good")) {
                        good3++;
                        //System.out.println(" 3 good  "+good3);
                    } else if (data.get(j).getClassLabel().equals("vgood")) {
                        vgood3++;
                        //  System.out.println(" 3 vgood  "+vgood3);
                    }
                }
                if (validation.get(i).getAtt4() == data.get(j).getAtt4()) {
                    if (data.get(j).getClassLabel().equals("acc")) {
                        acc4++;
                    } else if (data.get(j).getClassLabel().equals("unacc")) {
                        unacc4++;
                    } else if (data.get(j).getClassLabel().equals("good")) {
                        good4++;
                    } else if (data.get(j).getClassLabel().equals("vgood")) {
                        vgood4++;
                    }
                }
                if (validation.get(i).getAtt5() == data.get(j).getAtt5()) {
                    if (data.get(j).getClassLabel().equals("acc")) {
                        acc5++;
                    } else if (data.get(j).getClassLabel().equals("unacc")) {
                        unacc5++;
                    } else if (data.get(j).getClassLabel().equals("good")) {
                        good5++;
                    } else if (data.get(j).getClassLabel().equals("vgood")) {
                        vgood5++;
                    }
                }
                if (validation.get(i).getAtt6() == data.get(j).getAtt6()) {
                    if (data.get(j).getClassLabel().equals("acc")) {
                        acc6++;
                    } else if (data.get(j).getClassLabel().equals("unacc")) {
                        unacc6++;
                    } else if (data.get(j).getClassLabel().equals("good")) {
                        good6++;
                    } else if (data.get(j).getClassLabel().equals("vgood")) {
                        vgood6++;
                    }
                }
                // System.out.println("j="+j+" acc "+(acc1)+" unacc "+unacc1+" good = "+good1+"  vgood "+vgood1);
            }

            double a = 0.00001;
            double b = 0, c = 0;
            if ((acc1 / acc) > 0) {b = (acc1 / acc);} else {b = a;
            }if ((acc2 / acc) > 0) { b *= (acc2 / acc); } else {b *= a;}
            if ((acc3 / acc) > 0) { b *= (acc3 / acc);} else { b *= a;}
            if ((acc4 / acc) > 0) { b *= (acc4 / acc); } else { b *= a;}
            if ((acc5 / acc) > 0) {b *= (acc5 / acc);} else {b *= a;}
            if ((acc6 / acc) > 0) {b *= (acc6 / acc);} else {b *= a;}
            if ((unacc1 / unacc) > 0) {c = (unacc1 / unacc); } else {c = a;}
            if ((unacc2 / unacc) > 0) { c *= (unacc2 / unacc);} else { c *= a;}
            if ((unacc3 / unacc) > 0) { c*= (unacc3 / unacc);} else {c *= a;}
            if ((unacc4 / unacc) > 0) { c *= (unacc4 / unacc);} else { c *= a; }
            if ((unacc5 / unacc) > 0) {c*= (unacc5 / unacc);} else {c *= a;}
            if ((unacc6 / unacc) > 0) { c *= (unacc6 / unacc); } else {c *= a;}
            double t=0;
            if ((good1 / good) > 0) {    t= (good1 / good);
            } else {
                t = a;
            }  if ((good2 / good) > 0) {
                t*= (good2 / good);
            } else {
                t *= a;
            }
            if ((good3/ good) > 0) {
                t*= (good3 / good);
            } else {
                t *= a;
            }
            if ((good4 / good) > 0) {
                t*= (good4 / good);
            } else {
                t *= a;
            }
            if ((good5 / good) > 0) {
                t*= (good5 / good);
            } else {
                t *= a;
            }
           if ((good6/ good) > 0) {
                t*= (good6 / good);
            } else {
                t *= a;
            }double tt=0;
            if ((vgood1 / vgood) > 0) {
                tt= (vgood1 / vgood);
            } else {
                tt = a;
            }  if ((vgood2 / vgood) > 0) {
                tt*= (vgood2 / vgood);
            } else {
                tt *= a;
            }
            if ((vgood3/ vgood) > 0) {
                tt*= (vgood3 / vgood);
            } else {
                tt *= a;
            }
            if ((vgood4 / vgood) > 0) {
                tt*= (vgood4 / vgood);
            } else {
                tt *= a;
            }
            if ((vgood5 / vgood) > 0) {
                tt*= (vgood5 / vgood);
            } else {
                tt *= a;
            }
           if ((vgood6/ vgood) > 0) {
                tt*= (vgood6 / vgood);
            } else {
                tt *= a;
            }
           
             double sumAcc = b * (acc / (double) data.size());
             double sumUnAcc = c* (unacc / (double) data.size());
            double sumGood = t* (good / (double) data.size());
            double sumVgood=tt*(vgood/ (double) data.size());
            
            if (sumAcc >= sumUnAcc && sumAcc >= sumGood && sumAcc >= sumVgood) {
                classlabelTruth.add("acc");
            } else if (sumUnAcc >= sumAcc && sumUnAcc >= sumGood && sumUnAcc >= sumVgood) {
                classlabelTruth.add("unacc");
            } else if (sumGood >= sumAcc && sumGood >= sumUnAcc && sumGood >= sumVgood) {
                classlabelTruth.add("good");
            } else if (sumVgood >= sumAcc && sumVgood >= sumGood && sumVgood >= sumUnAcc) {
                classlabelTruth.add("vgood");
            }
            good1 = 0;
            vgood1 = 0;
            acc1 = 0;
            unacc1 = 0;
            good2 = 0;
            vgood2 = 0;
            acc2 = 0;
            unacc2 = 0;
            good3 = 0;
            vgood3 = 0;
            acc3 = 0;
            unacc3 = 0;
            good4 = 0;
            vgood4 = 0;
            acc4 = 0;
            unacc4 = 0;
            good5 = 0;
            vgood5 = 0;
            acc5 = 0;
            unacc5 = 0;
            good6 = 0;
            vgood6 = 0;
            acc6 = 0;
            unacc6 = 0;

        }
        
        
        for (int i = 0; i < classlabelTruth.size(); i++) {
            System.out.println("classLabel  " + classlabelTruth.get(i));

        }

        RandomAccessFile file3 = new RandomAccessFile("Car_validation_truth.txt", "rw");
        text = file3.readLine();
        while (text != null) {
            truthFile.add(text);
            text = file3.readLine();

        }
    
        double truee = 0;
        for (int i = 0; i < truthFile.size(); i++) {
            if (truthFile.get(i).equals(classlabelTruth.get(i))) {

               truee++;
            } 
        }

        double accuracy = truee / (double) classlabelTruth.size();
        System.out.println(" ============================ accuracy ======================================");
        System.out.println(" " + accuracy * 100+"%");

    }
}
