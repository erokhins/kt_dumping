'Suppress' @ [35:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'text' @ [39:42] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.<init>[ValueParameterDescriptorImpl]

'text' @ [42:41] ==> private final var text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'this' @ [45:9] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[LazyClassReceiverParameterDescriptor]

'text' @ [45:14] ==> private final var text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'text' @ [45:21] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.setText[ValueParameterDescriptorImpl]

'text' @ [48:36] ==> private final var text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'familyName' @ [49:42] ==> private final val familyName: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'editor' @ [56:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[ValueParameterDescriptorImpl]

'caretModel' @ [56:29] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [56:40] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'file' @ [57:21] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[ValueParameterDescriptorImpl]

'findElementAt' @ [57:26] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [57:40] ==> val offset: Int defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'file' @ [58:21] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[ValueParameterDescriptorImpl]

'findElementAt' @ [58:26] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [58:40] ==> val offset: Int defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'if (leaf1 != null && leaf2 != null) PsiTreeUtil.findCommonParent(leaf1, leaf2) else null' @ [59:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'leaf1' @ [59:32] ==> val leaf1: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'leaf2' @ [59:49] ==> val leaf2: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'findCommonParent' @ [59:76] ==> @Nullable public open fun findCommonParent(@NotNull p0: PsiElement, @NotNull p1: PsiElement): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'leaf1' @ [59:93] ==> val leaf1: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'leaf2' @ [59:100] ==> val leaf2: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'emptySequence' @ [61:53] ==> public fun <T> emptySequence(): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'leaf1' @ [62:13] ==> val leaf1: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'elementsToCheck' @ [63:13] ==> var elementsToCheck: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'leaf1' @ [63:32] ==> val leaf1: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'parentsWithSelf' @ [63:38] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [63:54] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [63:66] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget.<anonymous>[ValueParameterDescriptorImpl]

'commonParent' @ [63:72] ==> val commonParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'leaf2' @ [65:13] ==> val leaf2: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'elementsToCheck' @ [66:13] ==> var elementsToCheck: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'leaf2' @ [66:32] ==> val leaf2: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'parentsWithSelf' @ [66:38] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [66:54] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [66:66] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget.<anonymous>[ValueParameterDescriptorImpl]

'commonParent' @ [66:72] ==> val commonParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'commonParent' @ [68:13] ==> val commonParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'commonParent' @ [68:37] ==> val commonParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'elementsToCheck' @ [69:13] ==> var elementsToCheck: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'commonParent' @ [69:32] ==> val commonParent: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'parentsWithSelf' @ [69:45] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'elementsToCheck' @ [72:25] ==> var elementsToCheck: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'Suppress' @ [73:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'elementType' @ [74:17] ==> public final val elementType: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'isInstance' @ [74:29] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'element' @ [74:40] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'isApplicableTo' @ [74:52] ==> public abstract fun isApplicableTo(element: TElement, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[SimpleFunctionDescriptorImpl]

'element' @ [74:67] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'offset' @ [74:88] ==> val offset: Int defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'element' @ [75:24] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'!' @ [77:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowCaretInsideElement' @ [77:18] ==> protected open fun allowCaretInsideElement(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[SimpleFunctionDescriptorImpl]

'element' @ [77:42] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'element' @ [77:54] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'textRange' @ [77:62] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsInside' @ [77:72] ==> public fun TextRange.containsInside(offset: Int): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'offset' @ [77:87] ==> val offset: Int defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.getTarget[LocalVariableDescriptor]

'element' @ [83:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'getTarget' @ [85:87] ==> private final fun getTarget(editor: Editor, file: PsiFile): TElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[SimpleFunctionDescriptorImpl]

'editor' @ [85:97] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.isAvailable[ValueParameterDescriptorImpl]

'file' @ [85:105] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.isAvailable[ValueParameterDescriptorImpl]

'getInstance' @ [91:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [91:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.invoke[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [91:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getTarget' @ [92:22] ==> private final fun getTarget(editor: Editor, file: PsiFile): TElement? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[SimpleFunctionDescriptorImpl]

'editor' @ [92:32] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.invoke[ValueParameterDescriptorImpl]

'file' @ [92:40] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.invoke[ValueParameterDescriptorImpl]

'!' @ [93:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [93:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [93:52] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'target' @ [93:78] ==> val target: TElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.invoke[LocalVariableDescriptor]

'applyTo' @ [94:9] ==> public abstract fun applyTo(element: TElement, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[SimpleFunctionDescriptorImpl]

'target' @ [94:17] ==> val target: TElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.invoke[LocalVariableDescriptor]

'editor' @ [94:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.invoke[ValueParameterDescriptorImpl]

'getText' @ [99:39] ==> public final fun getText(): String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[SimpleFunctionDescriptorImpl]

'other' @ [103:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'this' @ [103:47] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[LazyClassReceiverParameterDescriptor]

'other' @ [103:55] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'action' @ [103:61] ==> public final val IntentionWrapper.action: IntentionAction[MyPropertyDescriptor]

'other' @ [104:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'this' @ [104:81] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[LazyClassReceiverParameterDescriptor]

'other' @ [104:89] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'intention' @ [104:95] ==> public final val intention: SelfTargetingRangeIntention<out PsiElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'other' @ [105:16] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'javaClass' @ [105:54] ==> public val <T : Any> SelfTargetingIntention<TElement>.javaClass: Class<SelfTargetingIntention<TElement>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SelfTargetingIntention<TElement>

'other' @ [105:67] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'javaClass' @ [105:73] ==> public val <T : Any> SelfTargetingIntention<out PsiElement>.javaClass: Class<SelfTargetingIntention<out PsiElement>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SelfTargetingIntention<out PsiElement>

'text' @ [105:86] ==> private final var text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'other' @ [105:94] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention.equals[ValueParameterDescriptorImpl]

'text' @ [105:100] ==> private final var text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[PropertyDescriptorImpl]

'text' @ [114:30] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.<init>[ValueParameterDescriptorImpl]

'SelfTargetingIntention<TElement>' @ [115:5] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<TElement>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'elementType' @ [115:38] ==> value-parameter elementType: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.<init>[ValueParameterDescriptorImpl]

'text' @ [115:51] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.<init>[ValueParameterDescriptorImpl]

'familyName' @ [115:57] ==> value-parameter familyName: String = ... defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.<init>[ValueParameterDescriptorImpl]

'applicabilityRange' @ [120:21] ==> public abstract fun applicabilityRange(element: TElement): TextRange? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[SimpleFunctionDescriptorImpl]

'element' @ [120:40] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.isApplicableTo[ValueParameterDescriptorImpl]

'range' @ [121:16] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.isApplicableTo[LocalVariableDescriptor]

'containsOffset' @ [121:22] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [121:37] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention.isApplicableTo[ValueParameterDescriptorImpl]

'text' @ [128:30] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention.<init>[ValueParameterDescriptorImpl]

'SelfTargetingRangeIntention<TElement>' @ [129:5] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<TElement>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'elementType' @ [129:43] ==> value-parameter elementType: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention.<init>[ValueParameterDescriptorImpl]

'text' @ [129:56] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention.<init>[ValueParameterDescriptorImpl]

'familyName' @ [129:62] ==> value-parameter familyName: String = ... defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention.<init>[ValueParameterDescriptorImpl]

'if (isApplicableTo(element)) element.textRange else null' @ [134:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'isApplicableTo' @ [134:20] ==> public abstract fun isApplicableTo(element: TElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[SimpleFunctionDescriptorImpl]

'element' @ [134:35] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention.applicabilityRange[ValueParameterDescriptorImpl]

'element' @ [134:45] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention.applicabilityRange[ValueParameterDescriptorImpl]

'textRange' @ [134:53] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

