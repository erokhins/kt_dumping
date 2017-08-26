'InlineActionHandler' @ [43:36] ==> public constructor InlineActionHandler() defined in com.intellij.lang.refactoring.InlineActionHandler[JavaClassConstructorDescriptor]

'language' @ [44:61] ==> value-parameter language: Language defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.isEnabledForLanguage[ValueParameterDescriptorImpl]

'INSTANCE' @ [44:88] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'element' @ [47:58] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.canInlineElement[ValueParameterDescriptorImpl]

'element' @ [47:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.canInlineElement[ValueParameterDescriptorImpl]

'hasBody' @ [47:96] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'element' @ [50:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'editor' @ [52:25] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'let' @ [52:33] ==> @InlineOnly public inline fun <T, R> Editor.let(block: (Editor) -> PsiReference?): PsiReference? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor
    <R> -> PsiReference?

'findReference' @ [52:57] ==> @Nullable public open fun findReference(@NotNull p0: Editor, p1: Int): PsiReference? defined in com.intellij.codeInsight.TargetElementUtil[JavaMethodDescriptor]

'it' @ [52:71] ==> value-parameter it: Editor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [52:75] ==> value-parameter it: Editor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement.<anonymous>[ValueParameterDescriptorImpl]

'caretModel' @ [52:78] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [52:89] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'when (reference) {
            is KtSimpleNameReference -> reference
            is PsiMultiReference -> reference.references.firstIsInstanceOrNull<KtSimpleNameReference>()
            else -> null
        }' @ [53:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtSimpleNameReference?, entry1: KtSimpleNameReference?, entry2: KtSimpleNameReference?): KtSimpleNameReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtSimpleNameReference?

'reference' @ [53:35] ==> val reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'reference' @ [54:41] ==> val reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'reference' @ [55:37] ==> val reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'references' @ [55:47] ==> public final val PsiMultiReference.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstanceOrNull' @ [55:58] ==> public inline fun <reified T : Any> Array<*>.firstIsInstanceOrNull(): KtSimpleNameReference? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtSimpleNameReference

'element' @ [58:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'isRecursive' @ [58:33] ==> private final fun KtNamedFunction.isRecursive(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler[SimpleFunctionDescriptorImpl]

'recursive' @ [59:13] ==> val recursive: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'nameReference' @ [59:26] ==> val nameReference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'getCannotRefactorMessage' @ [60:45] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'showErrorHint' @ [61:35] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [61:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'editor' @ [61:58] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'message' @ [61:66] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'element' @ [65:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [65:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'buildCodeToInline' @ [66:28] ==> internal fun buildCodeToInline(declaration: KtDeclaration, returnType: KotlinType?, isReturnTypeExplicit: Boolean, bodyOrInitializer: KtExpression, isBlockBody: Boolean, editor: Editor?): CodeToInline? defined in org.jetbrains.kotlin.idea.refactoring.inline in file inlineUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [67:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'descriptor' @ [68:17] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'returnType' @ [68:28] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'element' @ [69:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [69:25] ==> public open fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'element' @ [70:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'bodyExpression' @ [70:25] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [71:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'hasBlockBody' @ [71:25] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'editor' @ [72:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'CallableUsageReplacementStrategy' @ [75:35] ==> public constructor CallableUsageReplacementStrategy(replacement: CodeToInline) defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[ClassConstructorDescriptorImpl]

'codeToInline' @ [75:68] ==> val codeToInline: CodeToInline defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'KotlinInlineFunctionDialog' @ [77:22] ==> public constructor KotlinInlineFunctionDialog(project: Project, function: KtNamedFunction, reference: KtSimpleNameReference?, replacementStrategy: UsageReplacementStrategy, allowInlineThisOnly: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionDialog[ClassConstructorDescriptorImpl]

'project' @ [77:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'element' @ [77:58] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[ValueParameterDescriptorImpl]

'nameReference' @ [77:67] ==> val nameReference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'replacementStrategy' @ [77:82] ==> val replacementStrategy: CallableUsageReplacementStrategy defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'recursive' @ [78:71] ==> val recursive: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'if (!ApplicationManager.getApplication().isUnitTestMode) {
            dialog.show()
        }
        else {
            dialog.doAction()
        }' @ [79:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [79:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [79:33] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [79:50] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'dialog' @ [80:13] ==> val dialog: KotlinInlineFunctionDialog defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'show' @ [80:20] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionDialog[JavaMethodDescriptor]

'dialog' @ [83:13] ==> val dialog: KotlinInlineFunctionDialog defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.inlineElement[LocalVariableDescriptor]

'doAction' @ [83:20] ==> public open fun doAction(): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionDialog[SimpleFunctionDescriptorImpl]

'analyzeFully' @ [88:23] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [89:16] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'includesCallOf' @ [89:32] ==> private final fun KtExpression.includesCallOf(descriptor: FunctionDescriptor, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler[SimpleFunctionDescriptorImpl]

'context' @ [89:47] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.isRecursive[LocalVariableDescriptor]

'FUNCTION' @ [89:70] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [89:80] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.isRecursive[ReceiverParameterDescriptorImpl]

'context' @ [89:103] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.isRecursive[LocalVariableDescriptor]

'getResolvedCall' @ [93:29] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [93:45] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [93:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [94:16] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf[ValueParameterDescriptorImpl]

'refDescriptor' @ [94:30] ==> val refDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf[LocalVariableDescriptor]

'anyDescendantOfType' @ [94:47] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [95:20] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [95:27] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf[ReceiverParameterDescriptorImpl]

'descriptor' @ [95:35] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf[ValueParameterDescriptorImpl]

'it' @ [95:49] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [95:52] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [95:68] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineFunctionHandler.includesCallOf[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [95:78] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

