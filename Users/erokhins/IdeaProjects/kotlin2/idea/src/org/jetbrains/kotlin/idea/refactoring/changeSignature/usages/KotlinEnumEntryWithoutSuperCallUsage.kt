'KotlinUsageInfo<KtEnumEntry>' @ [23:70] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: KtEnumEntry) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtEnumEntry

'enumEntry' @ [23:99] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.<init>[ValueParameterDescriptorImpl]

'changeInfo' @ [25:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

'newParameters' @ [25:24] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'size' @ [25:38] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'KtPsiFactory' @ [26:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [26:43] ==> value-parameter element: KtEnumEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

'(element.addAfter(
                    psiFactory.createEnumEntryInitializerList(),
                    element.nameIdentifier
            ) as KtInitializerList).initializers[0]' @ [28:40] ==> public abstract fun get(index: Int): (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [28:41] ==> value-parameter element: KtEnumEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

'addAfter' @ [28:49] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'psiFactory' @ [29:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[LocalVariableDescriptor]

'createEnumEntryInitializerList' @ [29:32] ==> public final fun createEnumEntryInitializerList(): KtInitializerList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [30:21] ==> value-parameter element: KtEnumEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

'nameIdentifier' @ [30:29] ==> public final val KtEnumEntry.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'initializers' @ [31:37] ==> public final val KtInitializerList.initializers: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>)[MyPropertyDescriptor]

'KotlinFunctionCallUsage' @ [33:20] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'delegatorToSuperCall' @ [33:44] ==> val delegatorToSuperCall: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[LocalVariableDescriptor]

'changeInfo' @ [33:66] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

'methodDescriptor' @ [33:77] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'originalPrimaryCallable' @ [33:94] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'processUsage' @ [34:22] ==> public open fun processUsage(changeInfo: KotlinChangeInfo, element: KtCallElement, allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [34:35] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

'delegatorToSuperCall' @ [34:47] ==> val delegatorToSuperCall: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[LocalVariableDescriptor]

'allUsages' @ [34:69] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage.processUsage[ValueParameterDescriptorImpl]

