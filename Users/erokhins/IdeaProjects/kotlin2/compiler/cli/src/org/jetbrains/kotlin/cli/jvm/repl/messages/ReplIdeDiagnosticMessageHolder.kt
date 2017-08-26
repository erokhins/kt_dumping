'arrayListOf' @ [27:31] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<Diagnostic, String>> /* = ArrayList<Pair<Diagnostic, String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Diagnostic, String>

'diagnostics' @ [30:9] ==> private final val diagnostics: ArrayList<Pair<Diagnostic, String>> /* = ArrayList<Pair<Diagnostic, String>> */ defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder[PropertyDescriptorImpl]

'add' @ [30:21] ==> public open fun add(element: Pair<Diagnostic, String>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Pair' @ [30:25] ==> public constructor Pair<out A, out B>(first: Diagnostic, second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Diagnostic
    <out B> -> String

'diagnostic' @ [30:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.report[ValueParameterDescriptorImpl]

'render' @ [30:42] ==> value-parameter render: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.report[ValueParameterDescriptorImpl]

'newInstance' @ [35:53] ==> public open fun newInstance(): (DocumentBuilderFactory..DocumentBuilderFactory?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'docFactory' @ [36:30] ==> val docFactory: (DocumentBuilderFactory..DocumentBuilderFactory?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'newDocumentBuilder' @ [36:41] ==> public abstract fun newDocumentBuilder(): (DocumentBuilder..DocumentBuilder?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'docBuilder' @ [37:31] ==> val docBuilder: (DocumentBuilder..DocumentBuilder?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'newDocument' @ [37:42] ==> public abstract fun newDocument(): (Document..Document?) defined in javax.xml.parsers.DocumentBuilder[JavaMethodDescriptor]

'errorReport' @ [39:31] ==> val errorReport: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'createElement' @ [39:43] ==> public abstract fun createElement(p0: (String..String?)): (Element..Element?) defined in org.w3c.dom.Document[JavaMethodDescriptor]

'errorReport' @ [40:13] ==> val errorReport: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'appendChild' @ [40:25] ==> public abstract fun appendChild(p0: (Node..Node?)): (Node..Node?) defined in org.w3c.dom.Document[JavaMethodDescriptor]

'rootElement' @ [40:37] ==> val rootElement: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'component1' @ [42:19] ==> public final operator fun component1(): Diagnostic defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [42:31] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [42:43] ==> private final val diagnostics: ArrayList<Pair<Diagnostic, String>> /* = ArrayList<Pair<Diagnostic, String>> */ defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder[PropertyDescriptorImpl]

'firstRange' @ [43:50] ==> @NotNull public open fun firstRange(@NotNull p0: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)): TextRange defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'diagnostic' @ [43:61] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'textRanges' @ [43:72] ==> public final val Diagnostic.textRanges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)[MyPropertyDescriptor]

'errorReport' @ [45:35] ==> val errorReport: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'createElement' @ [45:47] ==> public abstract fun createElement(p0: (String..String?)): (Element..Element?) defined in org.w3c.dom.Document[JavaMethodDescriptor]

'reportEntry' @ [46:17] ==> val reportEntry: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'setAttribute' @ [46:29] ==> public abstract fun setAttribute(p0: (String..String?), p1: (String..String?)): Unit defined in org.w3c.dom.Element[JavaMethodDescriptor]

'diagnostic' @ [46:54] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'severity' @ [46:65] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'toString' @ [46:74] ==> public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.Severity[DeserializedSimpleFunctionDescriptor]

'reportEntry' @ [47:17] ==> val reportEntry: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'setAttribute' @ [47:29] ==> public abstract fun setAttribute(p0: (String..String?), p1: (String..String?)): Unit defined in org.w3c.dom.Element[JavaMethodDescriptor]

'errorRange' @ [47:56] ==> val errorRange: TextRange defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'startOffset' @ [47:67] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'toString' @ [47:79] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reportEntry' @ [48:17] ==> val reportEntry: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'setAttribute' @ [48:29] ==> public abstract fun setAttribute(p0: (String..String?), p1: (String..String?)): Unit defined in org.w3c.dom.Element[JavaMethodDescriptor]

'errorRange' @ [48:54] ==> val errorRange: TextRange defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'endOffset' @ [48:65] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'toString' @ [48:75] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reportEntry' @ [49:17] ==> val reportEntry: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'appendChild' @ [49:29] ==> public abstract fun appendChild(p0: (Node..Node?)): (Node..Node?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'errorReport' @ [49:41] ==> val errorReport: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'createTextNode' @ [49:53] ==> public abstract fun createTextNode(p0: (String..String?)): (Text..Text?) defined in org.w3c.dom.Document[JavaMethodDescriptor]

'escapeXml' @ [49:79] ==> @Contract public open fun escapeXml(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'message' @ [49:89] ==> val message: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'rootElement' @ [51:17] ==> val rootElement: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'appendChild' @ [51:29] ==> public abstract fun appendChild(p0: (Node..Node?)): (Node..Node?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'reportEntry' @ [51:41] ==> val reportEntry: (Element..Element?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'errorReport' @ [54:37] ==> val errorReport: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'implementation' @ [54:49] ==> public final val Document.implementation: (DOMImplementation..DOMImplementation?)[MyPropertyDescriptor]

'domImplementation' @ [55:32] ==> val domImplementation: DOMImplementationLS defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'createLSSerializer' @ [55:50] ==> public abstract fun createLSSerializer(): (LSSerializer..LSSerializer?) defined in org.w3c.dom.ls.DOMImplementationLS[JavaMethodDescriptor]

'lsSerializer' @ [56:20] ==> val lsSerializer: (LSSerializer..LSSerializer?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

'writeToString' @ [56:33] ==> public abstract fun writeToString(p0: (Node..Node?)): (String..String?) defined in org.w3c.dom.ls.LSSerializer[JavaMethodDescriptor]

'errorReport' @ [56:47] ==> val errorReport: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder.<get-renderedDiagnostics>[LocalVariableDescriptor]

