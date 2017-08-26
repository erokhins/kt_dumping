'?:' @ [47:61] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'usage' @ [47:62] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.isMethodUsage[ValueParameterDescriptorImpl]

'element' @ [47:68] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'let' @ [47:92] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Boolean

'it' @ [48:9] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.isMethodUsage.<anonymous>[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [48:12] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [48:60] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'when (method) {
            is KtFunction -> method.resolveToDescriptor() as? FunctionDescriptor
            is PsiMethod -> method.getJavaMethodDescriptor()
            else -> null
        }' @ [56:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionDescriptor?, entry1: FunctionDescriptor?, entry2: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionDescriptor?

'method' @ [56:41] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'method' @ [57:30] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [57:37] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'method' @ [58:29] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'getJavaMethodDescriptor' @ [58:36] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KotlinChangeSignatureData' @ [61:35] ==> public constructor KotlinChangeSignatureData(baseDescriptor: CallableDescriptor, baseDeclaration: PsiElement, descriptorsForSignatureChange: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[ClassConstructorDescriptorImpl]

'psiMethodDescriptor' @ [61:61] ==> val psiMethodDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'method' @ [61:82] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'singletonList' @ [61:102] ==> public open fun <T : (Any..Any?)> singletonList(p0: (FunctionDescriptor..FunctionDescriptor?)): (MutableList<(FunctionDescriptor..FunctionDescriptor?)>..List<(FunctionDescriptor..FunctionDescriptor?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'psiMethodDescriptor' @ [61:116] ==> val psiMethodDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'KotlinChangeInfo' @ [62:26] ==> public constructor KotlinChangeInfo(methodDescriptor: KotlinMethodDescriptor, name: String = ..., newReturnTypeInfo: KotlinTypeInfo = ..., newVisibility: Visibility = ..., parameterInfos: List<KotlinParameterInfo> = ..., receiver: KotlinParameterInfo? = ..., context: PsiElement, primaryPropagationTargets: Collection<PsiElement> = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[ClassConstructorDescriptorImpl]

'changeSignatureData' @ [62:62] ==> val changeSignatureData: KotlinChangeSignatureData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'method' @ [62:93] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'data' @ [64:9] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'parametersToRemove' @ [64:14] ==> public final val IntroduceParameterData.parametersToRemove: TIntArrayList[MyPropertyDescriptor]

'toNativeArray' @ [64:33] ==> public open fun toNativeArray(): (IntArray..IntArray?) defined in gnu.trove.TIntArrayList[JavaMethodDescriptor]

'sortedDescending' @ [64:49] ==> public fun IntArray.sortedDescending(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'forEach' @ [64:68] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'changeInfo' @ [64:78] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'removeParameter' @ [64:89] ==> public final fun removeParameter(index: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'it' @ [64:105] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [67:36] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'parameterInitializer' @ [67:41] ==> public final val IntroduceParameterData.parameterInitializer: raw (IntroduceParameterData.ExpressionWrapper<(PsiElement..PsiElement?)>..IntroduceParameterData.ExpressionWrapper<*>?)[MyPropertyDescriptor]

'expression' @ [67:62] ==> public final val <RealExpression : (PsiElement..PsiElement?)> IntroduceParameterData.ExpressionWrapper<(PsiElement..PsiElement?)>.expression: PsiElement[MyPropertyDescriptor]
Inferred types:
    <RealExpression : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'j2k' @ [67:93] ==> public fun PsiExpression.j2k(): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'changeInfo' @ [68:9] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'addParameter' @ [68:20] ==> @JvmOverloads public final fun addParameter(parameterInfo: KotlinParameterInfo, atIndex: Int = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'KotlinParameterInfo' @ [68:33] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'psiMethodDescriptor' @ [68:74] ==> val psiMethodDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'data' @ [69:60] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[ValueParameterDescriptorImpl]

'parameterName' @ [69:65] ==> public final val IntroduceParameterData.parameterName: String[MyPropertyDescriptor]

'KotlinTypeInfo' @ [70:72] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'psiMethodDescriptor' @ [70:94] ==> val psiMethodDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'builtIns' @ [70:114] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'anyType' @ [70:123] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'defaultValueForCall' @ [71:75] ==> val defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'changeInfo' @ [72:16] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.createChangeInfo[LocalVariableDescriptor]

'usage' @ [76:23] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[ValueParameterDescriptorImpl]

'element' @ [76:29] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'createChangeInfo' @ [78:26] ==> private final fun createChangeInfo(data: IntroduceParameterData, method: PsiElement): KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor[SimpleFunctionDescriptorImpl]

'data' @ [78:43] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[ValueParameterDescriptorImpl]

'element' @ [78:49] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'data' @ [80:34] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[ValueParameterDescriptorImpl]

'methodToReplaceIn' @ [80:39] ==> public final val IntroduceParameterData.methodToReplaceIn: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'getJavaMethodDescriptor' @ [80:57] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [80:85] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'last' @ [80:101] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [80:108] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'changeInfo' @ [81:9] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'newParameters' @ [81:20] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'last' @ [81:34] ==> public fun <T> Array<out KotlinParameterInfo>.last(): KotlinParameterInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'currentTypeInfo' @ [81:41] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'KotlinTypeInfo' @ [81:59] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'addedParameterType' @ [81:81] ==> val addedParameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'element' @ [83:21] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'useScope' @ [83:29] ==> public final val KtFunction.useScope: SearchScope[MyPropertyDescriptor]

'let' @ [83:38] ==> @InlineOnly public inline fun <T, R> SearchScope.let(block: (SearchScope) -> SearchScope): SearchScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SearchScope
    <R> -> SearchScope

'if (it is GlobalSearchScope) GlobalSearchScope.getScopeRestrictedByFileTypes(it, KotlinFileType.INSTANCE) else it' @ [84:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SearchScope, elseBranch: SearchScope): SearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SearchScope

'it' @ [84:17] ==> value-parameter it: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'getScopeRestrictedByFileTypes' @ [84:60] ==> @NotNull @Contract public open fun getScopeRestrictedByFileTypes(@NotNull p0: GlobalSearchScope, @NotNull vararg p1: (FileType..FileType?)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'it' @ [84:90] ==> value-parameter it: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'INSTANCE' @ [84:109] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'it' @ [84:124] ==> value-parameter it: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'HierarchySearchRequest' @ [86:31] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtFunction, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> KtFunction

'element' @ [86:54] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'scope' @ [86:63] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'searchOverriders' @ [87:18] ==> public fun HierarchySearchRequest<*>.searchOverriders(): Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'map' @ [88:18] ==> public inline fun <T, R> Iterable<(PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> PsiElement?): List<PsiElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> PsiElement?

'it' @ [88:24] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [88:27] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'filterIsInstance' @ [89:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtFunction

'kotlinFunctions' @ [90:17] ==> val kotlinFunctions: List<KtFunction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'element' @ [90:35] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'all' @ [90:44] ==> public inline fun <T> Iterable<KtFunction>.all(predicate: (KtFunction) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFunction

'KotlinCallableDefinitionUsage' @ [91:13] ==> public constructor KotlinCallableDefinitionUsage<T : PsiElement>(function: KtFunction, originalCallableDescriptor: CallableDescriptor, baseFunction: KotlinCallableDefinitionUsage<PsiElement>?, samCallType: KotlinType?, canDropOverride: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtFunction

'it' @ [91:43] ==> value-parameter it: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'changeInfo' @ [91:47] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'originalBaseFunctionDescriptor' @ [91:58] ==> public val KotlinChangeInfo.originalBaseFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[PropertyDescriptorImpl]

'processUsage' @ [91:109] ==> public open fun processUsage(changeInfo: KotlinChangeInfo, element: KtFunction, allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [91:122] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'it' @ [91:134] ==> value-parameter it: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'usages' @ [91:138] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[ValueParameterDescriptorImpl]

'apply' @ [92:11] ==> @InlineOnly public inline fun <T> Boolean.apply(block: Boolean.() -> Unit): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'dropOverrideKeywordIfNecessary' @ [93:13] ==> public fun dropOverrideKeywordIfNecessary(element: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [93:44] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodSignature[LocalVariableDescriptor]

'data' @ [98:25] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[ValueParameterDescriptorImpl]

'methodToReplaceIn' @ [98:30] ==> public final val IntroduceParameterData.methodToReplaceIn: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'createChangeInfo' @ [99:26] ==> private final fun createChangeInfo(data: IntroduceParameterData, method: PsiElement): KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor[SimpleFunctionDescriptorImpl]

'data' @ [99:43] ==> value-parameter data: IntroduceParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[ValueParameterDescriptorImpl]

'psiMethod' @ [99:49] ==> val psiMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'usage' @ [100:26] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[ValueParameterDescriptorImpl]

'element' @ [100:32] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'refElement' @ [101:27] ==> val refElement: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [101:38] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [101:86] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (callElement is KtConstructorDelegationCall) {
            @Suppress("UNCHECKED_CAST")
            (KotlinConstructorDelegationCallUsage(callElement, changeInfo) as KotlinUsageInfo<KtCallElement>)
        }
        else {
            KotlinFunctionCallUsage(callElement, changeInfo.methodDescriptor.originalPrimaryCallable)
        }' @ [102:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinUsageInfo<KtCallElement>, elseBranch: KotlinUsageInfo<KtCallElement>): KotlinUsageInfo<KtCallElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinUsageInfo<KtCallElement>

'callElement' @ [102:33] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'Suppress' @ [103:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'KotlinConstructorDelegationCallUsage' @ [104:14] ==> public constructor KotlinConstructorDelegationCallUsage(call: KtConstructorDelegationCall, changeInfo: KotlinChangeInfo) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinConstructorDelegationCallUsage[ClassConstructorDescriptorImpl]

'callElement' @ [104:51] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'changeInfo' @ [104:64] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'KotlinFunctionCallUsage' @ [107:13] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'callElement' @ [107:37] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'changeInfo' @ [107:50] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'methodDescriptor' @ [107:61] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'originalPrimaryCallable' @ [107:78] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'delegateUsage' @ [109:16] ==> val delegateUsage: KotlinUsageInfo<KtCallElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'processUsage' @ [109:30] ==> public abstract fun processUsage(changeInfo: KotlinChangeInfo, element: KtCallElement, allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[SimpleFunctionDescriptorImpl]

'changeInfo' @ [109:43] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'callElement' @ [109:55] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[LocalVariableDescriptor]

'usages' @ [109:68] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterMethodUsageProcessor.processChangeMethodUsage[ValueParameterDescriptorImpl]

