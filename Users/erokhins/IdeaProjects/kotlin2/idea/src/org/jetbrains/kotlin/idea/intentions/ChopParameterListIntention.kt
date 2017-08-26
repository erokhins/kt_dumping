'SelfTargetingOffsetIndependentIntention<TList>' @ [35:5] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<TList>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> TList

'listClass' @ [35:52] ==> value-parameter listClass: Class<TList> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.<init>[ValueParameterDescriptorImpl]

'text' @ [35:63] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.<init>[ValueParameterDescriptorImpl]

'element' @ [38:24] ==> value-parameter element: TList defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.isApplicableTo[ValueParameterDescriptorImpl]

'elements' @ [38:32] ==> private final fun TList.elements(): List<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[SimpleFunctionDescriptorImpl]

'elements' @ [39:13] ==> val elements: List<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.isApplicableTo[LocalVariableDescriptor]

'size' @ [39:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'elements' @ [40:13] ==> val elements: List<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.isApplicableTo[LocalVariableDescriptor]

'dropLast' @ [40:22] ==> public fun <T> List<TElement>.dropLast(n: Int): List<TElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TElement

'all' @ [40:34] ==> public inline fun <T> Iterable<TElement>.all(predicate: (TElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TElement

'hasLineBreakAfter' @ [40:40] ==> private final fun hasLineBreakAfter(element: TElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[SimpleFunctionDescriptorImpl]

'it' @ [40:58] ==> value-parameter it: TElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [45:23] ==> value-parameter list: TList defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [45:28] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'editor' @ [46:24] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[ValueParameterDescriptorImpl]

'document' @ [46:33] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'list' @ [47:27] ==> value-parameter list: TList defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[ValueParameterDescriptorImpl]

'startOffset' @ [47:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'list' @ [49:24] ==> value-parameter list: TList defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[ValueParameterDescriptorImpl]

'elements' @ [49:29] ==> private final fun TList.elements(): List<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[SimpleFunctionDescriptorImpl]

'!' @ [50:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasLineBreakAfter' @ [50:14] ==> private final fun hasLineBreakAfter(element: TElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[SimpleFunctionDescriptorImpl]

'elements' @ [50:32] ==> val elements: List<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'last' @ [50:41] ==> public fun <T> List<TElement>.last(): TElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TElement

'list' @ [51:24] ==> value-parameter list: TList defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[ValueParameterDescriptorImpl]

'allChildren' @ [51:29] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lastOrNull' @ [51:41] ==> public inline fun <T> Sequence<PsiElement>.lastOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [51:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [51:57] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [51:62] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'RPAR' @ [51:86] ==> public final val RPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'rpar' @ [52:13] ==> val rpar: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [52:19] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'let' @ [52:32] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Unit

'document' @ [52:38] ==> val document: Document defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'insertString' @ [52:47] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'it' @ [52:60] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [55:25] ==> val elements: List<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'asReversed' @ [55:34] ==> public fun <T> List<TElement>.asReversed(): List<TElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TElement

'!' @ [56:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasLineBreakBefore' @ [56:18] ==> private final fun hasLineBreakBefore(element: TElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[SimpleFunctionDescriptorImpl]

'element' @ [56:37] ==> val element: TElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'document' @ [57:17] ==> val document: Document defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'insertString' @ [57:26] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'element' @ [57:39] ==> val element: TElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [57:47] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getInstance' @ [61:50] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [61:62] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'documentManager' @ [62:9] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'commitDocument' @ [62:25] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [62:40] ==> val document: Document defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'documentManager' @ [63:23] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'getPsiFile' @ [63:39] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [63:50] ==> val document: Document defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'!!' @ [64:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: TList?): TList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> TList

'getParentOfType' @ [64:35] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(TList..TList?)>): TList? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (TList..TList?)

'psiFile' @ [64:51] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'findElementAt' @ [64:59] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'startOffset' @ [64:73] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'listClass' @ [64:89] ==> private final val listClass: Class<TList> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[PropertyDescriptorImpl]

'getInstance' @ [65:26] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [65:38] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'adjustLineIndent' @ [65:47] ==> public abstract fun adjustLineIndent(@NotNull p0: PsiFile, p1: (TextRange..TextRange?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'psiFile' @ [65:64] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'newList' @ [65:73] ==> val newList: TList defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.applyTo[LocalVariableDescriptor]

'textRange' @ [65:81] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [69:16] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakAfter[ValueParameterDescriptorImpl]

'siblings' @ [70:18] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'takeWhile' @ [71:18] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [71:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elementClass' @ [71:31] ==> private final val elementClass: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[PropertyDescriptorImpl]

'isInstance' @ [71:44] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [71:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakAfter.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [72:18] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [72:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakAfter.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [72:47] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakAfter.<anonymous>[ValueParameterDescriptorImpl]

'textContains' @ [72:50] ==> @Contract public abstract fun textContains(p0: Char): Boolean defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'element' @ [76:16] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakBefore[ValueParameterDescriptorImpl]

'siblings' @ [77:18] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'takeWhile' @ [78:18] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [78:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elementClass' @ [78:31] ==> private final val elementClass: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[PropertyDescriptorImpl]

'isInstance' @ [78:44] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [78:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakBefore.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [79:18] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [79:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakBefore.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [79:47] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.hasLineBreakBefore.<anonymous>[ValueParameterDescriptorImpl]

'textContains' @ [79:50] ==> @Contract public abstract fun textContains(p0: Char): Boolean defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'allChildren' @ [83:16] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filter' @ [84:18] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'elementClass' @ [84:27] ==> private final val elementClass: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[PropertyDescriptorImpl]

'isInstance' @ [84:40] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [84:51] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.elements.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [85:18] ==> public fun <T, R> Sequence<PsiElement>.map(transform: (PsiElement) -> TElement): Sequence<TElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> TElement

'Suppress' @ [86:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'it' @ [87:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention.elements.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [89:18] ==> public fun <T> Sequence<TElement>.toList(): List<TElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TElement

'AbstractChopListIntention<KtParameterList, KtParameter>' @ [93:36] ==> public constructor AbstractChopListIntention<TList : KtElement, TElement : KtElement>(listClass: Class<KtParameterList>, elementClass: Class<KtParameter>, text: String) defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[ClassConstructorDescriptorImpl]
Inferred types:
    <TList : KtElement> -> KtParameterList
    <TElement : KtElement> -> KtParameter

'java' @ [94:32] ==> public val <T> KClass<KtParameterList>.java: Class<KtParameterList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameterList

'java' @ [95:28] ==> public val <T> KClass<KtParameter>.java: Class<KtParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameter

'element' @ [99:13] ==> value-parameter element: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.ChopParameterListIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [99:21] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'super' @ [100:16] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ChopParameterListIntention[LazyClassReceiverParameterDescriptor]

'isApplicableTo' @ [100:22] ==> public open fun isApplicableTo(element: KtParameterList): Boolean defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[SimpleFunctionDescriptorImpl]

'element' @ [100:37] ==> value-parameter element: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.ChopParameterListIntention.isApplicableTo[ValueParameterDescriptorImpl]

'AbstractChopListIntention<KtValueArgumentList, KtValueArgument>' @ [104:35] ==> public constructor AbstractChopListIntention<TList : KtElement, TElement : KtElement>(listClass: Class<KtValueArgumentList>, elementClass: Class<KtValueArgument>, text: String) defined in org.jetbrains.kotlin.idea.intentions.AbstractChopListIntention[ClassConstructorDescriptorImpl]
Inferred types:
    <TList : KtElement> -> KtValueArgumentList
    <TElement : KtElement> -> KtValueArgument

'KtValueArgumentList' @ [105:9] ==> public constructor KtValueArgumentList(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaClassConstructorDescriptor]

'java' @ [105:36] ==> public val <T> KClass<KtValueArgumentList>.java: Class<KtValueArgumentList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgumentList

'KtValueArgument' @ [106:9] ==> public constructor KtValueArgument(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaClassConstructorDescriptor]

'java' @ [106:32] ==> public val <T> KClass<KtValueArgument>.java: Class<KtValueArgument> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgument

