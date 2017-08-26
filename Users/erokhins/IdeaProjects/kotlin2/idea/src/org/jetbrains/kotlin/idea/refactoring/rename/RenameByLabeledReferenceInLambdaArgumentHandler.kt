'AbstractReferenceSubstitutionRenameHandler' @ [34:9] ==> public constructor AbstractReferenceSubstitutionRenameHandler(delegateHandler: RenameHandler = ...) defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractReferenceSubstitutionRenameHandler[ClassConstructorDescriptorImpl]

'VariableInplaceRenameHandler' @ [34:52] ==> public constructor VariableInplaceRenameHandler() defined in com.intellij.refactoring.rename.inplace.VariableInplaceRenameHandler[JavaClassConstructorDescriptor]

'getReferenceExpression' @ [36:23] ==> public final fun getReferenceExpression(dataContext: DataContext): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.rename.AbstractReferenceSubstitutionRenameHandler.Companion[SimpleFunctionDescriptorImpl]

'dataContext' @ [36:46] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[ValueParameterDescriptorImpl]

'refExpr' @ [37:23] ==> val refExpr: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'analyze' @ [37:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [37:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [38:22] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'LABEL_TARGET' @ [38:45] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [38:59] ==> val refExpr: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'lambda' @ [39:29] ==> val lambda: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'getLabeledParent' @ [39:36] ==> public fun KtExpression.getLabeledParent(labelName: String): KtLabeledExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [39:53] ==> val refExpr: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'getReferencedName' @ [39:61] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtLabelReferenceExpression[DeserializedSimpleFunctionDescriptor]

'if (labeledParent != null) {
            labeledParent
        }
        else {
            val calleeExpression = lambda.getCalleeByLambdaArgument() ?: return null
            val descriptor = context[BindingContext.REFERENCE_TARGET, calleeExpression] as? FunctionDescriptor ?: return null
            DescriptorToSourceUtilsIde.getAnyDeclaration(dataContext.project, descriptor)
        }' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'labeledParent' @ [40:20] ==> val labeledParent: KtLabeledExpression? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'labeledParent' @ [41:13] ==> val labeledParent: KtLabeledExpression? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'lambda' @ [44:36] ==> val lambda: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'getCalleeByLambdaArgument' @ [44:43] ==> public fun KtFunction.getCalleeByLambdaArgument(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'context' @ [45:30] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [45:53] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'calleeExpression' @ [45:71] ==> val calleeExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

'getAnyDeclaration' @ [46:40] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'dataContext' @ [46:58] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[ValueParameterDescriptorImpl]

'project' @ [46:70] ==> public val DataContext.project: Project defined in org.jetbrains.kotlin.idea.refactoring in file dataContextUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [46:79] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameByLabeledReferenceInLambdaArgumentHandler.getElementToRename[LocalVariableDescriptor]

