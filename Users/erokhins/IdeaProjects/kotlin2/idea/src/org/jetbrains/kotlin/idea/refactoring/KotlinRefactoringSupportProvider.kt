'RefactoringSupportProvider' @ [37:42] ==> public constructor RefactoringSupportProvider() defined in com.intellij.lang.refactoring.RefactoringSupportProvider[JavaClassConstructorDescriptor]

'element' @ [38:63] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isSafeDeleteAvailable[ValueParameterDescriptorImpl]

'canDeleteElement' @ [38:71] ==> public fun PsiElement.canDeleteElement(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'KotlinIntroduceVariableHandler' @ [40:50] ==> public object KotlinIntroduceVariableHandler : RefactoringActionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable in file KotlinIntroduceVariableHandler.kt[FakeCallableDescriptorForObject]

'KotlinIntroduceParameterHandler' @ [42:51] ==> public constructor KotlinIntroduceParameterHandler(helper: KotlinIntroduceParameterHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[ClassConstructorDescriptorImpl]

'KotlinIntroduceLambdaParameterHandler' @ [44:61] ==> public constructor KotlinIntroduceLambdaParameterHandler(helper: KotlinIntroduceLambdaParameterHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler[ClassConstructorDescriptorImpl]

'KotlinIntroducePropertyHandler' @ [46:67] ==> public constructor KotlinIntroducePropertyHandler(helper: ExtractionEngineHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[ClassConstructorDescriptorImpl]

'ExtractKotlinFunctionHandler' @ [49:13] ==> public constructor ExtractKotlinFunctionHandler(allContainersEnabled: Boolean = ..., helper: ExtractionEngineHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[ClassConstructorDescriptorImpl]

'ExtractKotlinFunctionHandler' @ [52:13] ==> public constructor ExtractKotlinFunctionHandler(allContainersEnabled: Boolean = ..., helper: ExtractionEngineHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[ClassConstructorDescriptorImpl]

'InteractiveExtractionHelper' @ [52:77] ==> public object InteractiveExtractionHelper : ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[FakeCallableDescriptorForObject]

'when (element) {
            is KtTypeParameter -> return true
            is KtProperty -> {
                if (element.isLocal) return true
            }
            is KtDestructuringDeclarationEntry -> return true
            is KtFunction -> {
                if (element.isLocal && element.nameIdentifier != null) return true
            }
            is KtParameter -> {
                val parent = element.parent
                if (parent is KtForExpression) {
                    return true
                }
                if (parent is KtParameterList) {
                    val grandparent = parent.parent
                    return grandparent is KtCatchClause || grandparent is KtFunctionLiteral
                }
            }
            is KtLabeledExpression, is KtImportAlias -> return true
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [55:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[ValueParameterDescriptorImpl]

'element' @ [58:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[ValueParameterDescriptorImpl]

'isLocal' @ [58:29] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'element' @ [62:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[ValueParameterDescriptorImpl]

'isLocal' @ [62:29] ==> public final val KtFunction.isLocal: Boolean[MyPropertyDescriptor]

'element' @ [62:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[ValueParameterDescriptorImpl]

'nameIdentifier' @ [62:48] ==> public final val KtFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [65:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[ValueParameterDescriptorImpl]

'parent' @ [65:38] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [66:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[LocalVariableDescriptor]

'parent' @ [69:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[LocalVariableDescriptor]

'parent' @ [70:39] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[LocalVariableDescriptor]

'parent' @ [70:46] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'grandparent' @ [71:28] ==> val grandparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[LocalVariableDescriptor]

'grandparent' @ [71:60] ==> val grandparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isInplaceRenameAvailable[LocalVariableDescriptor]

'element' @ [79:94] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSupportProvider.isMemberInplaceRenameAvailable[ValueParameterDescriptorImpl]

'KotlinChangeSignatureHandler' @ [81:48] ==> public constructor KotlinChangeSignatureHandler() defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureHandler[ClassConstructorDescriptorImpl]

'KotlinPullUpHandler' @ [83:39] ==> public constructor KotlinPullUpHandler() defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHandler[ClassConstructorDescriptorImpl]

'KotlinPushDownHandler' @ [85:41] ==> public constructor KotlinPushDownHandler() defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownHandler[ClassConstructorDescriptorImpl]

'KotlinExtractSuperclassHandler' @ [87:50] ==> public object KotlinExtractSuperclassHandler : KotlinExtractSuperHandlerBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass in file KotlinExtractSuperclassHandler.kt[FakeCallableDescriptorForObject]

'KotlinExtractInterfaceHandler' @ [89:49] ==> public object KotlinExtractInterfaceHandler : KotlinExtractSuperHandlerBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass in file KotlinExtractInterfaceHandler.kt[FakeCallableDescriptorForObject]

't' @ [94:13] ==> value-parameter t: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.KotlinVetoRenameCondition.value[ValueParameterDescriptorImpl]

't' @ [94:31] ==> value-parameter t: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.KotlinVetoRenameCondition.value[ValueParameterDescriptorImpl]

't' @ [94:62] ==> value-parameter t: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.KotlinVetoRenameCondition.value[ValueParameterDescriptorImpl]

'nameIdentifier' @ [94:64] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

't' @ [94:90] ==> value-parameter t: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.KotlinVetoRenameCondition.value[ValueParameterDescriptorImpl]

