'generators' @ [31:9] ==> value-parameter generators: Collection<() -> T> defined in org.jetbrains.kotlin.j2k.buildList[ValueParameterDescriptorImpl]

'isNotEmpty' @ [31:20] ==> @InlineOnly public inline fun <T> Collection<() -> T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<T>

'append' @ [32:9] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'prefix' @ [32:16] ==> value-parameter prefix: String = ... defined in org.jetbrains.kotlin.j2k.buildList[ValueParameterDescriptorImpl]

'generators' @ [34:27] ==> value-parameter generators: Collection<() -> T> defined in org.jetbrains.kotlin.j2k.buildList[ValueParameterDescriptorImpl]

'!' @ [35:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'first' @ [35:18] ==> var first: Boolean defined in org.jetbrains.kotlin.j2k.buildList[LocalVariableDescriptor]

'append' @ [36:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'separator' @ [36:24] ==> value-parameter separator: String defined in org.jetbrains.kotlin.j2k.buildList[ValueParameterDescriptorImpl]

'invoke' @ [38:13] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'first' @ [39:13] ==> var first: Boolean defined in org.jetbrains.kotlin.j2k.buildList[LocalVariableDescriptor]

'append' @ [41:9] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'suffix' @ [41:16] ==> value-parameter suffix: String = ... defined in org.jetbrains.kotlin.j2k.buildList[ValueParameterDescriptorImpl]

'this' @ [43:12] ==> <this> defined in org.jetbrains.kotlin.j2k.buildList[ReceiverParameterDescriptorImpl]

'JvmName' @ [46:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'buildList' @ [48:12] ==> public fun <T> CodeBuilder.buildList(generators: Collection<() -> CodeBuilder>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> CodeBuilder

'elements' @ [48:22] ==> value-parameter elements: Collection<Element> defined in org.jetbrains.kotlin.j2k.append[ValueParameterDescriptorImpl]

'filter' @ [48:31] ==> public inline fun <T> Iterable<Element>.filter(predicate: (Element) -> Boolean): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'!' @ [48:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [48:41] ==> value-parameter it: Element defined in org.jetbrains.kotlin.j2k.append.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [48:44] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'map' @ [48:54] ==> public inline fun <T, R> Iterable<Element>.map(transform: (Element) -> () -> CodeBuilder): List<() -> CodeBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element
    <R> -> Function0<CodeBuilder>

'append' @ [48:62] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [48:69] ==> value-parameter it: Element defined in org.jetbrains.kotlin.j2k.append.<anonymous>[ValueParameterDescriptorImpl]

'separator' @ [48:78] ==> value-parameter separator: String defined in org.jetbrains.kotlin.j2k.append[ValueParameterDescriptorImpl]

'prefix' @ [48:89] ==> value-parameter prefix: String = ... defined in org.jetbrains.kotlin.j2k.append[ValueParameterDescriptorImpl]

'suffix' @ [48:97] ==> value-parameter suffix: String = ... defined in org.jetbrains.kotlin.j2k.append[ValueParameterDescriptorImpl]

'RuntimeException' @ [51:52] ==> public final fun <init>(): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'listOf' @ [54:41] ==> public fun <T> listOf(element: Regex): List<Regex> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Regex

'toRegex' @ [54:105] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [56:27] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'HashSet' @ [59:41] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'LinkedHashSet' @ [61:27] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'append' @ [63:51] ==> private final fun append(text: String, commentInfo: CodeBuilder.CommentInfo = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'text' @ [63:58] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'NON_COMMENT_INFO' @ [63:64] ==> private final val NON_COMMENT_INFO: CodeBuilder.CommentInfo defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'imports' @ [66:9] ==> private final val imports: LinkedHashSet<FqName> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [66:17] ==> public open fun add(element: FqName): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'fqName' @ [66:21] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.CodeBuilder.addImport[ValueParameterDescriptorImpl]

'element' @ [70:34] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo.<init>[ValueParameterDescriptorImpl]

'element' @ [71:41] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo.<init>[ValueParameterDescriptorImpl]

'isEndOfLineComment' @ [71:50] ==> public final fun PsiElement.isEndOfLineComment(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'element' @ [72:47] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo.<init>[ValueParameterDescriptorImpl]

'isCommentAtFirstColumn' @ [72:56] ==> public final fun PsiElement.isCommentAtFirstColumn(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'element' @ [73:58] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo.<init>[ValueParameterDescriptorImpl]

'isFirstNonWhitespaceElementInLine' @ [73:67] ==> public final fun PsiElement.isFirstNonWhitespaceElementInLine(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'CommentInfo' @ [76:36] ==> public constructor CommentInfo(element: PsiElement?, isPostInsert: Boolean) defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[ClassConstructorDescriptorImpl]

'if (element is PsiDocComment) {
            append(docConverter.convertDocComment(element))
        }
        else {
            if (element !is PsiComment || !commentPatternsToDrop.any { it.matches(element.text) }) {
                append(element.text!!, CommentInfo(element, postInsert))
            }
        }' @ [79:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'element' @ [79:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'append' @ [80:13] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'docConverter' @ [80:20] ==> private final var docConverter: DocCommentConverter defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'convertDocComment' @ [80:33] ==> public abstract fun convertDocComment(docComment: PsiDocComment): String defined in org.jetbrains.kotlin.j2k.DocCommentConverter[SimpleFunctionDescriptorImpl]

'element' @ [80:51] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'element' @ [83:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'!' @ [83:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'commentPatternsToDrop' @ [83:44] ==> private final val commentPatternsToDrop: List<Regex> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'any' @ [83:66] ==> public inline fun <T> Iterable<Regex>.any(predicate: (Regex) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Regex

'it' @ [83:72] ==> value-parameter it: Regex defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [83:75] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'element' @ [83:83] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'text' @ [83:91] ==> public final val PsiComment.text: (String..String?)[MyPropertyDescriptor]

'append' @ [84:17] ==> private final fun append(text: String, commentInfo: CodeBuilder.CommentInfo = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [84:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'text' @ [84:32] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'CommentInfo' @ [84:40] ==> public constructor CommentInfo(element: PsiElement?, isPostInsert: Boolean) defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[ClassConstructorDescriptorImpl]

'element' @ [84:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'postInsert' @ [84:61] ==> value-parameter postInsert: Boolean = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.appendCommentOrWhiteSpace[ValueParameterDescriptorImpl]

'NON_COMMENT_INFO' @ [89:65] ==> private final val NON_COMMENT_INFO: CodeBuilder.CommentInfo defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'text' @ [90:13] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'isEmpty' @ [90:18] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assert' @ [91:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [91:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'commentInfo' @ [91:21] ==> value-parameter commentInfo: CodeBuilder.CommentInfo = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'endOfLineComment' @ [91:33] ==> public final val endOfLineComment: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[PropertyDescriptorImpl]

'this' @ [92:20] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'assert' @ [95:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'text' @ [95:16] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'indexOf' @ [95:21] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endOfLineCommentAtEnd' @ [97:13] ==> private final var endOfLineCommentAtEnd: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'text' @ [98:17] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'builder' @ [98:34] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'append' @ [98:42] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'endOfLineCommentAtEnd' @ [99:13] ==> private final var endOfLineCommentAtEnd: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'commentInfo' @ [102:13] ==> value-parameter commentInfo: CodeBuilder.CommentInfo = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'isComment' @ [102:25] ==> public final val isComment: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[PropertyDescriptorImpl]

'!' @ [104:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'commentInfo' @ [104:18] ==> value-parameter commentInfo: CodeBuilder.CommentInfo = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'isPostInsert' @ [104:30] ==> public final val isPostInsert: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[PropertyDescriptorImpl]

'commentInfo' @ [104:46] ==> value-parameter commentInfo: CodeBuilder.CommentInfo = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'isFirstNonWhitespaceElementInLine' @ [104:58] ==> public final val isFirstNonWhitespaceElementInLine: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[PropertyDescriptorImpl]

'!' @ [105:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builder' @ [105:18] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'takeLastWhile' @ [105:26] ==> public inline fun CharSequence.takeLastWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Char' @ [105:40] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'contains' @ [105:60] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'builder' @ [106:17] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'append' @ [106:25] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!' @ [110:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'commentInfo' @ [110:18] ==> value-parameter commentInfo: CodeBuilder.CommentInfo = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'isCommentAtFirstColumn' @ [110:30] ==> public final val isCommentAtFirstColumn: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[PropertyDescriptorImpl]

'builder' @ [110:56] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'lastOrNull' @ [110:64] ==> public fun CharSequence.lastOrNull(): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'builder' @ [111:17] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'append' @ [111:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [115:9] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'append' @ [115:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'text' @ [115:24] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'endOfLineCommentAtEnd' @ [116:9] ==> private final var endOfLineCommentAtEnd: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'commentInfo' @ [116:33] ==> value-parameter commentInfo: CodeBuilder.CommentInfo = ... defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'endOfLineComment' @ [116:45] ==> public final val endOfLineComment: Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.CommentInfo[PropertyDescriptorImpl]

'this' @ [117:16] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'builder' @ [121:17] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'toString' @ [121:25] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'imports' @ [124:17] ==> private final val imports: LinkedHashSet<FqName> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'element' @ [127:13] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'isEmpty' @ [127:21] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'this' @ [127:37] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'element' @ [129:13] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'prototypes' @ [129:21] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'topElement' @ [129:43] ==> private final val topElement: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'if (element.createdAt == null) {
                throw ElementCreationStackTraceRequiredException()
            }
            else {
                val s = "Element $element has no prototypes assigned.\n" +
                        "Use Element.assignPrototype() or Element.assignNoPrototype().\n" +
                        "Element created at:\n${element.createdAt}"
                throw RuntimeException(s)
            }' @ [130:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'element' @ [130:17] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'createdAt' @ [130:25] ==> public final var createdAt: String? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'ElementCreationStackTraceRequiredException' @ [131:23] ==> public constructor ElementCreationStackTraceRequiredException() defined in org.jetbrains.kotlin.j2k.ElementCreationStackTraceRequiredException[ClassConstructorDescriptorImpl]

'+' @ [134:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [134:35] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'element' @ [136:49] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'createdAt' @ [136:57] ==> public final var createdAt: String? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'RuntimeException' @ [137:23] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

's' @ [137:40] ==> val s: String defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'topElement' @ [141:13] ==> private final val topElement: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'topElement' @ [141:35] ==> private final val topElement: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'element' @ [141:71] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'prototypes' @ [141:79] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'isEmpty' @ [141:92] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'element' @ [142:13] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'generateCode' @ [142:21] ==> public abstract fun generateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Element[SimpleFunctionDescriptorImpl]

'this' @ [142:34] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'element' @ [143:13] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'postGenerateCode' @ [143:21] ==> public open fun postGenerateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Element[SimpleFunctionDescriptorImpl]

'this' @ [143:38] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'this' @ [144:20] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'HashSet' @ [147:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'Prefix' @ [148:22] ==> public companion object defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[FakeCallableDescriptorForObject]

'Empty' @ [148:29] ==> public final val Empty: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix.Companion[PropertyDescriptorImpl]

'emptyList' @ [149:23] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'component1' @ [150:15] ==> public final operator fun component1(): PsiElement defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[SimpleFunctionDescriptorImpl]

'component2' @ [150:26] ==> public final operator fun component2(): CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[SimpleFunctionDescriptorImpl]

'element' @ [150:42] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'prototypes' @ [150:50] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'assert' @ [151:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'prototype' @ [151:20] ==> val prototype: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'assert' @ [152:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'prototype' @ [152:20] ==> val prototype: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'!' @ [153:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'topElement' @ [153:18] ==> private final val topElement: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'isAncestor' @ [153:29] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'prototype' @ [153:40] ==> val prototype: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'prefix' @ [154:13] ==> var prefix: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'collectPrefixElements' @ [154:23] ==> private final fun collectPrefixElements(element: PsiElement, inheritance: CommentsAndSpacesInheritance, notInsideElements: MutableSet<PsiElement>): CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'prototype' @ [154:45] ==> val prototype: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'inheritance' @ [154:56] ==> val inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'notInsideElements' @ [154:69] ==> val notInsideElements: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'postfix' @ [155:13] ==> var postfix: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'collectPostfixElements' @ [155:24] ==> private final fun collectPostfixElements(element: PsiElement, inheritance: CommentsAndSpacesInheritance, notInsideElements: MutableSet<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'prototype' @ [155:47] ==> val prototype: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'inheritance' @ [155:58] ==> val inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'notInsideElements' @ [155:71] ==> val notInsideElements: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'prefix' @ [158:13] ==> var prefix: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'lineBreaksBefore' @ [158:20] ==> public final val lineBreaksBefore: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'prefix' @ [159:35] ==> var prefix: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'lineBreaksBefore' @ [159:42] ==> public final val lineBreaksBefore: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'builder' @ [159:61] ==> private final val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'trailingLineBreakCount' @ [159:69] ==> public final fun CharSequence.trailingLineBreakCount(): Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'..' @ [160:24] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lineBreaksToAdd' @ [160:27] ==> val lineBreaksToAdd: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'append' @ [161:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'prefix' @ [165:9] ==> var prefix: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'elements' @ [165:16] ==> public final val elements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'forEach' @ [165:25] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'appendCommentOrWhiteSpace' @ [165:35] ==> private final fun appendCommentOrWhiteSpace(element: PsiElement, postInsert: Boolean = ...): Unit defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [165:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [167:9] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'generateCode' @ [167:17] ==> public abstract fun generateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Element[SimpleFunctionDescriptorImpl]

'this' @ [167:30] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'component1' @ [170:15] ==> public final operator fun component1(): PsiElement defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[SimpleFunctionDescriptorImpl]

'component2' @ [170:26] ==> public final operator fun component2(): CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[SimpleFunctionDescriptorImpl]

'element' @ [170:42] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'prototypes' @ [170:50] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'inheritance' @ [171:17] ==> val inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'commentsInside' @ [171:29] ==> public final val commentsInside: Boolean defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[PropertyDescriptorImpl]

'prototype' @ [172:17] ==> val prototype: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'accept' @ [172:27] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'JavaRecursiveElementVisitor' @ [172:43] ==> public constructor JavaRecursiveElementVisitor() defined in com.intellij.psi.JavaRecursiveElementVisitor[JavaClassConstructorDescriptor]

'comment' @ [174:29] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.j2k.CodeBuilder.append.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'notInsideElements' @ [174:41] ==> val notInsideElements: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [174:62] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [174:84] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'comment' @ [174:88] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.j2k.CodeBuilder.append.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'appendCommentOrWhiteSpace' @ [175:29] ==> private final fun appendCommentOrWhiteSpace(element: PsiElement, postInsert: Boolean = ...): Unit defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'comment' @ [175:55] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.j2k.CodeBuilder.append.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'postfix' @ [182:9] ==> var postfix: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[LocalVariableDescriptor]

'forEach' @ [182:17] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'appendCommentOrWhiteSpace' @ [182:27] ==> private final fun appendCommentOrWhiteSpace(element: PsiElement, postInsert: Boolean = ...): Unit defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [182:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.append.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [184:9] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.CodeBuilder.append[ValueParameterDescriptorImpl]

'postGenerateCode' @ [184:17] ==> public open fun postGenerateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Element[SimpleFunctionDescriptorImpl]

'this' @ [184:34] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'this' @ [186:16] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder[LazyClassReceiverParameterDescriptor]

'when {
                isEmpty() -> other
                other.isEmpty() -> this
                else -> Prefix(elements + other.elements, Math.max(lineBreaksBefore, other.lineBreaksBefore))
            }' @ [191:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CodeBuilder.Prefix, entry1: CodeBuilder.Prefix, entry2: CodeBuilder.Prefix): CodeBuilder.Prefix[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Prefix

'isEmpty' @ [192:17] ==> private final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[SimpleFunctionDescriptorImpl]

'other' @ [192:30] ==> value-parameter other: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix.plus[ValueParameterDescriptorImpl]

'other' @ [193:17] ==> value-parameter other: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix.plus[ValueParameterDescriptorImpl]

'isEmpty' @ [193:23] ==> private final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[SimpleFunctionDescriptorImpl]

'this' @ [193:36] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[LazyClassReceiverParameterDescriptor]

'Prefix' @ [194:25] ==> public constructor Prefix(elements: List<PsiElement>, lineBreaksBefore: Int) defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[ClassConstructorDescriptorImpl]

'elements' @ [194:32] ==> public final val elements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'other' @ [194:43] ==> value-parameter other: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix.plus[ValueParameterDescriptorImpl]

'elements' @ [194:49] ==> public final val elements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'max' @ [194:64] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'lineBreaksBefore' @ [194:68] ==> public final val lineBreaksBefore: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'other' @ [194:86] ==> value-parameter other: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix.plus[ValueParameterDescriptorImpl]

'lineBreaksBefore' @ [194:92] ==> public final val lineBreaksBefore: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'elements' @ [198:33] ==> public final val elements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'isEmpty' @ [198:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'lineBreaksBefore' @ [198:55] ==> public final val lineBreaksBefore: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[PropertyDescriptorImpl]

'Prefix' @ [201:25] ==> public constructor Prefix(elements: List<PsiElement>, lineBreaksBefore: Int) defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[ClassConstructorDescriptorImpl]

'emptyList' @ [201:32] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'SmartList' @ [210:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'collectCommentsAndSpacesBefore' @ [210:46] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesBefore(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [210:77] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'SmartList' @ [211:23] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'collectCommentsAndSpacesAtStart' @ [211:47] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAtStart(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [211:79] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'notInsideElements' @ [212:9] ==> value-parameter notInsideElements: MutableSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'addAll' @ [212:27] ==> public abstract fun addAll(elements: Collection<PsiElement>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'atStart' @ [212:34] ==> val atStart: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'inheritance' @ [214:13] ==> value-parameter inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'spacesBefore' @ [214:25] ==> public final val spacesBefore: SpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[PropertyDescriptorImpl]

'NONE' @ [214:59] ==> enum entry NONE defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'!' @ [214:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritance' @ [214:68] ==> value-parameter inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'commentsBefore' @ [214:80] ==> public final val commentsBefore: Boolean defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[PropertyDescriptorImpl]

'Prefix' @ [214:103] ==> public companion object defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[FakeCallableDescriptorForObject]

'Empty' @ [214:110] ==> public final val Empty: CodeBuilder.Prefix defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix.Companion[PropertyDescriptorImpl]

'before' @ [216:26] ==> val before: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lastOrNull' @ [216:33] ==> public fun <T> List<PsiElement>.lastOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'firstSpace' @ [218:13] ==> val firstSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lineBreaks' @ [219:13] ==> var lineBreaks: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'firstSpace' @ [219:26] ==> val firstSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lineBreakCount' @ [219:37] ==> public final fun PsiWhiteSpace.lineBreakCount(): Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'when (inheritance.spacesBefore) {
                SpacesInheritance.NONE -> lineBreaks = 0

                SpacesInheritance.LINE_BREAKS -> commentsAndSpacesUsed.add(firstSpace)

                SpacesInheritance.BLANK_LINES_ONLY -> {
                    commentsAndSpacesUsed.add(firstSpace)
                    if (lineBreaks == 1) lineBreaks = 0
                }
            }' @ [220:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'inheritance' @ [220:19] ==> value-parameter inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'spacesBefore' @ [220:31] ==> public final val spacesBefore: SpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[PropertyDescriptorImpl]

'NONE' @ [221:35] ==> enum entry NONE defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'lineBreaks' @ [221:43] ==> var lineBreaks: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'LINE_BREAKS' @ [223:35] ==> enum entry LINE_BREAKS defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'commentsAndSpacesUsed' @ [223:50] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [223:72] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'firstSpace' @ [223:76] ==> val firstSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'BLANK_LINES_ONLY' @ [225:35] ==> enum entry BLANK_LINES_ONLY defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'commentsAndSpacesUsed' @ [226:21] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [226:43] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'firstSpace' @ [226:47] ==> val firstSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lineBreaks' @ [227:25] ==> var lineBreaks: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lineBreaks' @ [227:42] ==> var lineBreaks: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'!' @ [232:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritance' @ [232:14] ==> value-parameter inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[ValueParameterDescriptorImpl]

'commentsBefore' @ [232:26] ==> public final val commentsBefore: Boolean defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[PropertyDescriptorImpl]

'Prefix' @ [233:20] ==> public constructor Prefix(elements: List<PsiElement>, lineBreaksBefore: Int) defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[ClassConstructorDescriptorImpl]

'emptyList' @ [233:27] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'lineBreaks' @ [233:40] ==> var lineBreaks: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'firstSpace' @ [236:13] ==> val firstSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'before' @ [237:13] ==> val before: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'removeAt' @ [237:20] ==> public abstract fun removeAt(index: Int): PsiElement defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'before' @ [237:29] ==> val before: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lastIndex' @ [237:36] ==> public val <T> List<PsiElement>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElement

'before' @ [240:24] ==> val before: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'asReversed' @ [240:31] ==> @JvmName public fun <T> MutableList<PsiElement>.asReversed(): MutableList<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'atStart' @ [240:46] ==> val atStart: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [241:9] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'addAll' @ [241:31] ==> public open fun addAll(elements: Collection<PsiElement>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'elements' @ [241:38] ==> val elements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'Prefix' @ [242:16] ==> public constructor Prefix(elements: List<PsiElement>, lineBreaksBefore: Int) defined in org.jetbrains.kotlin.j2k.CodeBuilder.Prefix[ClassConstructorDescriptorImpl]

'elements' @ [242:23] ==> val elements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'lineBreaks' @ [242:33] ==> var lineBreaks: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPrefixElements[LocalVariableDescriptor]

'SmartList' @ [250:21] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'collectCommentsAndSpacesAtEnd' @ [250:45] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAtEnd(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [250:75] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[ValueParameterDescriptorImpl]

'notInsideElements' @ [251:9] ==> value-parameter notInsideElements: MutableSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[ValueParameterDescriptorImpl]

'addAll' @ [251:27] ==> public abstract fun addAll(elements: Collection<PsiElement>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'atEnd' @ [251:34] ==> val atEnd: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'!' @ [253:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritance' @ [253:14] ==> value-parameter inheritance: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[ValueParameterDescriptorImpl]

'commentsAfter' @ [253:26] ==> public final val commentsAfter: Boolean defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[PropertyDescriptorImpl]

'emptyList' @ [253:48] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'SmartList' @ [255:21] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'collectCommentsAndSpacesAfter' @ [255:45] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAfter(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [255:75] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[ValueParameterDescriptorImpl]

'after' @ [256:13] ==> val after: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'isNotEmpty' @ [256:19] ==> @InlineOnly public inline fun <T> Collection<PsiElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'after' @ [257:24] ==> val after: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'last' @ [257:30] ==> public fun <T> List<PsiElement>.last(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'last' @ [258:17] ==> val last: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'after' @ [259:17] ==> val after: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'removeAt' @ [259:23] ==> public abstract fun removeAt(index: Int): PsiElement defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'after' @ [259:32] ==> val after: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'lastIndex' @ [259:38] ==> public val <T> List<PsiElement>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElement

'atEnd' @ [263:22] ==> val atEnd: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'asReversed' @ [263:28] ==> @JvmName public fun <T> MutableList<PsiElement>.asReversed(): MutableList<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'after' @ [263:43] ==> val after: MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [264:9] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'addAll' @ [264:31] ==> public open fun addAll(elements: Collection<PsiElement>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'result' @ [264:38] ==> val result: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'result' @ [265:16] ==> val result: List<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectPostfixElements[LocalVariableDescriptor]

'element' @ [269:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[ValueParameterDescriptorImpl]

'topElement' @ [269:24] ==> private final val topElement: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'this' @ [269:43] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[ReceiverParameterDescriptorImpl]

'element' @ [271:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[ValueParameterDescriptorImpl]

'prevSibling' @ [271:28] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (prev != null) {
            if (prev.isCommentOrSpace()) {
                if (prev !in commentsAndSpacesUsed) {
                    add(prev)
                    collectCommentsAndSpacesBefore(prev)
                }
            }
            else if (prev.isEmptyElement()) {
                collectCommentsAndSpacesBefore(prev)
            }
        }
        else {
            collectCommentsAndSpacesBefore(element.parent!!)
        }' @ [272:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'prev' @ [272:13] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'if (prev.isCommentOrSpace()) {
                if (prev !in commentsAndSpacesUsed) {
                    add(prev)
                    collectCommentsAndSpacesBefore(prev)
                }
            }
            else if (prev.isEmptyElement()) {
                collectCommentsAndSpacesBefore(prev)
            }' @ [273:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'prev' @ [273:17] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'isCommentOrSpace' @ [273:22] ==> public final fun PsiElement.isCommentOrSpace(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'prev' @ [274:21] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [274:30] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [275:21] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'prev' @ [275:25] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'collectCommentsAndSpacesBefore' @ [276:21] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesBefore(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'prev' @ [276:52] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'prev' @ [279:22] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'isEmptyElement' @ [279:27] ==> public final fun PsiElement.isEmptyElement(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'collectCommentsAndSpacesBefore' @ [280:17] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesBefore(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'prev' @ [280:48] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[LocalVariableDescriptor]

'collectCommentsAndSpacesBefore' @ [284:13] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesBefore(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [284:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[ValueParameterDescriptorImpl]

'parent' @ [284:52] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [286:16] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesBefore[ReceiverParameterDescriptorImpl]

'element' @ [290:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[ValueParameterDescriptorImpl]

'topElement' @ [290:24] ==> private final val topElement: PsiElement? defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'this' @ [290:43] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[ReceiverParameterDescriptorImpl]

'element' @ [292:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[ValueParameterDescriptorImpl]

'nextSibling' @ [292:28] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (next != null) {
            if (next.isCommentOrSpace()) {
                if (next is PsiWhiteSpace && next.hasLineBreaks()) return this // do not attach anything on next line after element
                if (next !in commentsAndSpacesUsed) {
                    add(next)
                    collectCommentsAndSpacesAfter(next)
                }
            }
            else if (next.isEmptyElement()) {
                collectCommentsAndSpacesAfter(next)
            }
        }
        else {
            collectCommentsAndSpacesAfter(element.parent!!)
        }' @ [293:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'next' @ [293:13] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'if (next.isCommentOrSpace()) {
                if (next is PsiWhiteSpace && next.hasLineBreaks()) return this // do not attach anything on next line after element
                if (next !in commentsAndSpacesUsed) {
                    add(next)
                    collectCommentsAndSpacesAfter(next)
                }
            }
            else if (next.isEmptyElement()) {
                collectCommentsAndSpacesAfter(next)
            }' @ [294:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'next' @ [294:17] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'isCommentOrSpace' @ [294:22] ==> public final fun PsiElement.isCommentOrSpace(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'next' @ [295:21] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'next' @ [295:46] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'hasLineBreaks' @ [295:51] ==> public final fun PsiWhiteSpace.hasLineBreaks(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'this' @ [295:75] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[ReceiverParameterDescriptorImpl]

'next' @ [296:21] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [296:30] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [297:21] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'next' @ [297:25] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'collectCommentsAndSpacesAfter' @ [298:21] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAfter(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'next' @ [298:51] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'next' @ [301:22] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'isEmptyElement' @ [301:27] ==> public final fun PsiElement.isEmptyElement(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'collectCommentsAndSpacesAfter' @ [302:17] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAfter(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'next' @ [302:47] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[LocalVariableDescriptor]

'collectCommentsAndSpacesAfter' @ [306:13] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAfter(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [306:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[ValueParameterDescriptorImpl]

'parent' @ [306:51] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [308:16] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAfter[ReceiverParameterDescriptorImpl]

'element' @ [312:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[ValueParameterDescriptorImpl]

'firstChild' @ [312:29] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [313:16] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'if (child.isCommentOrSpace()) {
                if (child !in commentsAndSpacesUsed) add(child) else break
            }
            else if (!child.isEmptyElement()) {
                collectCommentsAndSpacesAtStart(child)
                break
            }' @ [314:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'child' @ [314:17] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'isCommentOrSpace' @ [314:23] ==> public final fun PsiElement.isCommentOrSpace(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'if (child !in commentsAndSpacesUsed) add(child) else break' @ [315:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'child' @ [315:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [315:31] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [315:54] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'child' @ [315:58] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'!' @ [317:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'child' @ [317:23] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'isEmptyElement' @ [317:29] ==> public final fun PsiElement.isEmptyElement(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'collectCommentsAndSpacesAtStart' @ [318:17] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAtStart(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'child' @ [318:49] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'child' @ [321:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'child' @ [321:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[LocalVariableDescriptor]

'nextSibling' @ [321:27] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [323:16] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtStart[ReceiverParameterDescriptorImpl]

'element' @ [327:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[ValueParameterDescriptorImpl]

'lastChild' @ [327:29] ==> public final val PsiElement.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [328:16] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'if (child.isCommentOrSpace()) {
                if (child !in commentsAndSpacesUsed) add(child) else break
            }
            else if (!child.isEmptyElement()) {
                collectCommentsAndSpacesAtEnd(child)
                break
            }' @ [329:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'child' @ [329:17] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'isCommentOrSpace' @ [329:23] ==> public final fun PsiElement.isCommentOrSpace(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'if (child !in commentsAndSpacesUsed) add(child) else break' @ [330:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'child' @ [330:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'commentsAndSpacesUsed' @ [330:31] ==> private final val commentsAndSpacesUsed: HashSet<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'add' @ [330:54] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'child' @ [330:58] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'!' @ [332:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'child' @ [332:23] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'isEmptyElement' @ [332:29] ==> public final fun PsiElement.isEmptyElement(): Boolean defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion[SimpleFunctionDescriptorImpl]

'collectCommentsAndSpacesAtEnd' @ [333:17] ==> private final fun MutableList<PsiElement>.collectCommentsAndSpacesAtEnd(element: PsiElement): MutableList<PsiElement> defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'child' @ [333:47] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'child' @ [336:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'child' @ [336:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[LocalVariableDescriptor]

'prevSibling' @ [336:27] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [338:16] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.collectCommentsAndSpacesAtEnd[ReceiverParameterDescriptorImpl]

'when {
                isEmpty() -> other

                other.isEmpty() -> this

                else -> {
                    val result = ArrayList<T>(size + other.size)
                    result.addAll(this)
                    result.addAll(other)
                    result
                }
            }' @ [343:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<T>, entry1: List<T>, entry2: List<T>): List<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<T>

'isEmpty' @ [344:17] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'other' @ [344:30] ==> value-parameter other: List<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[ValueParameterDescriptorImpl]

'other' @ [346:17] ==> value-parameter other: List<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[ValueParameterDescriptorImpl]

'isEmpty' @ [346:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'this' @ [346:36] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[ReceiverParameterDescriptorImpl]

'ArrayList' @ [349:34] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'size' @ [349:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'other' @ [349:54] ==> value-parameter other: List<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[ValueParameterDescriptorImpl]

'size' @ [349:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'result' @ [350:21] ==> val result: ArrayList<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[LocalVariableDescriptor]

'addAll' @ [350:28] ==> public open fun addAll(elements: Collection<T>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'this' @ [350:35] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[ReceiverParameterDescriptorImpl]

'result' @ [351:21] ==> val result: ArrayList<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[LocalVariableDescriptor]

'addAll' @ [351:28] ==> public open fun addAll(elements: Collection<T>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'other' @ [351:35] ==> value-parameter other: List<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[ValueParameterDescriptorImpl]

'result' @ [352:21] ==> val result: ArrayList<T> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.plus[LocalVariableDescriptor]

'if (size <= 1)
                this
            else
                this.asReversed()' @ [358:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<T>, elseBranch: List<T>): List<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<T>

'size' @ [358:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'this' @ [359:17] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.reversed[ReceiverParameterDescriptorImpl]

'this' @ [361:17] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.reversed[ReceiverParameterDescriptorImpl]

'asReversed' @ [361:22] ==> public fun <T> List<T>.asReversed(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [364:45] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isCommentOrSpace[ReceiverParameterDescriptorImpl]

'this' @ [364:67] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isCommentOrSpace[ReceiverParameterDescriptorImpl]

'this' @ [366:47] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isEndOfLineComment[ReceiverParameterDescriptorImpl]

'tokenType' @ [366:69] ==> public final val PsiComment.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'END_OF_LINE_COMMENT' @ [366:96] ==> public final val END_OF_LINE_COMMENT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'firstChild' @ [368:43] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'textLength' @ [368:65] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'this' @ [371:17] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isCommentAtFirstColumn[ReceiverParameterDescriptorImpl]

'this' @ [371:40] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isCommentAtFirstColumn[ReceiverParameterDescriptorImpl]

'prevSibling' @ [371:45] ==> public final val PsiComment.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [371:58] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Boolean

'it' @ [371:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isCommentAtFirstColumn.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [371:87] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isCommentAtFirstColumn.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [371:90] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [371:95] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [374:17] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isFirstNonWhitespaceElementInLine[ReceiverParameterDescriptorImpl]

'this' @ [374:40] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isFirstNonWhitespaceElementInLine[ReceiverParameterDescriptorImpl]

'prevSibling' @ [374:45] ==> public final val PsiComment.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [374:58] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Boolean

'it' @ [374:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isFirstNonWhitespaceElementInLine.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [374:87] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.isFirstNonWhitespaceElementInLine.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [374:90] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [374:95] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getLineBreakCount' @ [376:57] ==> @Contract public open fun getLineBreakCount(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [376:75] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'containsLineBreak' @ [378:56] ==> @Contract public open fun containsLineBreak(@NotNull p0: CharSequence): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [378:74] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'length' @ [381:21] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'i' @ [382:20] ==> var i: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.trailingLineBreakCount[LocalVariableDescriptor]

'this' @ [382:30] ==> <this> defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.trailingLineBreakCount[ReceiverParameterDescriptorImpl]

'i' @ [382:35] ==> var i: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.trailingLineBreakCount[LocalVariableDescriptor]

'i' @ [383:17] ==> var i: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.trailingLineBreakCount[LocalVariableDescriptor]

'length' @ [385:20] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'i' @ [385:29] ==> var i: Int defined in org.jetbrains.kotlin.j2k.CodeBuilder.Companion.trailingLineBreakCount[LocalVariableDescriptor]

