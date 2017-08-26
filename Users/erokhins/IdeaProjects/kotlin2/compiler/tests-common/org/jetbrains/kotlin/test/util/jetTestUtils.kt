'this' @ [28:9] ==> <this> defined in org.jetbrains.kotlin.test.util.trimTrailingWhitespacesAndAddNewlineAtEOF[ReceiverParameterDescriptorImpl]

'split' @ [28:14] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [28:26] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [28:32] ==> value-parameter it: String defined in org.jetbrains.kotlin.test.util.trimTrailingWhitespacesAndAddNewlineAtEOF.<anonymous>[ValueParameterDescriptorImpl]

'trimEnd' @ [28:35] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [28:47] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [28:78] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (result.endsWith("\n")) result else result + "\n"' @ [29:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'result' @ [29:27] ==> value-parameter result: String defined in org.jetbrains.kotlin.test.util.trimTrailingWhitespacesAndAddNewlineAtEOF.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [29:34] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'result' @ [29:50] ==> value-parameter result: String defined in org.jetbrains.kotlin.test.util.trimTrailingWhitespacesAndAddNewlineAtEOF.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [29:62] ==> value-parameter result: String defined in org.jetbrains.kotlin.test.util.trimTrailingWhitespacesAndAddNewlineAtEOF.<anonymous>[ValueParameterDescriptorImpl]

'findElementsByCommentPrefix' @ [33:9] ==> public fun PsiFile.findElementsByCommentPrefix(prefix: String): Map<PsiElement, String> defined in org.jetbrains.kotlin.test.util in file jetTestUtils.kt[SimpleFunctionDescriptorImpl]

'commentText' @ [33:37] ==> value-parameter commentText: String defined in org.jetbrains.kotlin.test.util.findElementByCommentPrefix[ValueParameterDescriptorImpl]

'keys' @ [33:50] ==> public abstract val keys: Set<PsiElement> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'singleOrNull' @ [33:55] ==> public fun <T> Iterable<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'emptyMap' @ [36:28] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (SmartFMap<(PsiElement..PsiElement?), (String..String?)>..SmartFMap<(PsiElement..PsiElement?), (String..String?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'accept' @ [37:5] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [38:22] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'comment' @ [40:39] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'text' @ [40:47] ==> public final val PsiComment.text: (String..String?)[MyPropertyDescriptor]

'commentText' @ [41:25] ==> val commentText: (String..String?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[LocalVariableDescriptor]

'startsWith' @ [41:37] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [41:48] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix[ValueParameterDescriptorImpl]

'comment' @ [42:38] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'parent' @ [42:46] ==> public final val PsiComment.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                            is KtDeclaration -> parent
                            is PsiMember -> parent
                            else -> PsiTreeUtil.skipSiblingsForward(
                                    comment,
                                    PsiWhiteSpace::class.java, PsiComment::class.java, KtPackageDirective::class.java
                            )
                        }' @ [43:44] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'parent' @ [43:50] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[LocalVariableDescriptor]

'parent' @ [44:49] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[LocalVariableDescriptor]

'parent' @ [45:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[LocalVariableDescriptor]

'skipSiblingsForward' @ [46:49] ==> @Nullable @Contract public open fun skipSiblingsForward(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'comment' @ [47:37] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'java' @ [48:58] ==> public val <T> KClass<PsiWhiteSpace>.java: Class<PsiWhiteSpace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiWhiteSpace

'java' @ [48:82] ==> public val <T> KClass<PsiComment>.java: Class<PsiComment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiComment

'java' @ [48:114] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'result' @ [52:25] ==> var result: (SmartFMap<(PsiElement..PsiElement?), (String..String?)>..SmartFMap<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix[LocalVariableDescriptor]

'result' @ [52:34] ==> var result: (SmartFMap<(PsiElement..PsiElement?), (String..String?)>..SmartFMap<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix[LocalVariableDescriptor]

'plus' @ [52:41] ==> public open fun plus(@NotNull p0: PsiElement, p1: (String..String?)): (SmartFMap<(PsiElement..PsiElement?), (String..String?)>..SmartFMap<(PsiElement..PsiElement?), (String..String?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'elementToAdd' @ [52:46] ==> val elementToAdd: PsiElement defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[LocalVariableDescriptor]

'commentText' @ [52:60] ==> val commentText: (String..String?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix.<no name provided>.visitComment[LocalVariableDescriptor]

'substring' @ [52:72] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [52:82] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix[ValueParameterDescriptorImpl]

'length' @ [52:89] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'trim' @ [52:97] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'result' @ [57:12] ==> var result: (SmartFMap<(PsiElement..PsiElement?), (String..String?)>..SmartFMap<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.test.util.findElementsByCommentPrefix[LocalVariableDescriptor]

'dir' @ [61:12] ==> value-parameter dir: File defined in org.jetbrains.kotlin.test.util.findLastModifiedFile[ValueParameterDescriptorImpl]

'walk' @ [61:16] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filterNot' @ [61:23] ==> public fun <T> Sequence<File>.filterNot(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'skipFile' @ [61:33] ==> value-parameter skipFile: (File) -> Boolean defined in org.jetbrains.kotlin.test.util.findLastModifiedFile[ValueParameterDescriptorImpl]

'maxBy' @ [61:43] ==> public inline fun <T, R : Comparable<Long>> Sequence<File>.maxBy(selector: (File) -> Long): File? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R : Comparable<R>> -> Long

'it' @ [61:51] ==> value-parameter it: File defined in org.jetbrains.kotlin.test.util.findLastModifiedFile.<anonymous>[ValueParameterDescriptorImpl]

'lastModified' @ [61:54] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

