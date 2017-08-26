'getCannotRefactorMessage' @ [42:41] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'wrongPositionMessage' @ [42:66] ==> private final val wrongPositionMessage: String defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[PropertyDescriptorImpl]

'showErrorHint' @ [43:31] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [43:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.reportWrongPosition[ValueParameterDescriptorImpl]

'editor' @ [43:54] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.reportWrongPosition[ValueParameterDescriptorImpl]

'message' @ [43:62] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.reportWrongPosition[LocalVariableDescriptor]

'refactoringName' @ [43:71] ==> private final val refactoringName: String defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[PropertyDescriptorImpl]

'helpId' @ [43:88] ==> private final val helpId: String defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[PropertyDescriptorImpl]

'if (hasValOrVar()) (ownerFunction as? KtPrimaryConstructor)?.containingClassOrObject else null' @ [46:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject?, elseBranch: KtClassOrObject?): KtClassOrObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject?

'hasValOrVar' @ [46:56] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'ownerFunction' @ [46:72] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'containingClassOrObject' @ [46:113] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getCannotRefactorMessage' @ [49:41] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'message' @ [50:35] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'refactoringName' @ [50:86] ==> private final val refactoringName: String defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[PropertyDescriptorImpl]

'showErrorHint' @ [52:31] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [52:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.reportWrongContext[ValueParameterDescriptorImpl]

'editor' @ [52:54] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.reportWrongContext[ValueParameterDescriptorImpl]

'message' @ [52:62] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.reportWrongContext[LocalVariableDescriptor]

'refactoringName' @ [52:71] ==> private final val refactoringName: String defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[PropertyDescriptorImpl]

'helpId' @ [52:88] ==> private final val helpId: String defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[PropertyDescriptorImpl]

'editor' @ [62:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [62:29] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [62:40] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'editor' @ [63:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'scrollingModel' @ [63:16] ==> public final val Editor.scrollingModel: ScrollingModel[MyPropertyDescriptor]

'scrollToCaret' @ [63:31] ==> public abstract fun scrollToCaret(@NotNull p0: ScrollType): Unit defined in com.intellij.openapi.editor.ScrollingModel[JavaMethodDescriptor]

'MAKE_VISIBLE' @ [63:56] ==> enum entry MAKE_VISIBLE defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'file' @ [65:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'findElementAt' @ [65:28] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [65:42] ==> val offset: Int defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'parentsWithSelf' @ [65:61] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [65:77] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [66:13] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [67:18] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [67:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [67:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [67:67] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [68:16] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [68:37] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [68:40] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'it' @ [68:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'ownerFunction' @ [68:60] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'target' @ [71:13] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'reportWrongPosition' @ [72:13] ==> private final fun reportWrongPosition(project: Project, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[SimpleFunctionDescriptorImpl]

'project' @ [72:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [72:42] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'!' @ [75:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [75:14] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'canRefactor' @ [75:21] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [77:9] ==> public open fun invoke(project: Project, elements: Array<out PsiElement>, dataContext: DataContext?): Unit defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[SimpleFunctionDescriptorImpl]

'project' @ [77:16] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'arrayOf' @ [77:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'target' @ [77:33] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'dataContext' @ [77:42] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'elements' @ [81:23] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'singleOrNull' @ [81:32] ==> public fun <T> Array<out PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'dataContext' @ [83:22] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'let' @ [83:35] ==> @InlineOnly public inline fun <T, R> DataContext.let(block: (DataContext) -> Editor?): Editor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataContext
    <R> -> Editor?

'EDITOR' @ [83:56] ==> public final val EDITOR: (DataKey<(Editor..Editor?)>..DataKey<(Editor..Editor?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [83:63] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Editor? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'it' @ [83:71] ==> value-parameter it: DataContext defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [85:14] ==> public final operator fun component1(): KtClassOrObject? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [85:29] ==> public final operator fun component2(): KtNamedDeclaration? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (element) {
            is KtNamedFunction, is KtProperty -> element.getStrictParentOfType<KtClassOrObject>() to element as KtNamedDeclaration?
            is KtParameter -> element.getContainingClass() to element
            is KtClassOrObject -> element to null
            else -> {
                reportWrongPosition(project, editor)
                return
            }
        }' @ [85:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<KtClassOrObject?, KtNamedDeclaration?>, entry1: Pair<KtClassOrObject?, KtNamedDeclaration?>, entry2: Pair<KtClassOrObject?, KtNamedDeclaration?>, entry3: Pair<KtClassOrObject?, KtNamedDeclaration?>): Pair<KtClassOrObject?, KtNamedDeclaration?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<KtClassOrObject?, KtNamedDeclaration?>

'element' @ [85:45] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'element' @ [86:50] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'getStrictParentOfType' @ [86:58] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'element' @ [86:102] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'element' @ [87:31] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'getContainingClass' @ [87:39] ==> private final fun KtParameter.getContainingClass(): KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[SimpleFunctionDescriptorImpl]

'element' @ [87:63] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'element' @ [88:35] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'reportWrongPosition' @ [90:17] ==> private final fun reportWrongPosition(project: Project, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[SimpleFunctionDescriptorImpl]

'project' @ [90:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [90:46] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'invoke' @ [95:9] ==> protected abstract fun invoke(project: Project, editor: Editor?, classOrObject: KtClassOrObject?, member: KtNamedDeclaration?, dataContext: DataContext?): Unit defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[SimpleFunctionDescriptorImpl]

'project' @ [95:16] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [95:25] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'classOrObject' @ [95:33] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'member' @ [95:48] ==> val member: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[LocalVariableDescriptor]

'dataContext' @ [95:56] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.invoke[ValueParameterDescriptorImpl]

'elements' @ [99:16] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.isEnabledOnElements[ValueParameterDescriptorImpl]

'mapTo' @ [99:25] ==> public inline fun <T, R, C : MutableCollection<in PsiElement>> Array<out PsiElement>.mapTo(destination: HashSet<PsiElement>, transform: (PsiElement) -> PsiElement): HashSet<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement
    <C : MutableCollection<in R>> -> HashSet<PsiElement>

'HashSet' @ [99:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'when (it) {
                is KtNamedFunction, is KtProperty -> (it.parent as? KtClassBody)?.parent as? KtClassOrObject
                is KtParameter -> it.getContainingClass()
                is KtClassOrObject -> it
                else -> null
            }' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtClassOrObject?, entry1: KtClassOrObject?, entry2: KtClassOrObject?, entry3: KtClassOrObject?): KtClassOrObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtClassOrObject?

'it' @ [100:19] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.isEnabledOnElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [101:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.isEnabledOnElements.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [101:58] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [101:83] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [102:35] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.isEnabledOnElements.<anonymous>[ValueParameterDescriptorImpl]

'getContainingClass' @ [102:38] ==> private final fun KtParameter.getContainingClass(): KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler[SimpleFunctionDescriptorImpl]

'it' @ [103:39] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.AbstractPullPushMembersHandler.isEnabledOnElements.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [106:11] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

