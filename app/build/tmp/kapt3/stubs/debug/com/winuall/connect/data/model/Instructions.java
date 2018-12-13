package com.winuall.connect.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000fH\u00c6\u0003J\t\u0010(\u001a\u00020\u000fH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0001H\u00c6\u0003J\t\u0010.\u001a\u00020\u0001H\u00c6\u0003J\t\u0010/\u001a\u00020\u0001H\u00c6\u0003J\t\u00100\u001a\u00020\u0001H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\u0091\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u000fH\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!\u00a8\u00068"}, d2 = {"Lcom/winuall/connect/data/model/Instructions;", "", "multiNegativeMarks", "", "multiPositiveMarks", "numericNegativeMarks", "numericPositiveMarks", "passageNegativeMarks", "passagePositiveMarks", "singleNegativeMarks", "singlePositiveMarks", "syllabus", "", "Lcom/winuall/connect/data/model/Syllabu;", "totalMcq", "", "totalNumeric", "totalPassage", "totalQuestions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;IIII)V", "getMultiNegativeMarks", "()Ljava/lang/String;", "getMultiPositiveMarks", "getNumericNegativeMarks", "getNumericPositiveMarks", "getPassageNegativeMarks", "()Ljava/lang/Object;", "getPassagePositiveMarks", "getSingleNegativeMarks", "getSinglePositiveMarks", "getSyllabus", "()Ljava/util/List;", "getTotalMcq", "()I", "getTotalNumeric", "getTotalPassage", "getTotalQuestions", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Instructions {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "multi_negative_marks")
    private final java.lang.String multiNegativeMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "multi_positive_marks")
    private final java.lang.String multiPositiveMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "numeric_negative_marks")
    private final java.lang.String numericNegativeMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "numeric_positive_marks")
    private final java.lang.String numericPositiveMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "passage_negative_marks")
    private final java.lang.Object passageNegativeMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "passage_positive_marks")
    private final java.lang.Object passagePositiveMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "single_negative_marks")
    private final java.lang.Object singleNegativeMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "single_positive_marks")
    private final java.lang.Object singlePositiveMarks = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "syllabus")
    private final java.util.List<com.winuall.connect.data.model.Syllabu> syllabus = null;
    @com.google.gson.annotations.SerializedName(value = "total_mcq")
    private final int totalMcq = 0;
    @com.google.gson.annotations.SerializedName(value = "total_numeric")
    private final int totalNumeric = 0;
    @com.google.gson.annotations.SerializedName(value = "total_passage")
    private final int totalPassage = 0;
    @com.google.gson.annotations.SerializedName(value = "total_questions")
    private final int totalQuestions = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMultiNegativeMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMultiPositiveMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumericNegativeMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumericPositiveMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPassageNegativeMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPassagePositiveMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSingleNegativeMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSinglePositiveMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.winuall.connect.data.model.Syllabu> getSyllabus() {
        return null;
    }
    
    public final int getTotalMcq() {
        return 0;
    }
    
    public final int getTotalNumeric() {
        return 0;
    }
    
    public final int getTotalPassage() {
        return 0;
    }
    
    public final int getTotalQuestions() {
        return 0;
    }
    
    public Instructions(@org.jetbrains.annotations.NotNull()
    java.lang.String multiNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.String multiPositiveMarks, @org.jetbrains.annotations.NotNull()
    java.lang.String numericNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.String numericPositiveMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object passageNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object passagePositiveMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object singleNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object singlePositiveMarks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.winuall.connect.data.model.Syllabu> syllabus, int totalMcq, int totalNumeric, int totalPassage, int totalQuestions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.winuall.connect.data.model.Syllabu> component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.winuall.connect.data.model.Instructions copy(@org.jetbrains.annotations.NotNull()
    java.lang.String multiNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.String multiPositiveMarks, @org.jetbrains.annotations.NotNull()
    java.lang.String numericNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.String numericPositiveMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object passageNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object passagePositiveMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object singleNegativeMarks, @org.jetbrains.annotations.NotNull()
    java.lang.Object singlePositiveMarks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.winuall.connect.data.model.Syllabu> syllabus, int totalMcq, int totalNumeric, int totalPassage, int totalQuestions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}