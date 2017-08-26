'File' @ [27:15] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [28:5] ==> val dir: File defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'mkdirs' @ [28:9] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'args' @ [31:24] ==> value-parameter args: Array<String> defined in org.jetbrains.idl2k.dl.main[ValueParameterDescriptorImpl]

'iterator' @ [31:29] ==> public final operator fun iterator(): Iterator<String> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'argsIterator' @ [32:12] ==> val argsIterator: Iterator<String> defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'hasNext' @ [32:25] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'argsIterator' @ [33:19] ==> val argsIterator: Iterator<String> defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'next' @ [33:32] ==> public abstract operator fun next(): String defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'when (arg) {
            "-package", "-pkg", "--package" -> if (argsIterator.hasNext()) packageFilter = argsIterator.next() else throw IllegalArgumentException("argument $arg requires argument")
            else -> throw IllegalArgumentException("Argument $arg is unknown")
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'arg' @ [35:15] ==> val arg: String defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'if (argsIterator.hasNext()) packageFilter = argsIterator.next() else throw IllegalArgumentException("argument $arg requires argument")' @ [36:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argsIterator' @ [36:52] ==> val argsIterator: Iterator<String> defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'hasNext' @ [36:65] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'packageFilter' @ [36:76] ==> var packageFilter: String? defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'argsIterator' @ [36:92] ==> val argsIterator: Iterator<String> defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'next' @ [36:105] ==> public abstract operator fun next(): String defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [36:123] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'arg' @ [36:159] ==> val arg: String defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'IllegalArgumentException' @ [37:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'arg' @ [37:63] ==> val arg: String defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'urls' @ [41:24] ==> public val urls: List<Pair<String, String>> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'filter' @ [41:29] ==> public inline fun <T> Iterable<Pair<String, String>>.filter(predicate: (Pair<String, String>) -> Boolean): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'packageFilter' @ [41:38] ==> var packageFilter: String? defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'it' @ [41:63] ==> value-parameter it: Pair<String, String> defined in org.jetbrains.idl2k.dl.main.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [41:66] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'packageFilter' @ [41:76] ==> var packageFilter: String? defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'groupBy' @ [41:92] ==> public inline fun <T, K> Iterable<Pair<String, String>>.groupBy(keySelector: (Pair<String, String>) -> String): Map<String, List<Pair<String, String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>
    <K> -> String

'it' @ [41:102] ==> value-parameter it: Pair<String, String> defined in org.jetbrains.idl2k.dl.main.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [41:105] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'urlsPerFiles' @ [43:5] ==> val urlsPerFiles: Map<String, List<Pair<String, String>>> defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'forEach' @ [43:18] ==> @HidesMembers public inline fun <K, V> Map<out String, List<Pair<String, String>>>.forEach(action: (Map.Entry<String, List<Pair<String, String>>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<Pair<String, String>>

'e' @ [44:24] ==> value-parameter e: Map.Entry<String, List<Pair<String, String>>> defined in org.jetbrains.idl2k.dl.main.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [44:26] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'e' @ [45:19] ==> value-parameter e: Map.Entry<String, List<Pair<String, String>>> defined in org.jetbrains.idl2k.dl.main.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [45:21] ==> public abstract val value: List<Pair<String, String>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [45:27] ==> public fun <T> List<Pair<String, String>>.first(): Pair<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'second' @ [45:35] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'File' @ [47:9] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [47:14] ==> val dir: File defined in org.jetbrains.idl2k.dl.main[LocalVariableDescriptor]

'fileName' @ [47:19] ==> val fileName: String defined in org.jetbrains.idl2k.dl.main.<anonymous>[LocalVariableDescriptor]

'bufferedWriter' @ [47:29] ==> @InlineOnly public inline fun File.bufferedWriter(charset: Charset = ..., bufferSize: Int = ...): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [47:46] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedWriter.use(block: (BufferedWriter) -> Appendable /* = Appendable */): Appendable /* = Appendable */ defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedWriter
    <R> -> Appendable

'w' @ [48:13] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [48:15] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pkg' @ [48:36] ==> val pkg: String defined in org.jetbrains.idl2k.dl.main.<anonymous>[LocalVariableDescriptor]

'w' @ [49:13] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [49:15] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'w' @ [50:13] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [50:15] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'e' @ [52:13] ==> value-parameter e: Map.Entry<String, List<Pair<String, String>>> defined in org.jetbrains.idl2k.dl.main.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [52:15] ==> public abstract val value: List<Pair<String, String>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'forEach' @ [52:21] ==> @HidesMembers public inline fun <T> Iterable<Pair<String, String>>.forEach(action: (Pair<String, String>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'component1' @ [53:22] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [53:29] ==> value-parameter pair: Pair<String, String> defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [54:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'url' @ [54:35] ==> val url: String defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'w' @ [56:17] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [56:19] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'url' @ [56:49] ==> val url: String defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (url.endsWith(".idl")) {
                    w.appendln(URL(url).readText())
                } else {
                    extractIDLText(url, w)
                }' @ [57:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'url' @ [57:21] ==> val url: String defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'endsWith' @ [57:25] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'w' @ [58:21] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [58:23] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'URL' @ [58:32] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'url' @ [58:36] ==> val url: String defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'readText' @ [58:41] ==> @InlineOnly public inline fun URL.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'extractIDLText' @ [60:21] ==> private fun extractIDLText(url: String, out: Appendable /* = Appendable */): Unit defined in org.jetbrains.idl2k.dl[SimpleFunctionDescriptorImpl]

'url' @ [60:36] ==> val url: String defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'w' @ [60:41] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'w' @ [64:13] ==> value-parameter w: BufferedWriter defined in org.jetbrains.idl2k.dl.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [64:15] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parse' @ [71:22] ==> public open fun parse(p0: (String..String?)): (Document..Document?) defined in org.jsoup.Jsoup[JavaMethodDescriptor]

'URL' @ [71:28] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'url' @ [71:32] ==> value-parameter url: String defined in org.jetbrains.idl2k.dl.extractIDLText[ValueParameterDescriptorImpl]

'readText' @ [71:37] ==> @InlineOnly public inline fun URL.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [73:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [73:14] ==> value-parameter it: Element defined in org.jetbrains.idl2k.dl.extractIDLText.append[ValueParameterDescriptorImpl]

'tag' @ [73:17] ==> public open fun tag(): (Tag..Tag?) defined in org.jsoup.nodes.Element[JavaMethodDescriptor]

'preserveWhitespace' @ [73:23] ==> public open fun preserveWhitespace(): Boolean defined in org.jsoup.parser.Tag[JavaMethodDescriptor]

'append' @ [74:20] ==> local final fun append(it: Element): Unit defined in org.jetbrains.idl2k.dl.extractIDLText[SimpleFunctionDescriptorImpl]

'Element' @ [74:27] ==> public constructor Element(p0: (Tag..Tag?), p1: (String..String?)) defined in org.jsoup.nodes.Element[JavaClassConstructorDescriptor]

'valueOf' @ [74:39] ==> public open fun valueOf(p0: (String..String?)): (Tag..Tag?) defined in org.jsoup.parser.Tag[JavaMethodDescriptor]

'it' @ [74:55] ==> value-parameter it: Element defined in org.jetbrains.idl2k.dl.extractIDLText.append[ValueParameterDescriptorImpl]

'baseUri' @ [74:58] ==> public open fun baseUri(): (String..String?) defined in org.jsoup.nodes.Element[JavaMethodDescriptor]

'appendChild' @ [74:69] ==> public open fun appendChild(p0: (Node..Node?)): (Element..Element?) defined in org.jsoup.nodes.Element[JavaMethodDescriptor]

'it' @ [74:81] ==> value-parameter it: Element defined in org.jetbrains.idl2k.dl.extractIDLText.append[ValueParameterDescriptorImpl]

'it' @ [77:20] ==> value-parameter it: Element defined in org.jetbrains.idl2k.dl.extractIDLText.append[ValueParameterDescriptorImpl]

'text' @ [77:23] ==> public open fun text(): (String..String?) defined in org.jsoup.nodes.Element[JavaMethodDescriptor]

'out' @ [78:9] ==> value-parameter out: Appendable /* = Appendable */ defined in org.jetbrains.idl2k.dl.extractIDLText[ValueParameterDescriptorImpl]

'appendln' @ [78:13] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [78:22] ==> val text: (String..String?) defined in org.jetbrains.idl2k.dl.extractIDLText.append[LocalVariableDescriptor]

'!' @ [79:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'text' @ [79:14] ==> val text: (String..String?) defined in org.jetbrains.idl2k.dl.extractIDLText.append[LocalVariableDescriptor]

'trimEnd' @ [79:19] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [79:29] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'out' @ [80:13] ==> value-parameter out: Appendable /* = Appendable */ defined in org.jetbrains.idl2k.dl.extractIDLText[ValueParameterDescriptorImpl]

'appendln' @ [80:17] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'soup' @ [84:5] ==> val soup: (Document..Document?) defined in org.jetbrains.idl2k.dl.extractIDLText[LocalVariableDescriptor]

'select' @ [84:10] ==> public open fun select(p0: (String..String?)): (Elements..Elements?) defined in org.jsoup.nodes.Document[JavaMethodDescriptor]

'remove' @ [84:31] ==> public open fun remove(): (Elements..Elements?) defined in org.jsoup.select.Elements[JavaMethodDescriptor]

'soup' @ [86:5] ==> val soup: (Document..Document?) defined in org.jetbrains.idl2k.dl.extractIDLText[LocalVariableDescriptor]

'select' @ [86:10] ==> public open fun select(p0: (String..String?)): (Elements..Elements?) defined in org.jsoup.nodes.Document[JavaMethodDescriptor]

'filter' @ [86:28] ==> public inline fun <T> Iterable<(Element..Element?)>.filter(predicate: ((Element..Element?)) -> Boolean): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jsoup.nodes.Element..org.jsoup.nodes.Element?)

'!' @ [86:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [86:37] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.idl2k.dl.extractIDLText.<anonymous>[ValueParameterDescriptorImpl]

'hasClass' @ [86:40] ==> public open fun hasClass(p0: (String..String?)): Boolean defined in org.jsoup.nodes.Element[JavaMethodDescriptor]

'forEach' @ [86:61] ==> @HidesMembers public inline fun <T> Iterable<(Element..Element?)>.forEach(action: ((Element..Element?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jsoup.nodes.Element..org.jsoup.nodes.Element?)

'soup' @ [87:5] ==> val soup: (Document..Document?) defined in org.jetbrains.idl2k.dl.extractIDLText[LocalVariableDescriptor]

'select' @ [87:10] ==> public open fun select(p0: (String..String?)): (Elements..Elements?) defined in org.jsoup.nodes.Document[JavaMethodDescriptor]

'forEach' @ [87:34] ==> @HidesMembers public inline fun <T> Iterable<(Element..Element?)>.forEach(action: ((Element..Element?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jsoup.nodes.Element..org.jsoup.nodes.Element?)

'soup' @ [88:5] ==> val soup: (Document..Document?) defined in org.jetbrains.idl2k.dl.extractIDLText[LocalVariableDescriptor]

'select' @ [88:10] ==> public open fun select(p0: (String..String?)): (Elements..Elements?) defined in org.jsoup.nodes.Document[JavaMethodDescriptor]

'forEach' @ [88:29] ==> @HidesMembers public inline fun <T> Iterable<(Element..Element?)>.forEach(action: ((Element..Element?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jsoup.nodes.Element..org.jsoup.nodes.Element?)

