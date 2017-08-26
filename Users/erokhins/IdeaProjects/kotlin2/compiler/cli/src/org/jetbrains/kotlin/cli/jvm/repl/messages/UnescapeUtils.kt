'arrayOf' @ [26:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'arrayOf' @ [27:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'InputSource' @ [30:34] ==> public constructor InputSource(p0: (InputStream..InputStream?)) defined in org.xml.sax.InputSource[JavaClassConstructorDescriptor]

'ByteArrayInputStream' @ [30:46] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

's' @ [30:67] ==> value-parameter s: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml.strToSource[ValueParameterDescriptorImpl]

'toByteArray' @ [30:69] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newInstance' @ [32:45] ==> public open fun newInstance(): (DocumentBuilderFactory..DocumentBuilderFactory?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'docFactory' @ [33:22] ==> val docFactory: (DocumentBuilderFactory..DocumentBuilderFactory?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml[LocalVariableDescriptor]

'newDocumentBuilder' @ [33:33] ==> public abstract fun newDocumentBuilder(): (DocumentBuilder..DocumentBuilder?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'docBuilder' @ [34:17] ==> val docBuilder: (DocumentBuilder..DocumentBuilder?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml[LocalVariableDescriptor]

'parse' @ [34:28] ==> public abstract fun parse(p0: (InputSource..InputSource?)): (Document..Document?) defined in javax.xml.parsers.DocumentBuilder[JavaMethodDescriptor]

'strToSource' @ [34:34] ==> local final fun strToSource(s: String): InputSource defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml[SimpleFunctionDescriptorImpl]

'inputMessage' @ [34:46] ==> value-parameter inputMessage: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml[ValueParameterDescriptorImpl]

'input' @ [36:16] ==> val input: (Document..Document?) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml[LocalVariableDescriptor]

'firstChild' @ [36:22] ==> public final val Document.firstChild: (Node..Node?)[MyPropertyDescriptor]

'root' @ [37:12] ==> val root: Element defined in org.jetbrains.kotlin.cli.jvm.repl.messages.parseXml[LocalVariableDescriptor]

'textContent' @ [37:17] ==> public final var Element.textContent: (String..String?)[MyPropertyDescriptor]

'replace' @ [40:48] ==> @NotNull @Contract public open fun replace(@NotNull p0: String, @NotNull p1: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull p2: (Array<(String..String?)>..Array<out (String..String?)>)): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

's' @ [40:56] ==> value-parameter s: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.unescapeLineBreaks[ValueParameterDescriptorImpl]

'XML_REPLACEMENTS' @ [40:59] ==> public val XML_REPLACEMENTS: Array<String> defined in org.jetbrains.kotlin.cli.jvm.repl.messages in file UnescapeUtils.kt[PropertyDescriptorImpl]

'SOURCE_CHARS' @ [40:77] ==> public val SOURCE_CHARS: Array<String> defined in org.jetbrains.kotlin.cli.jvm.repl.messages in file UnescapeUtils.kt[PropertyDescriptorImpl]

