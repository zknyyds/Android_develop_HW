package com.example.hw4.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class dataBean {

    private WebTransDTO web_trans;
    private BlngSentsPartDTO blng_sents_part;
    private CeDTO ce;
    private WuguanghuaDTO wuguanghua;
    private CeNewDTO ce_new;
    private SimpleDTO simple;
    private MediaSentsPartDTO media_sents_part;
    private String input;
    private BaikeDTO baike;
    private MetaDTO meta;
    private String le;
    private String lang;
    private NewhhDTO newhh;

    public WebTransDTO getWeb_trans() {
        return web_trans;
    }

    public void setWeb_trans(WebTransDTO web_trans) {
        this.web_trans = web_trans;
    }

    public BlngSentsPartDTO getBlng_sents_part() {
        return blng_sents_part;
    }

    public void setBlng_sents_part(BlngSentsPartDTO blng_sents_part) {
        this.blng_sents_part = blng_sents_part;
    }

    public CeDTO getCe() {
        return ce;
    }

    public void setCe(CeDTO ce) {
        this.ce = ce;
    }

    public WuguanghuaDTO getWuguanghua() {
        return wuguanghua;
    }

    public void setWuguanghua(WuguanghuaDTO wuguanghua) {
        this.wuguanghua = wuguanghua;
    }

    public CeNewDTO getCe_new() {
        return ce_new;
    }

    public void setCe_new(CeNewDTO ce_new) {
        this.ce_new = ce_new;
    }

    public SimpleDTO getSimple() {
        return simple;
    }

    public void setSimple(SimpleDTO simple) {
        this.simple = simple;
    }

    public MediaSentsPartDTO getMedia_sents_part() {
        return media_sents_part;
    }

    public void setMedia_sents_part(MediaSentsPartDTO media_sents_part) {
        this.media_sents_part = media_sents_part;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public BaikeDTO getBaike() {
        return baike;
    }

    public void setBaike(BaikeDTO baike) {
        this.baike = baike;
    }

    public MetaDTO getMeta() {
        return meta;
    }

    public void setMeta(MetaDTO meta) {
        this.meta = meta;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public NewhhDTO getNewhh() {
        return newhh;
    }

    public void setNewhh(NewhhDTO newhh) {
        this.newhh = newhh;
    }

    public static class WebTransDTO {
        @SerializedName("web-translation")
        private List<WebtranslationDTO> webtranslation;

        public List<WebtranslationDTO> getWebtranslation() {
            return webtranslation;
        }

        public void setWebtranslation(List<WebtranslationDTO> webtranslation) {
            this.webtranslation = webtranslation;
        }

        public static class WebtranslationDTO {
            @SerializedName("@same")
            private String _$Same136;// FIXME check this code
            private String key;
            private List<TransDTO> trans;

            public String get_$Same136() {
                return _$Same136;
            }

            public void set_$Same136(String _$Same136) {
                this._$Same136 = _$Same136;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public List<TransDTO> getTrans() {
                return trans;
            }

            public void setTrans(List<TransDTO> trans) {
                this.trans = trans;
            }

            public static class TransDTO {
                private SummaryDTO summary;
                private String value;
                private int support;
                private String url;

                public SummaryDTO getSummary() {
                    return summary;
                }

                public void setSummary(SummaryDTO summary) {
                    this.summary = summary;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public int getSupport() {
                    return support;
                }

                public void setSupport(int support) {
                    this.support = support;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class SummaryDTO {
                    private List<String> line;

                    public List<String> getLine() {
                        return line;
                    }

                    public void setLine(List<String> line) {
                        this.line = line;
                    }
                }
            }
        }
    }

    public static class BlngSentsPartDTO {
        @SerializedName("sentence-count")
        private int sentencecount;
        @SerializedName("sentence-pair")
        private List<SentencepairDTO> sentencepair;
        private String more;
        @SerializedName("trs-classify")
        private List<TrsclassifyDTO> trsclassify;

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentencepairDTO> getSentencepair() {
            return sentencepair;
        }

        public void setSentencepair(List<SentencepairDTO> sentencepair) {
            this.sentencepair = sentencepair;
        }

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public List<TrsclassifyDTO> getTrsclassify() {
            return trsclassify;
        }

        public void setTrsclassify(List<TrsclassifyDTO> trsclassify) {
            this.trsclassify = trsclassify;
        }

        public static class SentencepairDTO {
            private String sentence;
            @SerializedName("sentence-translation-speech")
            private String sentencetranslationspeech;
            @SerializedName("sentence-eng")
            private String sentenceeng;
            @SerializedName("sentence-translation")
            private String sentencetranslation;
            @SerializedName("speech-size")
            private String speechsize;
            @SerializedName("aligned-words")
            private AlignedwordsDTO alignedwords;
            private String source;
            private String url;

            public String getSentence() {
                return sentence;
            }

            public void setSentence(String sentence) {
                this.sentence = sentence;
            }

            public String getSentencetranslationspeech() {
                return sentencetranslationspeech;
            }

            public void setSentencetranslationspeech(String sentencetranslationspeech) {
                this.sentencetranslationspeech = sentencetranslationspeech;
            }

            public String getSentenceeng() {
                return sentenceeng;
            }

            public void setSentenceeng(String sentenceeng) {
                this.sentenceeng = sentenceeng;
            }

            public String getSentencetranslation() {
                return sentencetranslation;
            }

            public void setSentencetranslation(String sentencetranslation) {
                this.sentencetranslation = sentencetranslation;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public AlignedwordsDTO getAlignedwords() {
                return alignedwords;
            }

            public void setAlignedwords(AlignedwordsDTO alignedwords) {
                this.alignedwords = alignedwords;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class AlignedwordsDTO {
                private SrcDTO src;
                private TranDTO tran;

                public SrcDTO getSrc() {
                    return src;
                }

                public void setSrc(SrcDTO src) {
                    this.src = src;
                }

                public TranDTO getTran() {
                    return tran;
                }

                public void setTran(TranDTO tran) {
                    this.tran = tran;
                }

                public static class SrcDTO {
                    private List<CharsDTO> chars;

                    public List<CharsDTO> getChars() {
                        return chars;
                    }

                    public void setChars(List<CharsDTO> chars) {
                        this.chars = chars;
                    }

                    public static class CharsDTO {
                        @SerializedName("@s")
                        private String _$S274;// FIXME check this code
                        @SerializedName("@e")
                        private String _$E62;// FIXME check this code
                        private AlignsDTO aligns;
                        @SerializedName("@id")
                        private String _$Id331;// FIXME check this code

                        public String get_$S274() {
                            return _$S274;
                        }

                        public void set_$S274(String _$S274) {
                            this._$S274 = _$S274;
                        }

                        public String get_$E62() {
                            return _$E62;
                        }

                        public void set_$E62(String _$E62) {
                            this._$E62 = _$E62;
                        }

                        public AlignsDTO getAligns() {
                            return aligns;
                        }

                        public void setAligns(AlignsDTO aligns) {
                            this.aligns = aligns;
                        }

                        public String get_$Id331() {
                            return _$Id331;
                        }

                        public void set_$Id331(String _$Id331) {
                            this._$Id331 = _$Id331;
                        }

                        public static class AlignsDTO {
                            private List<ScDTO> sc;
                            private List<TcDTO> tc;

                            public List<ScDTO> getSc() {
                                return sc;
                            }

                            public void setSc(List<ScDTO> sc) {
                                this.sc = sc;
                            }

                            public List<TcDTO> getTc() {
                                return tc;
                            }

                            public void setTc(List<TcDTO> tc) {
                                this.tc = tc;
                            }

                            public static class ScDTO {
                                @SerializedName("@id")
                                private String _$Id171;// FIXME check this code

                                public String get_$Id171() {
                                    return _$Id171;
                                }

                                public void set_$Id171(String _$Id171) {
                                    this._$Id171 = _$Id171;
                                }
                            }

                            public static class TcDTO {
                                @SerializedName("@id")
                                private String _$Id144;// FIXME check this code

                                public String get_$Id144() {
                                    return _$Id144;
                                }

                                public void set_$Id144(String _$Id144) {
                                    this._$Id144 = _$Id144;
                                }
                            }
                        }
                    }
                }

                public static class TranDTO {
                    private List<CharsDTO> chars;

                    public List<CharsDTO> getChars() {
                        return chars;
                    }

                    public void setChars(List<CharsDTO> chars) {
                        this.chars = chars;
                    }

                    public static class CharsDTO {
                        @SerializedName("@s")
                        private String _$S268;// FIXME check this code
                        @SerializedName("@e")
                        private String _$E127;// FIXME check this code
                        private AlignsDTO aligns;
                        @SerializedName("@id")
                        private String _$Id111;// FIXME check this code

                        public String get_$S268() {
                            return _$S268;
                        }

                        public void set_$S268(String _$S268) {
                            this._$S268 = _$S268;
                        }

                        public String get_$E127() {
                            return _$E127;
                        }

                        public void set_$E127(String _$E127) {
                            this._$E127 = _$E127;
                        }

                        public AlignsDTO getAligns() {
                            return aligns;
                        }

                        public void setAligns(AlignsDTO aligns) {
                            this.aligns = aligns;
                        }

                        public String get_$Id111() {
                            return _$Id111;
                        }

                        public void set_$Id111(String _$Id111) {
                            this._$Id111 = _$Id111;
                        }

                        public static class AlignsDTO {
                            private List<ScDTO> sc;
                            private List<TcDTO> tc;

                            public List<ScDTO> getSc() {
                                return sc;
                            }

                            public void setSc(List<ScDTO> sc) {
                                this.sc = sc;
                            }

                            public List<TcDTO> getTc() {
                                return tc;
                            }

                            public void setTc(List<TcDTO> tc) {
                                this.tc = tc;
                            }

                            public static class ScDTO {
                                @SerializedName("@id")
                                private String _$Id116;// FIXME check this code

                                public String get_$Id116() {
                                    return _$Id116;
                                }

                                public void set_$Id116(String _$Id116) {
                                    this._$Id116 = _$Id116;
                                }
                            }

                            public static class TcDTO {
                                @SerializedName("@id")
                                private String _$Id205;// FIXME check this code

                                public String get_$Id205() {
                                    return _$Id205;
                                }

                                public void set_$Id205(String _$Id205) {
                                    this._$Id205 = _$Id205;
                                }
                            }
                        }
                    }
                }
            }
        }

        public static class TrsclassifyDTO {
            private String proportion;
            private String tr;

            public String getProportion() {
                return proportion;
            }

            public void setProportion(String proportion) {
                this.proportion = proportion;
            }

            public String getTr() {
                return tr;
            }

            public void setTr(String tr) {
                this.tr = tr;
            }
        }
    }

    public static class CeDTO {
        private SourceDTO source;
        private List<WordDTO> word;

        public SourceDTO getSource() {
            return source;
        }

        public void setSource(SourceDTO source) {
            this.source = source;
        }

        public List<WordDTO> getWord() {
            return word;
        }

        public void setWord(List<WordDTO> word) {
            this.word = word;
        }

        public static class SourceDTO {
            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class WordDTO {
            private List<TrsDTO> trs;
            private String phone;
            @SerializedName("return-phrase")
            private ReturnphraseDTO returnphrase;

            public List<TrsDTO> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsDTO> trs) {
                this.trs = trs;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public ReturnphraseDTO getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseDTO returnphrase) {
                this.returnphrase = returnphrase;
            }

            public static class ReturnphraseDTO {
                private LDTO l;

                public LDTO getL() {
                    return l;
                }

                public void setL(LDTO l) {
                    this.l = l;
                }

                public static class LDTO {
                    private String i;

                    public String getI() {
                        return i;
                    }

                    public void setI(String i) {
                        this.i = i;
                    }
                }
            }

            public static class TrsDTO {
                private List<TrDTO> tr;

                public List<TrDTO> getTr() {
                    return tr;
                }

                public void setTr(List<TrDTO> tr) {
                    this.tr = tr;
                }

                public static class TrDTO {
                    private LDTO l;

                    public LDTO getL() {
                        return l;
                    }

                    public void setL(LDTO l) {
                        this.l = l;
                    }

                    public static class LDTO {
                        private String pos;
                        private List<String> i;
                        @SerializedName("#tran")
                        private String _$Tran74;// FIXME check this code

                        public String getPos() {
                            return pos;
                        }

                        public void setPos(String pos) {
                            this.pos = pos;
                        }

                        public List<String> getI() {
                            return i;
                        }

                        public void setI(List<String> i) {
                            this.i = i;
                        }

                        public String get_$Tran74() {
                            return _$Tran74;
                        }

                        public void set_$Tran74(String _$Tran74) {
                            this._$Tran74 = _$Tran74;
                        }
                    }
                }
            }
        }
    }

    public static class WuguanghuaDTO {
        private List<DataListDTO> dataList;
        private SourceDTO source;
        private String word;

        public List<DataListDTO> getDataList() {
            return dataList;
        }

        public void setDataList(List<DataListDTO> dataList) {
            this.dataList = dataList;
        }

        public SourceDTO getSource() {
            return source;
        }

        public void setSource(SourceDTO source) {
            this.source = source;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public static class SourceDTO {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class DataListDTO {
            private List<TrsDTO> trs;
            private String phone;

            public List<TrsDTO> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsDTO> trs) {
                this.trs = trs;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public static class TrsDTO {
                private String pos;
                private TrDTO tr;
                private List<SentsDTO> sents;
                private String rhetoric;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public TrDTO getTr() {
                    return tr;
                }

                public void setTr(TrDTO tr) {
                    this.tr = tr;
                }

                public List<SentsDTO> getSents() {
                    return sents;
                }

                public void setSents(List<SentsDTO> sents) {
                    this.sents = sents;
                }

                public String getRhetoric() {
                    return rhetoric;
                }

                public void setRhetoric(String rhetoric) {
                    this.rhetoric = rhetoric;
                }

                public static class TrDTO {
                    private String en;
                    private String cn;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getCn() {
                        return cn;
                    }

                    public void setCn(String cn) {
                        this.cn = cn;
                    }
                }

                public static class SentsDTO {
                    private String en;
                    private String cn;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getCn() {
                        return cn;
                    }

                    public void setCn(String cn) {
                        this.cn = cn;
                    }
                }
            }
        }
    }

    public static class CeNewDTO {
        private SourceDTO source;
        private List<WordDTO> word;

        public SourceDTO getSource() {
            return source;
        }

        public void setSource(SourceDTO source) {
            this.source = source;
        }

        public List<WordDTO> getWord() {
            return word;
        }

        public void setWord(List<WordDTO> word) {
            this.word = word;
        }

        public static class SourceDTO {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class WordDTO {
            private List<TrsDTO> trs;
            private String phone;
            @SerializedName("return-phrase")
            private ReturnphraseDTO returnphrase;

            public List<TrsDTO> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsDTO> trs) {
                this.trs = trs;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public ReturnphraseDTO getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseDTO returnphrase) {
                this.returnphrase = returnphrase;
            }

            public static class ReturnphraseDTO {
                private LDTO l;

                public LDTO getL() {
                    return l;
                }

                public void setL(LDTO l) {
                    this.l = l;
                }

                public static class LDTO {
                    private List<String> i;

                    public List<String> getI() {
                        return i;
                    }

                    public void setI(List<String> i) {
                        this.i = i;
                    }
                }
            }

            public static class TrsDTO {
                private String pos;
                private List<TrDTO> tr;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public List<TrDTO> getTr() {
                    return tr;
                }

                public void setTr(List<TrDTO> tr) {
                    this.tr = tr;
                }

                public static class TrDTO {
                    private List<ExamDTO> exam;
                    private LDTO l;

                    public List<ExamDTO> getExam() {
                        return exam;
                    }

                    public void setExam(List<ExamDTO> exam) {
                        this.exam = exam;
                    }

                    public LDTO getL() {
                        return l;
                    }

                    public void setL(LDTO l) {
                        this.l = l;
                    }

                    public static class LDTO {
                        private List<String> i;

                        public List<String> getI() {
                            return i;
                        }

                        public void setI(List<String> i) {
                            this.i = i;
                        }
                    }

                    public static class ExamDTO {
                        private IDTO i;

                        public IDTO getI() {
                            return i;
                        }

                        public void setI(IDTO i) {
                            this.i = i;
                        }

                        public static class IDTO {
                            private FDTO f;
                            private NDTO n;

                            public FDTO getF() {
                                return f;
                            }

                            public void setF(FDTO f) {
                                this.f = f;
                            }

                            public NDTO getN() {
                                return n;
                            }

                            public void setN(NDTO n) {
                                this.n = n;
                            }

                            public static class FDTO {
                                private LDTO l;

                                public LDTO getL() {
                                    return l;
                                }

                                public void setL(LDTO l) {
                                    this.l = l;
                                }

                                public static class LDTO {
                                    private String i;

                                    public String getI() {
                                        return i;
                                    }

                                    public void setI(String i) {
                                        this.i = i;
                                    }
                                }
                            }

                            public static class NDTO {
                                private LDTO l;

                                public LDTO getL() {
                                    return l;
                                }

                                public void setL(LDTO l) {
                                    this.l = l;
                                }

                                public static class LDTO {
                                    private String i;

                                    public String getI() {
                                        return i;
                                    }

                                    public void setI(String i) {
                                        this.i = i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class SimpleDTO {
        private String query;
        private List<WordDTO> word;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public List<WordDTO> getWord() {
            return word;
        }

        public void setWord(List<WordDTO> word) {
            this.word = word;
        }

        public static class WordDTO {
            private String phone;
            @SerializedName("return-phrase")
            private String returnphrase;

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(String returnphrase) {
                this.returnphrase = returnphrase;
            }
        }
    }

    public static class MediaSentsPartDTO {
        private String query;
        private List<SentDTO> sent;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public List<SentDTO> getSent() {
            return sent;
        }

        public void setSent(List<SentDTO> sent) {
            this.sent = sent;
        }

        public static class SentDTO {
            @SerializedName("@mediatype")
            private String _$Mediatype281;// FIXME check this code
            private SnippetsDTO snippets;
            private String chn;
            private String eng;

            public String get_$Mediatype281() {
                return _$Mediatype281;
            }

            public void set_$Mediatype281(String _$Mediatype281) {
                this._$Mediatype281 = _$Mediatype281;
            }

            public SnippetsDTO getSnippets() {
                return snippets;
            }

            public void setSnippets(SnippetsDTO snippets) {
                this.snippets = snippets;
            }

            public String getChn() {
                return chn;
            }

            public void setChn(String chn) {
                this.chn = chn;
            }

            public String getEng() {
                return eng;
            }

            public void setEng(String eng) {
                this.eng = eng;
            }

            public static class SnippetsDTO {
                private List<SnippetDTO> snippet;

                public List<SnippetDTO> getSnippet() {
                    return snippet;
                }

                public void setSnippet(List<SnippetDTO> snippet) {
                    this.snippet = snippet;
                }

                public static class SnippetDTO {
                    private String sourceUrl;
                    private String streamUrl;
                    private String swf;
                    private String imageUrl;
                    private String name;
                    private String source;

                    public String getSourceUrl() {
                        return sourceUrl;
                    }

                    public void setSourceUrl(String sourceUrl) {
                        this.sourceUrl = sourceUrl;
                    }

                    public String getStreamUrl() {
                        return streamUrl;
                    }

                    public void setStreamUrl(String streamUrl) {
                        this.streamUrl = streamUrl;
                    }

                    public String getSwf() {
                        return swf;
                    }

                    public void setSwf(String swf) {
                        this.swf = swf;
                    }

                    public String getImageUrl() {
                        return imageUrl;
                    }

                    public void setImageUrl(String imageUrl) {
                        this.imageUrl = imageUrl;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }
                }
            }
        }
    }

    public static class BaikeDTO {
        private List<SummarysDTO> summarys;
        private SourceDTO source;

        public List<SummarysDTO> getSummarys() {
            return summarys;
        }

        public void setSummarys(List<SummarysDTO> summarys) {
            this.summarys = summarys;
        }

        public SourceDTO getSource() {
            return source;
        }

        public void setSource(SourceDTO source) {
            this.source = source;
        }

        public static class SourceDTO {
            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class SummarysDTO {
            private String summary;
            private String image;
            private String key;

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }
        }
    }

    public static class MetaDTO {
        private String input;
        private String guessLanguage;
        private String isHasSimpleDict;
        private String le;
        private String lang;
        private List<String> dicts;

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }

        public String getGuessLanguage() {
            return guessLanguage;
        }

        public void setGuessLanguage(String guessLanguage) {
            this.guessLanguage = guessLanguage;
        }

        public String getIsHasSimpleDict() {
            return isHasSimpleDict;
        }

        public void setIsHasSimpleDict(String isHasSimpleDict) {
            this.isHasSimpleDict = isHasSimpleDict;
        }

        public String getLe() {
            return le;
        }

        public void setLe(String le) {
            this.le = le;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public List<String> getDicts() {
            return dicts;
        }

        public void setDicts(List<String> dicts) {
            this.dicts = dicts;
        }
    }

    public static class NewhhDTO {
        private List<DataListDTO> dataList;
        private SourceDTO source;
        private String word;

        public List<DataListDTO> getDataList() {
            return dataList;
        }

        public void setDataList(List<DataListDTO> dataList) {
            this.dataList = dataList;
        }

        public SourceDTO getSource() {
            return source;
        }

        public void setSource(SourceDTO source) {
            this.source = source;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public static class SourceDTO {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class DataListDTO {
            private String pinyin;
            private List<SenseDTO> sense;
            private String word;

            public String getPinyin() {
                return pinyin;
            }

            public void setPinyin(String pinyin) {
                this.pinyin = pinyin;
            }

            public List<SenseDTO> getSense() {
                return sense;
            }

            public void setSense(List<SenseDTO> sense) {
                this.sense = sense;
            }

            public String getWord() {
                return word;
            }

            public void setWord(String word) {
                this.word = word;
            }

            public static class SenseDTO {
                private List<String> examples;
                private List<String> def;
                private String cat;

                public List<String> getExamples() {
                    return examples;
                }

                public void setExamples(List<String> examples) {
                    this.examples = examples;
                }

                public List<String> getDef() {
                    return def;
                }

                public void setDef(List<String> def) {
                    this.def = def;
                }

                public String getCat() {
                    return cat;
                }

                public void setCat(String cat) {
                    this.cat = cat;
                }
            }
        }
    }
}
