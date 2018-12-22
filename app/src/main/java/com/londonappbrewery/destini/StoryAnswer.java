package com.londonappbrewery.destini;

public class StoryAnswer {
    int mstoryid,mtopid, mbottomid;

    public StoryAnswer(int mstoryid, int mtopid, int mbottomid) {
        this.mstoryid = mstoryid;
        this.mtopid = mtopid;
        this.mbottomid = mbottomid;
    }

    public int getMstoryid() {
        return mstoryid;
    }

    public void setMstoryid(int mstoryid) {
        this.mstoryid = mstoryid;
    }

    public int getMtopid() {
        return mtopid;
    }

    public void setMtopid(int mtopid) {
        this.mtopid = mtopid;
    }

    public int getMbottomid() {
        return mbottomid;
    }

    public void setMbottomid(int mbottomid) {
        this.mbottomid = mbottomid;
    }
}
