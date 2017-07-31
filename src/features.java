
public class features {
    private int att1;
    private int att2;
    private int att3;
    private int att4;
    private int att5;
    private int att6;
    private String classLabel;

    public features(int _1,int _2, int _3 , int _4 , int _5 , int _6 , String cl) {
        att1 = _1;
        att2 = _2;
        att3 = _3;
        att4 = _4;
        att5 = _5;
        att6 = _6;
        classLabel = cl ;
    }

    features() {
         att1 = 0;
        att2 = 0;
        att3 = 0;
        att4 = 0;
        att5 = 0;
        att6 = 0;
        classLabel = "" ;
    }

    
    /**
     * @return the att1
     */
    public int getAtt1() {
        return att1;
    }

    /**
     * @param att1 the att1 to set
     */
    public void setAtt1(int att1) {
        this.att1 = att1;
    }

    /**
     * @return the att2
     */
    public int getAtt2() {
        return att2;
    }

    /**
     * @param att2 the att2 to set
     */
    public void setAtt2(int att2) {
        this.att2 = att2;
    }

    /**
     * @return the att3
     */
    public int getAtt3() {
        return att3;
    }

    /**
     * @param att3 the att3 to set
     */
    public void setAtt3(int att3) {
        this.att3 = att3;
    }

    /**
     * @return the att4
     */
    public int getAtt4() {
        return att4;
    }

    /**
     * @param att4 the att4 to set
     */
    public void setAtt4(int att4) {
        this.att4 = att4;
    }

    /**
     * @return the att5
     */
    public int getAtt5() {
        return att5;
    }

    /**
     * @param att5 the att5 to set
     */
    public void setAtt5(int att5) {
        this.att5 = att5;
    }

    /**
     * @return the att6
     */
    public int getAtt6() {
        return att6;
    }

    /**
     * @param att6 the att6 to set
     */
    public void setAtt6(int att6) {
        this.att6 = att6;
    }

    /**
     * @return the classLabel
     */
    public String getClassLabel() {
        return classLabel;
    }

    /**
     * @param classLabel the classLabel to set
     */
    public void setClassLabel(String classLabel) {
        this.classLabel = classLabel;
    }
}
