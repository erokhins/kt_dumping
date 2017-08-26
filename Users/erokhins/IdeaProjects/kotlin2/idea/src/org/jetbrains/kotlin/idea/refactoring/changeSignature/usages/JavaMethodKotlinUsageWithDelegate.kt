'UsageInfo' @ [27:54] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'psiElement' @ [27:64] ==> value-parameter psiElement: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate.<init>[ValueParameterDescriptorImpl]

'delegateUsage' @ [30:62] ==> public abstract val delegateUsage: KotlinUsageInfo<T> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[PropertyDescriptorImpl]

'processUsage' @ [30:76] ==> public abstract fun processUsage(changeInfo: KotlinChangeInfo, element: T, allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[SimpleFunctionDescriptorImpl]

'javaMethodChangeInfo' @ [30:89] ==> public final var javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[PropertyDescriptorImpl]

'psiElement' @ [30:111] ==> public final val psiElement: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[PropertyDescriptorImpl]

'allUsages' @ [30:123] ==> value-parameter allUsages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate.processUsage[ValueParameterDescriptorImpl]

'JavaMethodKotlinUsageWithDelegate<KtCallElement>' @ [37:4] ==> public constructor JavaMethodKotlinUsageWithDelegate<T : PsiElement>(psiElement: KtCallElement, javaMethodChangeInfo: KotlinChangeInfo) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtCallElement

'callElement' @ [37:53] ==> value-parameter callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage.<init>[ValueParameterDescriptorImpl]

'javaMethodChangeInfo' @ [37:66] ==> value-parameter javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage.<init>[ValueParameterDescriptorImpl]

'Suppress' @ [38:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when {
        propagationCall -> KotlinCallerCallUsage(psiElement)
        psiElement is KtConstructorDelegationCall -> KotlinConstructorDelegationCallUsage(psiElement, javaMethodChangeInfo)
        else -> KotlinFunctionCallUsage(psiElement, javaMethodChangeInfo.methodDescriptor.originalPrimaryCallable)
    }' @ [39:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinUsageInfo<out KtCallElement>, entry1: KotlinUsageInfo<out KtCallElement>, entry2: KotlinUsageInfo<out KtCallElement>): KotlinUsageInfo<out KtCallElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinUsageInfo<out KtCallElement>

'propagationCall' @ [40:9] ==> value-parameter propagationCall: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage.<init>[ValueParameterDescriptorImpl]

'KotlinCallerCallUsage' @ [40:28] ==> public constructor KotlinCallerCallUsage(element: KtCallElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage[ClassConstructorDescriptorImpl]

'psiElement' @ [40:50] ==> public final val psiElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage[PropertyDescriptorImpl]

'psiElement' @ [41:9] ==> public final val psiElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage[PropertyDescriptorImpl]

'KotlinConstructorDelegationCallUsage' @ [41:54] ==> public constructor KotlinConstructorDelegationCallUsage(call: KtConstructorDelegationCall, changeInfo: KotlinChangeInfo) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinConstructorDelegationCallUsage[ClassConstructorDescriptorImpl]

'psiElement' @ [41:91] ==> public final val psiElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage[PropertyDescriptorImpl]

'javaMethodChangeInfo' @ [41:103] ==> value-parameter javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage.<init>[ValueParameterDescriptorImpl]

'KotlinFunctionCallUsage' @ [42:17] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'psiElement' @ [42:41] ==> public final val psiElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage[PropertyDescriptorImpl]

'javaMethodChangeInfo' @ [42:53] ==> value-parameter javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage.<init>[ValueParameterDescriptorImpl]

'methodDescriptor' @ [42:74] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'originalPrimaryCallable' @ [42:91] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

