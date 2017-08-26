'KotlinQuickFixAction<KtDeclaration>' @ [31:57] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtDeclaration

'declaration' @ [31:93] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.<init>[ValueParameterDescriptorImpl]

'editor' @ [35:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.invoke[ValueParameterDescriptorImpl]

'getInstance' @ [36:39] ==> public open fun getInstance(): (DataManager..DataManager?) defined in com.intellij.ide.DataManager[JavaMethodDescriptor]

'getDataContext' @ [36:53] ==> public abstract fun getDataContext(p0: (Component..Component?)): (DataContext..DataContext?) defined in com.intellij.ide.DataManager[JavaMethodDescriptor]

'editor' @ [36:68] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.invoke[ValueParameterDescriptorImpl]

'component' @ [36:75] ==> public final val Editor.component: JComponent[MyPropertyDescriptor]

'getInstance' @ [37:51] ==> public open fun getInstance(): (RenameHandlerRegistry..RenameHandlerRegistry?) defined in com.intellij.refactoring.rename.RenameHandlerRegistry[JavaMethodDescriptor]

'getRenameHandler' @ [37:65] ==> @Nullable public open fun getRenameHandler(p0: (DataContext..DataContext?)): RenameHandler? defined in com.intellij.refactoring.rename.RenameHandlerRegistry[JavaMethodDescriptor]

'dataContext' @ [37:82] ==> val dataContext: (DataContext..DataContext?) defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.invoke[LocalVariableDescriptor]

'renameHandler' @ [38:9] ==> val renameHandler: RenameHandler? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.invoke[LocalVariableDescriptor]

'invoke' @ [38:24] ==> public abstract fun invoke(@NotNull p0: Project, @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), p2: (DataContext..DataContext?)): Unit defined in com.intellij.refactoring.rename.RenameHandler[JavaMethodDescriptor]

'project' @ [38:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.invoke[ValueParameterDescriptorImpl]

'arrayOf' @ [38:40] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtDeclaration?): Array<KtDeclaration?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtDeclaration?

'element' @ [38:48] ==> protected final val element: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix[PropertyDescriptorImpl]

'dataContext' @ [38:58] ==> val dataContext: (DataContext..DataContext?) defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.invoke[LocalVariableDescriptor]

'super' @ [42:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [42:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [42:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [42:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [42:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [42:60] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.isAvailable[ValueParameterDescriptorImpl]

'text' @ [46:44] ==> public final val RenameUnderscoreFix.text: String[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [48:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [50:31] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [50:42] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [50:53] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'diagnostic' @ [51:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [51:28] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'declaration' @ [51:43] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.Companion.createAction[LocalVariableDescriptor]

'nameIdentifier' @ [51:84] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'RenameUnderscoreFix' @ [52:24] ==> public constructor RenameUnderscoreFix(declaration: KtDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix[ClassConstructorDescriptorImpl]

'declaration' @ [52:44] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.RenameUnderscoreFix.Companion.createAction[LocalVariableDescriptor]

