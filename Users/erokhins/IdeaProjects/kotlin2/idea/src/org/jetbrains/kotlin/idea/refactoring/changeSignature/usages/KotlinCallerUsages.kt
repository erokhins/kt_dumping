'KotlinUsageInfo<KtNamedDeclaration>' @ [27:55] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtNamedDeclaration

'element' @ [27:91] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.<init>[ValueParameterDescriptorImpl]

'changeInfo' @ [30:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'getAffectedCallables' @ [30:24] ==> public fun KotlinChangeInfo.getAffectedCallables(): Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'any' @ [30:47] ==> public inline fun <T> Iterable<UsageInfo>.any(predicate: (UsageInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [30:53] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [30:95] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [30:98] ==> public final val <T : PsiElement> KotlinCallableDefinitionUsage<out PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'element' @ [30:109] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'when (element) {
            is KtFunction -> element.valueParameterList
            is KtClass -> element.createPrimaryConstructorParameterListIfAbsent()
            else -> null
        }' @ [32:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtParameterList?, entry1: KtParameterList?, entry2: KtParameterList?): KtParameterList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtParameterList?

'element' @ [32:35] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [33:30] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'valueParameterList' @ [33:38] ==> public final val KtFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'element' @ [34:27] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'createPrimaryConstructorParameterListIfAbsent' @ [34:35] ==> public fun KtClass.createPrimaryConstructorParameterListIfAbsent(): KtParameterList defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [37:9] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [37:20] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'withIndex' @ [38:18] ==> public fun <T> Iterable<KotlinParameterInfo>.withIndex(): Iterable<IndexedValue<KotlinParameterInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'filter' @ [39:18] ==> public inline fun <T> Iterable<IndexedValue<KotlinParameterInfo>>.filter(predicate: (IndexedValue<KotlinParameterInfo>) -> Boolean): List<IndexedValue<KotlinParameterInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<KotlinParameterInfo>

'it' @ [39:27] ==> value-parameter it: IndexedValue<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [39:30] ==> public final val value: KotlinParameterInfo defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'isNewParameter' @ [39:36] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'forEach' @ [40:18] ==> @HidesMembers public inline fun <T> Iterable<IndexedValue<KotlinParameterInfo>>.forEach(action: (IndexedValue<KotlinParameterInfo>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<KotlinParameterInfo>

'it' @ [41:40] ==> value-parameter it: IndexedValue<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [41:43] ==> public final val value: KotlinParameterInfo defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'getDeclarationSignature' @ [41:49] ==> public final fun getDeclarationSignature(parameterIndex: Int, inheritedCallable: KotlinCallableDefinitionUsage<*>): KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'it' @ [41:73] ==> value-parameter it: IndexedValue<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [41:76] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'changeInfo' @ [41:83] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[ValueParameterDescriptorImpl]

'methodDescriptor' @ [41:94] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'originalPrimaryCallable' @ [41:111] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'parameterList' @ [42:21] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage[LocalVariableDescriptor]

'addParameter' @ [42:35] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameter' @ [42:48] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerUsage.processUsage.<anonymous>[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [42:62] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'KotlinUsageInfo<KtCallElement>' @ [49:54] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: KtCallElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtCallElement

'element' @ [49:85] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.<init>[ValueParameterDescriptorImpl]

'element' @ [51:28] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[ValueParameterDescriptorImpl]

'valueArgumentList' @ [51:36] ==> public final val KtCallElement.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'KtPsiFactory' @ [52:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [52:39] ==> public final val KotlinCallerCallUsage.project: Project[MyPropertyDescriptor]

'argumentList' @ [53:27] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[LocalVariableDescriptor]

'arguments' @ [53:40] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'any' @ [53:50] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.any(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [53:56] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [53:59] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'changeInfo' @ [54:9] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [54:20] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'filter' @ [55:18] ==> public inline fun <T> Iterable<KotlinParameterInfo>.filter(predicate: (KotlinParameterInfo) -> Boolean): List<KotlinParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'it' @ [55:27] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'isNewParameter' @ [55:30] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'forEach' @ [56:18] ==> @HidesMembers public inline fun <T> Iterable<KotlinParameterInfo>.forEach(action: (KotlinParameterInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'it' @ [57:41] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [57:44] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'if (element.isInsideOfCallerBody(allUsages)) {
                        psiFactory.createExpression(parameterName)
                    }
                    else {
                        it.defaultValueForCall ?: psiFactory.createExpression("_")
                    }' @ [58:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'element' @ [58:50] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[ValueParameterDescriptorImpl]

'isInsideOfCallerBody' @ [58:58] ==> public fun KtElement.isInsideOfCallerBody(allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'allUsages' @ [58:79] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[ValueParameterDescriptorImpl]

'psiFactory' @ [59:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[LocalVariableDescriptor]

'createExpression' @ [59:36] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parameterName' @ [59:53] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[LocalVariableDescriptor]

'it' @ [62:25] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'defaultValueForCall' @ [62:28] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'psiFactory' @ [62:51] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[LocalVariableDescriptor]

'createExpression' @ [62:62] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [64:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[LocalVariableDescriptor]

'createArgument' @ [64:47] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argumentExpression' @ [65:42] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[LocalVariableDescriptor]

'if (isNamedCall) Name.identifier(parameterName) else null' @ [66:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'isNamedCall' @ [66:40] ==> val isNamedCall: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[LocalVariableDescriptor]

'identifier' @ [66:58] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parameterName' @ [66:69] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[LocalVariableDescriptor]

'argumentList' @ [68:21] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage[LocalVariableDescriptor]

'addArgument' @ [68:34] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argument' @ [68:46] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage.processUsage.<anonymous>[LocalVariableDescriptor]

