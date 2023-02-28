package com.benefitj.minio;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取文件对应的类型
 */
public class ContentType {

  public static String get(String suffix) {
    if (StringUtils.isBlank(suffix)) {
      return "application/octet-stream";
    }
    return types.getOrDefault("." + suffix.substring(suffix.lastIndexOf(".") + 1), "application/octet-stream");
  }

  private static final Map<String, String> types = new HashMap<>();

  static {
    types.put(".load", "text/html");
    types.put(".123", "application/vnd.lotus-1-2-3");
    types.put(".3ds", "image/x-3ds");
    types.put(".3g2", "video/3gpp");
    types.put(".3ga", "video/3gpp");
    types.put(".3gp", "video/3gpp");
    types.put(".3gpp", "video/3gpp");
    types.put(".602", "application/x-t602");
    types.put(".669", "audio/x-mod");
    types.put(".7z", "application/x-7z-compressed");
    types.put(".a", "application/x-archive");
    types.put(".aac", "audio/mp4");
    types.put(".abw", "application/x-abiword");
    types.put(".abw.crashed", "application/x-abiword");
    types.put(".abw.gz", "application/x-abiword");
    types.put(".ac3", "audio/ac3");
    types.put(".ace", "application/x-ace");
    types.put(".adb", "text/x-adasrc");
    types.put(".ads", "text/x-adasrc");
    types.put(".afm", "application/x-font-afm");
    types.put(".ag", "image/x-applix-graphics");
    types.put(".ai", "application/illustrator");
    types.put(".aif", "audio/x-aiff");
    types.put(".aifc", "audio/x-aiff");
    types.put(".aiff", "audio/x-aiff");
    types.put(".al", "application/x-perl");
    types.put(".alz", "application/x-alz");
    types.put(".amr", "audio/amr");
    types.put(".ani", "application/x-navi-animation");
    types.put(".anim[1-9j]", "video/x-anim");
    types.put(".anx", "application/annodex");
    types.put(".ape", "audio/x-ape");
    types.put(".arj", "application/x-arj");
    types.put(".arw", "image/x-sony-arw");
    types.put(".as", "application/x-applix-spreadsheet");
    types.put(".asc", "text/plain");
    types.put(".asf", "video/x-ms-asf");
    types.put(".asp", "application/x-asp");
    types.put(".ass", "text/x-ssa");
    types.put(".asx", "audio/x-ms-asx");
    types.put(".atom", "application/atom+xml");
    types.put(".au", "audio/basic");
    types.put(".avi", "video/x-msvideo");
    types.put(".aw", "application/x-applix-word");
    types.put(".awb", "audio/amr-wb");
    types.put(".awk", "application/x-awk");
    types.put(".axa", "audio/annodex");
    types.put(".axv", "video/annodex");
    types.put(".bak", "application/x-trash");
    types.put(".bcpio", "application/x-bcpio");
    types.put(".bdf", "application/x-font-bdf");
    types.put(".bib", "text/x-bibtex");
    types.put(".bin", "application/octet-stream");
    types.put(".blend", "application/x-blender");
    types.put(".blender", "application/x-blender");
    types.put(".bmp", "image/bmp");
    types.put(".bz", "application/x-bzip");
    types.put(".bz2", "application/x-bzip");
    types.put(".c", "text/x-csrc");
    types.put(".c++", "text/x-c++src");
    types.put(".cab", "application/vnd.ms-cab-compressed");
    types.put(".cb7", "application/x-cb7");
    types.put(".cbr", "application/x-cbr");
    types.put(".cbt", "application/x-cbt");
    types.put(".cbz", "application/x-cbz");
    types.put(".cc", "text/x-c++src");
    types.put(".cdf", "application/x-netcdf");
    types.put(".cdr", "application/vnd.corel-draw");
    types.put(".cer", "application/x-x509-ca-cert");
    types.put(".cert", "application/x-x509-ca-cert");
    types.put(".cgm", "image/cgm");
    types.put(".chm", "application/x-chm");
    types.put(".chrt", "application/x-kchart");
    types.put(".class", "application/x-java");
    types.put(".cls", "text/x-tex");
    types.put(".cmake", "text/x-cmake");
    types.put(".cpio", "application/x-cpio");
    types.put(".cpio.gz", "application/x-cpio-compressed");
    types.put(".cpp", "text/x-c++src");
    types.put(".cr2", "image/x-canon-cr2");
    types.put(".crt", "application/x-x509-ca-cert");
    types.put(".crw", "image/x-canon-crw");
    types.put(".cs", "text/x-csharp");
    types.put(".csh", "application/x-csh");
    types.put(".css", "text/css");
    types.put(".cssl", "text/css");
    types.put(".csv", "text/csv");
    types.put(".cue", "application/x-cue");
    types.put(".cur", "image/x-win-bitmap");
    types.put(".cxx", "text/x-c++src");
    types.put(".d", "text/x-dsrc");
    types.put(".dar", "application/x-dar");
    types.put(".dbf", "application/x-dbf");
    types.put(".dc", "application/x-dc-rom");
    types.put(".dcl", "text/x-dcl");
    types.put(".dcm", "application/dicom");
    types.put(".dcr", "image/x-kodak-dcr");
    types.put(".dds", "image/x-dds");
    types.put(".deb", "application/x-deb");
    types.put(".der", "application/x-x509-ca-cert");
    types.put(".desktop", "application/x-desktop");
    types.put(".dia", "application/x-dia-diagram");
    types.put(".diff", "text/x-patch");
    types.put(".divx", "video/x-msvideo");
    types.put(".djv", "image/vnd.djvu");
    types.put(".djvu", "image/vnd.djvu");
    types.put(".dng", "image/x-adobe-dng");
    types.put(".doc", "application/msword");
    types.put(".docbook", "application/docbook+xml");
    types.put(".docm", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    types.put(".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    types.put(".dot", "text/vnd.graphviz");
    types.put(".dsl", "text/x-dsl");
    types.put(".dtd", "application/xml-dtd");
    types.put(".dtx", "text/x-tex");
    types.put(".dv", "video/dv");
    types.put(".dvi", "application/x-dvi");
    types.put(".dvi.bz2", "application/x-bzdvi");
    types.put(".dvi.gz", "application/x-gzdvi");
    types.put(".dwg", "image/vnd.dwg");
    types.put(".dxf", "image/vnd.dxf");
    types.put(".e", "text/x-eiffel");
    types.put(".egon", "application/x-egon");
    types.put(".eif", "text/x-eiffel");
    types.put(".el", "text/x-emacs-lisp");
    types.put(".emf", "image/x-emf");
    types.put(".emp", "application/vnd.emusic-emusic_package");
    types.put(".ent", "application/xml-external-parsed-entity");
    types.put(".eps", "image/x-eps");
    types.put(".eps.bz2", "image/x-bzeps");
    types.put(".eps.gz", "image/x-gzeps");
    types.put(".epsf", "image/x-eps");
    types.put(".epsf.bz2", "image/x-bzeps");
    types.put(".epsf.gz", "image/x-gzeps");
    types.put(".epsi", "image/x-eps");
    types.put(".epsi.bz2", "image/x-bzeps");
    types.put(".epsi.gz", "image/x-gzeps");
    types.put(".epub", "application/epub+zip");
    types.put(".erl", "text/x-erlang");
    types.put(".es", "application/ecmascript");
    types.put(".etheme", "application/x-e-theme");
    types.put(".etx", "text/x-setext");
    types.put(".exe", "application/x-ms-dos-executable");
    types.put(".exr", "image/x-exr");
    types.put(".ez", "application/andrew-inset");
    types.put(".f", "text/x-fortran");
    types.put(".f90", "text/x-fortran");
    types.put(".f95", "text/x-fortran");
    types.put(".fb2", "application/x-fictionbook+xml");
    types.put(".fig", "image/x-xfig");
    types.put(".fits", "image/fits");
    types.put(".fl", "application/x-fluid");
    types.put(".flac", "audio/x-flac");
    types.put(".flc", "video/x-flic");
    types.put(".fli", "video/x-flic");
    types.put(".flv", "video/x-flv");
    types.put(".flw", "application/x-kivio");
    types.put(".fo", "text/x-xslfo");
    types.put(".for", "text/x-fortran");
    types.put(".g3", "image/fax-g3");
    types.put(".gb", "application/x-gameboy-rom");
    types.put(".gba", "application/x-gba-rom");
    types.put(".gcrd", "text/directory");
    types.put(".ged", "application/x-gedcom");
    types.put(".gedcom", "application/x-gedcom");
    types.put(".gen", "application/x-genesis-rom");
    types.put(".gf", "application/x-tex-gf");
    types.put(".gg", "application/x-sms-rom");
    types.put(".gif", "image/gif");
    types.put(".glade", "application/x-glade");
    types.put(".gmo", "application/x-gettext-translation");
    types.put(".gnc", "application/x-gnucash");
    types.put(".gnd", "application/gnunet-directory");
    types.put(".gnucash", "application/x-gnucash");
    types.put(".gnumeric", "application/x-gnumeric");
    types.put(".gnuplot", "application/x-gnuplot");
    types.put(".gp", "application/x-gnuplot");
    types.put(".gpg", "application/pgp-encrypted");
    types.put(".gplt", "application/x-gnuplot");
    types.put(".gra", "application/x-graphite");
    types.put(".gsf", "application/x-font-type1");
    types.put(".gsm", "audio/x-gsm");
    types.put(".gtar", "application/x-tar");
    types.put(".gv", "text/vnd.graphviz");
    types.put(".gvp", "text/x-google-video-pointer");
    types.put(".gz", "application/x-gzip");
    types.put(".h", "text/x-chdr");
    types.put(".h++", "text/x-c++hdr");
    types.put(".hdf", "application/x-hdf");
    types.put(".hh", "text/x-c++hdr");
    types.put(".hp", "text/x-c++hdr");
    types.put(".hpgl", "application/vnd.hp-hpgl");
    types.put(".hpp", "text/x-c++hdr");
    types.put(".hs", "text/x-haskell");
    types.put(".htm", "text/html");
    types.put(".html", "text/html");
    types.put(".hwp", "application/x-hwp");
    types.put(".hwt", "application/x-hwt");
    types.put(".hxx", "text/x-c++hdr");
    types.put(".ica", "application/x-ica");
    types.put(".icb", "image/x-tga");
    types.put(".icns", "image/x-icns");
    types.put(".ico", "image/vnd.microsoft.icon");
    types.put(".ics", "text/calendar");
    types.put(".idl", "text/x-idl");
    types.put(".ief", "image/ief");
    types.put(".iff", "image/x-iff");
    types.put(".ilbm", "image/x-ilbm");
    types.put(".ime", "text/x-imelody");
    types.put(".imy", "text/x-imelody");
    types.put(".ins", "text/x-tex");
    types.put(".iptables", "text/x-iptables");
    types.put(".iso", "application/x-cd-image");
    types.put(".iso9660", "application/x-cd-image");
    types.put(".it", "audio/x-it");
    types.put(".j2k", "image/jp2");
    types.put(".jad", "text/vnd.sun.j2me.app-descriptor");
    types.put(".jar", "application/x-java-archive");
    types.put(".java", "text/x-java");
    types.put(".jng", "image/x-jng");
    types.put(".jnlp", "application/x-java-jnlp-file");
    types.put(".jp2", "image/jp2");
    types.put(".jpc", "image/jp2");
    types.put(".jpe", "image/jpeg");
    types.put(".jpeg", "image/jpeg");
    types.put(".jpf", "image/jp2");
    types.put(".jpg", "image/jpeg");
    types.put(".jpr", "application/x-jbuilder-project");
    types.put(".jpx", "image/jp2");
    types.put(".js", "application/javascript");
    types.put(".json", "application/json");
    types.put(".jsonp", "application/jsonp");
    types.put(".k25", "image/x-kodak-k25");
    types.put(".kar", "audio/midi");
    types.put(".karbon", "application/x-karbon");
    types.put(".kdc", "image/x-kodak-kdc");
    types.put(".kdelnk", "application/x-desktop");
    types.put(".kexi", "application/x-kexiproject-sqlite3");
    types.put(".kexic", "application/x-kexi-connectiondata");
    types.put(".kexis", "application/x-kexiproject-shortcut");
    types.put(".kfo", "application/x-kformula");
    types.put(".kil", "application/x-killustrator");
    types.put(".kino", "application/smil");
    types.put(".kml", "application/vnd.google-earth.kml+xml");
    types.put(".kmz", "application/vnd.google-earth.kmz");
    types.put(".kon", "application/x-kontour");
    types.put(".kpm", "application/x-kpovmodeler");
    types.put(".kpr", "application/x-kpresenter");
    types.put(".kpt", "application/x-kpresenter");
    types.put(".kra", "application/x-krita");
    types.put(".ksp", "application/x-kspread");
    types.put(".kud", "application/x-kugar");
    types.put(".kwd", "application/x-kword");
    types.put(".kwt", "application/x-kword");
    types.put(".la", "application/x-shared-library-la");
    types.put(".latex", "text/x-tex");
    types.put(".ldif", "text/x-ldif");
    types.put(".lha", "application/x-lha");
    types.put(".lhs", "text/x-literate-haskell");
    types.put(".lhz", "application/x-lhz");
    types.put(".log", "text/x-log");
    types.put(".ltx", "text/x-tex");
    types.put(".lua", "text/x-lua");
    types.put(".lwo", "image/x-lwo");
    types.put(".lwob", "image/x-lwo");
    types.put(".lws", "image/x-lws");
    types.put(".ly", "text/x-lilypond");
    types.put(".lyx", "application/x-lyx");
    types.put(".lz", "application/x-lzip");
    types.put(".lzh", "application/x-lha");
    types.put(".lzma", "application/x-lzma");
    types.put(".lzo", "application/x-lzop");
    types.put(".m", "text/x-matlab");
    types.put(".m15", "audio/x-mod");
    types.put(".m2t", "video/mpeg");
    types.put(".m3u", "audio/x-mpegurl");
    types.put(".m3u8", "audio/x-mpegurl");
    types.put(".m4", "application/x-m4");
    types.put(".m4a", "audio/mp4");
    types.put(".m4b", "audio/x-m4b");
    types.put(".m4v", "video/mp4");
    types.put(".mab", "application/x-markaby");
    types.put(".man", "application/x-troff-man");
    types.put(".mbox", "application/mbox");
    types.put(".md", "application/x-genesis-rom");
    types.put(".mdb", "application/vnd.ms-access");
    types.put(".mdi", "image/vnd.ms-modi");
    types.put(".me", "text/x-troff-me");
    types.put(".med", "audio/x-mod");
    types.put(".metalink", "application/metalink+xml");
    types.put(".mgp", "application/x-magicpoint");
    types.put(".mid", "audio/midi");
    types.put(".midi", "audio/midi");
    types.put(".mif", "application/x-mif");
    types.put(".minipsf", "audio/x-minipsf");
    types.put(".mka", "audio/x-matroska");
    types.put(".mkv", "video/x-matroska");
    types.put(".ml", "text/x-ocaml");
    types.put(".mli", "text/x-ocaml");
    types.put(".mm", "text/x-troff-mm");
    types.put(".mmf", "application/x-smaf");
    types.put(".mml", "text/mathml");
    types.put(".mng", "video/x-mng");
    types.put(".mo", "application/x-gettext-translation");
    types.put(".mo3", "audio/x-mo3");
    types.put(".moc", "text/x-moc");
    types.put(".mod", "audio/x-mod");
    types.put(".mof", "text/x-mof");
    types.put(".moov", "video/quicktime");
    types.put(".mov", "video/quicktime");
    types.put(".movie", "video/x-sgi-movie");
    types.put(".mp+", "audio/x-musepack");
    types.put(".mp2", "video/mpeg");
    types.put(".mp3", "audio/mpeg");
    types.put(".mp4", "video/mp4");
    types.put(".mpc", "audio/x-musepack");
    types.put(".mpe", "video/mpeg");
    types.put(".mpeg", "video/mpeg");
    types.put(".mpg", "video/mpeg");
    types.put(".mpga", "audio/mpeg");
    types.put(".mpp", "audio/x-musepack");
    types.put(".mrl", "text/x-mrml");
    types.put(".mrml", "text/x-mrml");
    types.put(".mrw", "image/x-minolta-mrw");
    types.put(".ms", "text/x-troff-ms");
    types.put(".msi", "application/x-msi");
    types.put(".msod", "image/x-msod");
    types.put(".msx", "application/x-msx-rom");
    types.put(".mtm", "audio/x-mod");
    types.put(".mup", "text/x-mup");
    types.put(".mxf", "application/mxf");
    types.put(".n64", "application/x-n64-rom");
    types.put(".nb", "application/mathematica");
    types.put(".nc", "application/x-netcdf");
    types.put(".nds", "application/x-nintendo-ds-rom");
    types.put(".nef", "image/x-nikon-nef");
    types.put(".nes", "application/x-nes-rom");
    types.put(".nfo", "text/x-nfo");
    types.put(".not", "text/x-mup");
    types.put(".nsc", "application/x-netshow-channel");
    types.put(".nsv", "video/x-nsv");
    types.put(".o", "application/x-object");
    types.put(".obj", "application/x-tgif");
    types.put(".ocl", "text/x-ocl");
    types.put(".oda", "application/oda");
    types.put(".odb", "application/vnd.oasis.opendocument.database");
    types.put(".odc", "application/vnd.oasis.opendocument.chart");
    types.put(".odf", "application/vnd.oasis.opendocument.formula");
    types.put(".odg", "application/vnd.oasis.opendocument.graphics");
    types.put(".odi", "application/vnd.oasis.opendocument.image");
    types.put(".odm", "application/vnd.oasis.opendocument.text-master");
    types.put(".odp", "application/vnd.oasis.opendocument.presentation");
    types.put(".ods", "application/vnd.oasis.opendocument.spreadsheet");
    types.put(".odt", "application/vnd.oasis.opendocument.text");
    types.put(".oga", "audio/ogg");
    types.put(".ogg", "video/x-theora+ogg");
    types.put(".ogm", "video/x-ogm+ogg");
    types.put(".ogv", "video/ogg");
    types.put(".ogx", "application/ogg");
    types.put(".old", "application/x-trash");
    types.put(".oleo", "application/x-oleo");
    types.put(".opml", "text/x-opml+xml");
    types.put(".ora", "image/openraster");
    types.put(".orf", "image/x-olympus-orf");
    types.put(".otc", "application/vnd.oasis.opendocument.chart-template");
    types.put(".otf", "application/x-font-otf");
    types.put(".otg", "application/vnd.oasis.opendocument.graphics-template");
    types.put(".oth", "application/vnd.oasis.opendocument.text-web");
    types.put(".otp", "application/vnd.oasis.opendocument.presentation-template");
    types.put(".ots", "application/vnd.oasis.opendocument.spreadsheet-template");
    types.put(".ott", "application/vnd.oasis.opendocument.text-template");
    types.put(".owl", "application/rdf+xml");
    types.put(".oxt", "application/vnd.openofficeorg.extension");
    types.put(".p", "text/x-pascal");
    types.put(".p10", "application/pkcs10");
    types.put(".p12", "application/x-pkcs12");
    types.put(".p7b", "application/x-pkcs7-certificates");
    types.put(".p7s", "application/pkcs7-signature");
    types.put(".pack", "application/x-java-pack200");
    types.put(".pak", "application/x-pak");
    types.put(".par2", "application/x-par2");
    types.put(".pas", "text/x-pascal");
    types.put(".patch", "text/x-patch");
    types.put(".pbm", "image/x-portable-bitmap");
    types.put(".pcd", "image/x-photo-cd");
    types.put(".pcf", "application/x-cisco-vpn-settings");
    types.put(".pcf.gz", "application/x-font-pcf");
    types.put(".pcf.z", "application/x-font-pcf");
    types.put(".pcl", "application/vnd.hp-pcl");
    types.put(".pcx", "image/x-pcx");
    types.put(".pdb", "chemical/x-pdb");
    types.put(".pdc", "application/x-aportisdoc");
    types.put(".pdf", "application/pdf");
    types.put(".pdf.bz2", "application/x-bzpdf");
    types.put(".pdf.gz", "application/x-gzpdf");
    types.put(".pef", "image/x-pentax-pef");
    types.put(".pem", "application/x-x509-ca-cert");
    types.put(".perl", "application/x-perl");
    types.put(".pfa", "application/x-font-type1");
    types.put(".pfb", "application/x-font-type1");
    types.put(".pfx", "application/x-pkcs12");
    types.put(".pgm", "image/x-portable-graymap");
    types.put(".pgn", "application/x-chess-pgn");
    types.put(".pgp", "application/pgp-encrypted");
    types.put(".php", "application/x-php");
    types.put(".php3", "application/x-php");
    types.put(".php4", "application/x-php");
    types.put(".pict", "image/x-pict");
    types.put(".pict1", "image/x-pict");
    types.put(".pict2", "image/x-pict");
    types.put(".pickle", "application/python-pickle");
    types.put(".pk", "application/x-tex-pk");
    types.put(".pkipath", "application/pkix-pkipath");
    types.put(".pkr", "application/pgp-keys");
    types.put(".pl", "application/x-perl");
    types.put(".pla", "audio/x-iriver-pla");
    types.put(".pln", "application/x-planperfect");
    types.put(".pls", "audio/x-scpls");
    types.put(".pm", "application/x-perl");
    types.put(".png", "image/png");
    types.put(".pnm", "image/x-portable-anymap");
    types.put(".pntg", "image/x-macpaint");
    types.put(".po", "text/x-gettext-translation");
    types.put(".por", "application/x-spss-por");
    types.put(".pot", "text/x-gettext-translation-template");
    types.put(".ppm", "image/x-portable-pixmap");
    types.put(".pps", "application/vnd.ms-powerpoint");
    types.put(".ppt", "application/vnd.ms-powerpoint");
    types.put(".pptm", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
    types.put(".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
    types.put(".ppz", "application/vnd.ms-powerpoint");
    types.put(".prc", "application/x-palm-database");
    types.put(".ps", "application/postscript");
    types.put(".ps.bz2", "application/x-bzpostscript");
    types.put(".ps.gz", "application/x-gzpostscript");
    types.put(".psd", "image/vnd.adobe.photoshop");
    types.put(".psf", "audio/x-psf");
    types.put(".psf.gz", "application/x-gz-font-linux-psf");
    types.put(".psflib", "audio/x-psflib");
    types.put(".psid", "audio/prs.sid");
    types.put(".psw", "application/x-pocket-word");
    types.put(".pw", "application/x-pw");
    types.put(".py", "text/x-python");
    types.put(".pyc", "application/x-python-bytecode");
    types.put(".pyo", "application/x-python-bytecode");
    types.put(".qif", "image/x-quicktime");
    types.put(".qt", "video/quicktime");
    types.put(".qtif", "image/x-quicktime");
    types.put(".qtl", "application/x-quicktime-media-link");
    types.put(".qtvr", "video/quicktime");
    types.put(".ra", "audio/vnd.rn-realaudio");
    types.put(".raf", "image/x-fuji-raf");
    types.put(".ram", "application/ram");
    types.put(".rar", "application/x-rar");
    types.put(".ras", "image/x-cmu-raster");
    types.put(".raw", "image/x-panasonic-raw");
    types.put(".rax", "audio/vnd.rn-realaudio");
    types.put(".rb", "application/x-ruby");
    types.put(".rdf", "application/rdf+xml");
    types.put(".rdfs", "application/rdf+xml");
    types.put(".reg", "text/x-ms-regedit");
    types.put(".rej", "application/x-reject");
    types.put(".rgb", "image/x-rgb");
    types.put(".rle", "image/rle");
    types.put(".rm", "application/vnd.rn-realmedia");
    types.put(".rmj", "application/vnd.rn-realmedia");
    types.put(".rmm", "application/vnd.rn-realmedia");
    types.put(".rms", "application/vnd.rn-realmedia");
    types.put(".rmvb", "application/vnd.rn-realmedia");
    types.put(".rmx", "application/vnd.rn-realmedia");
    types.put(".roff", "text/troff");
    types.put(".rp", "image/vnd.rn-realpix");
    types.put(".rpm", "application/x-rpm");
    types.put(".rss", "application/rss+xml");
    types.put(".rt", "text/vnd.rn-realtext");
    types.put(".rtf", "application/rtf");
    types.put(".rtx", "text/richtext");
    types.put(".rv", "video/vnd.rn-realvideo");
    types.put(".rvx", "video/vnd.rn-realvideo");
    types.put(".s3m", "audio/x-s3m");
    types.put(".sam", "application/x-amipro");
    types.put(".sami", "application/x-sami");
    types.put(".sav", "application/x-spss-sav");
    types.put(".scm", "text/x-scheme");
    types.put(".sda", "application/vnd.stardivision.draw");
    types.put(".sdc", "application/vnd.stardivision.calc");
    types.put(".sdd", "application/vnd.stardivision.impress");
    types.put(".sdp", "application/sdp");
    types.put(".sds", "application/vnd.stardivision.chart");
    types.put(".sdw", "application/vnd.stardivision.writer");
    types.put(".sgf", "application/x-go-sgf");
    types.put(".sgi", "image/x-sgi");
    types.put(".sgl", "application/vnd.stardivision.writer");
    types.put(".sgm", "text/sgml");
    types.put(".sgml", "text/sgml");
    types.put(".sh", "application/x-shellscript");
    types.put(".shar", "application/x-shar");
    types.put(".shn", "application/x-shorten");
    types.put(".siag", "application/x-siag");
    types.put(".sid", "audio/prs.sid");
    types.put(".sik", "application/x-trash");
    types.put(".sis", "application/vnd.symbian.install");
    types.put(".sisx", "x-epoc/x-sisx-app");
    types.put(".sit", "application/x-stuffit");
    types.put(".siv", "application/sieve");
    types.put(".sk", "image/x-skencil");
    types.put(".sk1", "image/x-skencil");
    types.put(".skr", "application/pgp-keys");
    types.put(".slk", "text/spreadsheet");
    types.put(".smaf", "application/x-smaf");
    types.put(".smc", "application/x-snes-rom");
    types.put(".smd", "application/vnd.stardivision.mail");
    types.put(".smf", "application/vnd.stardivision.math");
    types.put(".smi", "application/x-sami");
    types.put(".smil", "application/smil");
    types.put(".sml", "application/smil");
    types.put(".sms", "application/x-sms-rom");
    types.put(".snd", "audio/basic");
    types.put(".so", "application/x-sharedlib");
    types.put(".spc", "application/x-pkcs7-certificates");
    types.put(".spd", "application/x-font-speedo");
    types.put(".spec", "text/x-rpm-spec");
    types.put(".spl", "application/x-shockwave-flash");
    types.put(".spx", "audio/x-speex");
    types.put(".sql", "text/x-sql");
    types.put(".sr2", "image/x-sony-sr2");
    types.put(".src", "application/x-wais-source");
    types.put(".srf", "image/x-sony-srf");
    types.put(".srt", "application/x-subrip");
    types.put(".ssa", "text/x-ssa");
    types.put(".stc", "application/vnd.sun.xml.calc.template");
    types.put(".std", "application/vnd.sun.xml.draw.template");
    types.put(".sti", "application/vnd.sun.xml.impress.template");
    types.put(".stm", "audio/x-stm");
    types.put(".stw", "application/vnd.sun.xml.writer.template");
    types.put(".sty", "text/x-tex");
    types.put(".sub", "text/x-subviewer");
    types.put(".sun", "image/x-sun-raster");
    types.put(".sv4cpio", "application/x-sv4cpio");
    types.put(".sv4crc", "application/x-sv4crc");
    types.put(".svg", "image/svg+xml");
    types.put(".svgz", "image/svg+xml-compressed");
    types.put(".swf", "application/x-shockwave-flash");
    types.put(".sxc", "application/vnd.sun.xml.calc");
    types.put(".sxd", "application/vnd.sun.xml.draw");
    types.put(".sxg", "application/vnd.sun.xml.writer.global");
    types.put(".sxi", "application/vnd.sun.xml.impress");
    types.put(".sxm", "application/vnd.sun.xml.math");
    types.put(".sxw", "application/vnd.sun.xml.writer");
    types.put(".sylk", "text/spreadsheet");
    types.put(".t", "text/troff");
    types.put(".t2t", "text/x-txt2tags");
    types.put(".tar", "application/x-tar");
    types.put(".tar.bz", "application/x-bzip-compressed-tar");
    types.put(".tar.bz2", "application/x-bzip-compressed-tar");
    types.put(".tar.gz", "application/x-compressed-tar");
    types.put(".tar.lzma", "application/x-lzma-compressed-tar");
    types.put(".tar.lzo", "application/x-tzo");
    types.put(".tar.xz", "application/x-xz-compressed-tar");
    types.put(".tar.z", "application/x-tarz");
    types.put(".tbz", "application/x-bzip-compressed-tar");
    types.put(".tbz2", "application/x-bzip-compressed-tar");
    types.put(".tcl", "text/x-tcl");
    types.put(".tex", "text/x-tex");
    types.put(".texi", "text/x-texinfo");
    types.put(".texinfo", "text/x-texinfo");
    types.put(".tga", "image/x-tga");
    types.put(".tgz", "application/x-compressed-tar");
    types.put(".theme", "application/x-theme");
    types.put(".themepack", "application/x-windows-themepack");
    types.put(".tif", "image/tiff");
    types.put(".tiff", "image/tiff");
    types.put(".tk", "text/x-tcl");
    types.put(".tlz", "application/x-lzma-compressed-tar");
    types.put(".tnef", "application/vnd.ms-tnef");
    types.put(".tnf", "application/vnd.ms-tnef");
    types.put(".toc", "application/x-cdrdao-toc");
    types.put(".torrent", "application/x-bittorrent");
    types.put(".tpic", "image/x-tga");
    types.put(".tr", "text/troff");
    types.put(".ts", "application/x-linguist");
    types.put(".tsv", "text/tab-separated-values");
    types.put(".tta", "audio/x-tta");
    types.put(".ttc", "application/x-font-ttf");
    types.put(".ttf", "application/x-font-ttf");
    types.put(".ttx", "application/x-font-ttx");
    types.put(".txt", "text/plain");
    types.put(".properties", "text/plain");
    types.put(".yml", "text/plain");
    types.put(".yaml", "text/plain");
    types.put(".toml", "text/plain");
    types.put(".conf", "text/plain");
    types.put(".ini", "text/plain");
    types.put(".txz", "application/x-xz-compressed-tar");
    types.put(".tzo", "application/x-tzo");
    types.put(".ufraw", "application/x-ufraw");
    types.put(".ui", "application/x-designer");
    types.put(".uil", "text/x-uil");
    types.put(".ult", "audio/x-mod");
    types.put(".uni", "audio/x-mod");
    types.put(".uri", "text/x-uri");
    types.put(".url", "text/x-uri");
    types.put(".ustar", "application/x-ustar");
    types.put(".vala", "text/x-vala");
    types.put(".vapi", "text/x-vala");
    types.put(".vcf", "text/directory");
    types.put(".vcs", "text/calendar");
    types.put(".vct", "text/directory");
    types.put(".vda", "image/x-tga");
    types.put(".vhd", "text/x-vhdl");
    types.put(".vhdl", "text/x-vhdl");
    types.put(".viv", "video/vivo");
    types.put(".vivo", "video/vivo");
    types.put(".vlc", "audio/x-mpegurl");
    types.put(".vob", "video/mpeg");
    types.put(".voc", "audio/x-voc");
    types.put(".vor", "application/vnd.stardivision.writer");
    types.put(".vst", "image/x-tga");
    types.put(".wav", "audio/x-wav");
    types.put(".wax", "audio/x-ms-asx");
    types.put(".wb1", "application/x-quattropro");
    types.put(".wb2", "application/x-quattropro");
    types.put(".wb3", "application/x-quattropro");
    types.put(".wbmp", "image/vnd.wap.wbmp");
    types.put(".wcm", "application/vnd.ms-works");
    types.put(".wdb", "application/vnd.ms-works");
    types.put(".webm", "video/webm");
    types.put(".wk1", "application/vnd.lotus-1-2-3");
    types.put(".wk3", "application/vnd.lotus-1-2-3");
    types.put(".wk4", "application/vnd.lotus-1-2-3");
    types.put(".wks", "application/vnd.ms-works");
    types.put(".wma", "audio/x-ms-wma");
    types.put(".wmf", "image/x-wmf");
    types.put(".wml", "text/vnd.wap.wml");
    types.put(".wmls", "text/vnd.wap.wmlscript");
    types.put(".wmv", "video/x-ms-wmv");
    types.put(".wmx", "audio/x-ms-asx");
    types.put(".wp", "application/vnd.wordperfect");
    types.put(".wp4", "application/vnd.wordperfect");
    types.put(".wp5", "application/vnd.wordperfect");
    types.put(".wp6", "application/vnd.wordperfect");
    types.put(".wpd", "application/vnd.wordperfect");
    types.put(".wpg", "application/x-wpg");
    types.put(".wpl", "application/vnd.ms-wpl");
    types.put(".wpp", "application/vnd.wordperfect");
    types.put(".wps", "application/vnd.ms-works");
    types.put(".wri", "application/x-mswrite");
    types.put(".wrl", "model/vrml");
    types.put(".wv", "audio/x-wavpack");
    types.put(".wvc", "audio/x-wavpack-correction");
    types.put(".wvp", "audio/x-wavpack");
    types.put(".wvx", "audio/x-ms-asx");
    types.put(".x3f", "image/x-sigma-x3f");
    types.put(".xac", "application/x-gnucash");
    types.put(".xbel", "application/x-xbel");
    types.put(".xbl", "application/xml");
    types.put(".xbm", "image/x-xbitmap");
    types.put(".xcf", "image/x-xcf");
    types.put(".xcf.bz2", "image/x-compressed-xcf");
    types.put(".xcf.gz", "image/x-compressed-xcf");
    types.put(".xhtml", "application/xhtml+xml");
    types.put(".xi", "audio/x-xi");
    types.put(".xla", "application/vnd.ms-excel");
    types.put(".xlc", "application/vnd.ms-excel");
    types.put(".xld", "application/vnd.ms-excel");
    types.put(".xlf", "application/x-xliff");
    types.put(".xliff", "application/x-xliff");
    types.put(".xll", "application/vnd.ms-excel");
    types.put(".xlm", "application/vnd.ms-excel");
    types.put(".xls", "application/vnd.ms-excel");
    types.put(".xlsm", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    types.put(".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    types.put(".xlt", "application/vnd.ms-excel");
    types.put(".xlw", "application/vnd.ms-excel");
    types.put(".xm", "audio/x-xm");
    types.put(".xmf", "audio/x-xmf");
    types.put(".xmi", "text/x-xmi");
    types.put(".xml", "application/xml");
    types.put(".xpm", "image/x-xpixmap");
    types.put(".xps", "application/vnd.ms-xpsdocument");
    types.put(".xsl", "application/xml");
    types.put(".xslfo", "text/x-xslfo");
    types.put(".xslt", "application/xml");
    types.put(".xspf", "application/xspf+xml");
    types.put(".xul", "application/vnd.mozilla.xul+xml");
    types.put(".xwd", "image/x-xwindowdump");
    types.put(".xyz", "chemical/x-pdb");
    types.put(".xz", "application/x-xz");
    types.put(".w2p", "application/w2p");
    types.put(".z", "application/x-compress");
    types.put(".zabw", "application/x-abiword");
    types.put(".zip", "application/zip");
  }
}
