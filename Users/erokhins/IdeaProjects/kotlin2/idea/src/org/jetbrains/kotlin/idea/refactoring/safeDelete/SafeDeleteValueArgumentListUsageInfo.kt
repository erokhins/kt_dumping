'SafeDeleteReferenceSimpleDeleteUsageInfo' @ [28:5] ==> public constructor SafeDeleteReferenceSimpleDeleteUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: Boolean) defined in com.intellij.refactoring.safeDelete.usageInfo.SafeDeleteReferenceSimpleDeleteUsageInfo[JavaClassConstructorDescriptor]

'valueArguments' @ [28:46] ==> value-parameter vararg valueArguments: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.<init>[ValueParameterDescriptorImpl]

'first' @ [28:61] ==> public fun <T> Array<out KtValueArgument>.first(): KtValueArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgument

'parameter' @ [28:70] ==> value-parameter parameter: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.<init>[ValueParameterDescriptorImpl]

'valueArguments' @ [29:41] ==> value-parameter vararg valueArguments: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.<init>[ValueParameterDescriptorImpl]

'map' @ [29:56] ==> public inline fun <T, R> Array<out KtValueArgument>.map(transform: (KtValueArgument) -> SmartPsiElementPointer<KtValueArgument>): List<SmartPsiElementPointer<KtValueArgument>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgument
    <R> -> SmartPsiElementPointer<KtValueArgument>

'it' @ [29:62] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.valueArgumentPointers.<anonymous>[ValueParameterDescriptorImpl]

'createSmartPointer' @ [29:65] ==> public fun <E : PsiElement> KtValueArgument.createSmartPointer(): SmartPsiElementPointer<KtValueArgument> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtValueArgument

'valueArgumentPointers' @ [32:38] ==> private final val valueArgumentPointers: List<SmartPsiElementPointer<KtValueArgument>> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo[PropertyDescriptorImpl]

'valueArgumentPointer' @ [33:33] ==> val valueArgumentPointer: SmartPsiElementPointer<KtValueArgument> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.deleteElement[LocalVariableDescriptor]

'element' @ [33:54] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtValueArgument>.element: KtValueArgument?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtValueArgument

'valueArgument' @ [34:26] ==> val valueArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.deleteElement[LocalVariableDescriptor]

'parent' @ [34:40] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtValueArgumentList) {
                parent.removeArgument(valueArgument)
            }
            else {
                valueArgument.delete()
            }' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [35:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.deleteElement[LocalVariableDescriptor]

'parent' @ [36:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.deleteElement[LocalVariableDescriptor]

'removeArgument' @ [36:24] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'valueArgument' @ [36:39] ==> val valueArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.deleteElement[LocalVariableDescriptor]

'valueArgument' @ [39:17] ==> val valueArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo.deleteElement[LocalVariableDescriptor]

'delete' @ [39:31] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

