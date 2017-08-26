'UsageInfo' @ [78:78] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'element' @ [78:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper.<init>[ValueParameterDescriptorImpl]

'KotlinChangeInfo' @ [85:9] ==> public constructor KotlinChangeInfo(methodDescriptor: KotlinMethodDescriptor, name: String = ..., newReturnTypeInfo: KotlinTypeInfo = ..., newVisibility: Visibility = ..., parameterInfos: List<KotlinParameterInfo> = ..., receiver: KotlinParameterInfo? = ..., context: PsiElement, primaryPropagationTargets: Collection<PsiElement> = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[ClassConstructorDescriptorImpl]

'methodDescriptor' @ [85:45] ==> value-parameter methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.DummyKotlinChangeInfo.<init>[ValueParameterDescriptorImpl]

'KotlinTypeInfo' @ [87:46] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'DEFAULT_VISIBILITY' @ [88:55] ==> public final val DEFAULT_VISIBILITY: (Visibility..Visibility?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'emptyList' @ [89:43] ==> public fun <T> emptyList(): List<KotlinParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'method' @ [91:36] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.DummyKotlinChangeInfo.<init>[ValueParameterDescriptorImpl]

'initializedOriginalDescriptor' @ [97:9] ==> private final var initializedOriginalDescriptor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[PropertyDescriptorImpl]

'HashSet' @ [99:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in com.intellij.util.containers.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'result' @ [101:9] ==> val result: HashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[LocalVariableDescriptor]

'add' @ [101:16] ==> public open fun add(element: (UsageInfo..UsageInfo?)): Boolean defined in com.intellij.util.containers.HashSet[JavaMethodDescriptor]

'OriginalJavaMethodDescriptorWrapper' @ [101:20] ==> public constructor OriginalJavaMethodDescriptorWrapper(element: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper[ClassConstructorDescriptorImpl]

'info' @ [101:56] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'method' @ [101:61] ==> public final val ChangeInfo.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (info is KotlinChangeInfoWrapper) {
            findAllMethodUsages(info.delegate!!, result)
        }
        else {
            findSAMUsages(info, result)
            //findConstructorDelegationUsages(info, result)
            findKotlinOverrides(info, result)
            if (info is JavaChangeInfo) {
                findKotlinCallers(info, result)
            }
        }' @ [103:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'info' @ [103:13] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'findAllMethodUsages' @ [104:13] ==> private final fun findAllMethodUsages(changeInfo: KotlinChangeInfo, result: MutableSet<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'info' @ [104:33] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'delegate' @ [104:38] ==> public final var delegate: KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[PropertyDescriptorImpl]

'result' @ [104:50] ==> val result: HashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[LocalVariableDescriptor]

'findSAMUsages' @ [107:13] ==> private final fun findSAMUsages(changeInfo: ChangeInfo, result: MutableSet<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'info' @ [107:27] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'result' @ [107:33] ==> val result: HashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[LocalVariableDescriptor]

'findKotlinOverrides' @ [109:13] ==> private final fun findKotlinOverrides(changeInfo: ChangeInfo, result: MutableSet<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'info' @ [109:33] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'result' @ [109:39] ==> val result: HashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[LocalVariableDescriptor]

'info' @ [110:17] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'findKotlinCallers' @ [111:17] ==> private final fun findKotlinCallers(changeInfo: JavaChangeInfo, result: MutableSet<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'info' @ [111:35] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[ValueParameterDescriptorImpl]

'result' @ [111:41] ==> val result: HashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[LocalVariableDescriptor]

'result' @ [115:16] ==> val result: HashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findUsages[LocalVariableDescriptor]

'toTypedArray' @ [115:23] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'changeInfo' @ [119:41] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'getAffectedCallables' @ [119:52] ==> public fun KotlinChangeInfo.getAffectedCallables(): Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[SimpleFunctionDescriptorImpl]

'when (functionUsageInfo) {
                is KotlinCallableDefinitionUsage<*> -> findOneMethodUsages(functionUsageInfo, changeInfo, result)
                is KotlinCallerUsage -> findCallerUsages(functionUsageInfo, changeInfo, result)
                else -> {
                    result.add(functionUsageInfo)

                    val callee = functionUsageInfo.element ?: continue@loop

                    val propagationTarget = functionUsageInfo is CallerUsageInfo
                                            || (functionUsageInfo is OverriderUsageInfo && !functionUsageInfo.isOriginalOverrider)


                    for (reference in ReferencesSearch.search(callee, callee.useScope.restrictToKotlinSources())) {
                        val callElement = reference.element.getParentOfTypeAndBranch<KtCallElement> { calleeExpression } ?: continue
                        val usage = if (propagationTarget) {
                            KotlinCallerCallUsage(callElement)
                        }
                        else {
                            KotlinFunctionCallUsage(callElement, changeInfo.methodDescriptor.originalPrimaryCallable)
                        }
                        result.add(usage)
                    }
                }
            }' @ [120:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'functionUsageInfo' @ [120:19] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'findOneMethodUsages' @ [121:56] ==> private final fun findOneMethodUsages(functionUsageInfo: KotlinCallableDefinitionUsage<*>, changeInfo: KotlinChangeInfo, result: MutableSet<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'functionUsageInfo' @ [121:76] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'changeInfo' @ [121:95] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'result' @ [121:107] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'findCallerUsages' @ [122:41] ==> private final fun findCallerUsages(callerUsage: KotlinCallerUsage, changeInfo: KotlinChangeInfo, result: MutableSet<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'functionUsageInfo' @ [122:58] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'changeInfo' @ [122:77] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'result' @ [122:89] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'result' @ [124:21] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'add' @ [124:28] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'functionUsageInfo' @ [124:32] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'functionUsageInfo' @ [126:34] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'element' @ [126:52] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'functionUsageInfo' @ [128:45] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'functionUsageInfo' @ [129:49] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'!' @ [129:92] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionUsageInfo' @ [129:93] ==> val functionUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'isOriginalOverrider' @ [129:111] ==> public final val OverriderUsageInfo.isOriginalOverrider: Boolean[MyPropertyDescriptor]

'iterator' @ [132:39] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [132:56] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'callee' @ [132:63] ==> val callee: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'callee' @ [132:71] ==> val callee: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'useScope' @ [132:78] ==> public final val PsiElement.useScope: SearchScope[MyPropertyDescriptor]

'restrictToKotlinSources' @ [132:87] ==> public fun SearchScope.restrictToKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'reference' @ [133:43] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'element' @ [133:53] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [133:61] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [133:103] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (propagationTarget) {
                            KotlinCallerCallUsage(callElement)
                        }
                        else {
                            KotlinFunctionCallUsage(callElement, changeInfo.methodDescriptor.originalPrimaryCallable)
                        }' @ [134:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinUsageInfo<KtCallElement>, elseBranch: KotlinUsageInfo<KtCallElement>): KotlinUsageInfo<KtCallElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinUsageInfo<KtCallElement>

'propagationTarget' @ [134:41] ==> val propagationTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'KotlinCallerCallUsage' @ [135:29] ==> public constructor KotlinCallerCallUsage(element: KtCallElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage[ClassConstructorDescriptorImpl]

'callElement' @ [135:51] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'KotlinFunctionCallUsage' @ [138:29] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'callElement' @ [138:53] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'changeInfo' @ [138:66] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'methodDescriptor' @ [138:77] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'originalPrimaryCallable' @ [138:94] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'result' @ [140:25] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[ValueParameterDescriptorImpl]

'add' @ [140:32] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'usage' @ [140:36] ==> val usage: KotlinUsageInfo<KtCallElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findAllMethodUsages[LocalVariableDescriptor]

'result' @ [148:9] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'add' @ [148:16] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'callerUsage' @ [148:20] ==> value-parameter callerUsage: KotlinCallerUsage defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'callerUsage' @ [150:23] ==> value-parameter callerUsage: KotlinCallerUsage defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'element' @ [150:35] ==> public final val KotlinCallerUsage.element: KtNamedDeclaration?[MyPropertyDescriptor]

'iterator' @ [152:21] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [152:38] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [152:45] ==> val element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'element' @ [152:54] ==> val element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'useScope' @ [152:62] ==> public final val KtNamedDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'ref' @ [153:31] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'element' @ [153:35] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [153:43] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [153:85] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'result' @ [154:13] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'add' @ [154:20] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinCallerCallUsage' @ [154:24] ==> public constructor KotlinCallerCallUsage(element: KtCallElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallerCallUsage[ClassConstructorDescriptorImpl]

'callElement' @ [154:46] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'element' @ [157:20] ==> val element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'getDeclarationBody' @ [157:28] ==> public fun KtNamedDeclaration.getDeclarationBody(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [158:32] ==> val element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [158:40] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'body' @ [159:23] ==> val body: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'analyze' @ [159:28] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [160:33] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [160:44] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'mapTo' @ [160:71] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<KotlinParameterInfo>.mapTo(destination: HashSet<String>, transform: (KotlinParameterInfo) -> String): HashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo
    <R> -> String
    <C : MutableCollection<in R>> -> HashSet<String>

'HashSet' @ [160:77] ==> public constructor HashSet<E : (Any..Any?)>() defined in com.intellij.util.containers.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'it' @ [160:98] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [160:101] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'body' @ [161:9] ==> val body: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'accept' @ [161:14] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [162:26] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [164:43] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getReferencedName' @ [164:54] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'currentName' @ [165:29] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'newParameterNames' @ [165:45] ==> val newParameterNames: HashSet<String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'expression' @ [167:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [167:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [167:71] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'resolvedCall' @ [169:29] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'explicitReceiverKind' @ [169:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'NO_EXPLICIT_RECEIVER' @ [169:87] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'resolvedCall' @ [171:51] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [171:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resultingDescriptor' @ [172:29] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [175:29] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [176:32] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'containingDeclaration' @ [176:52] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'callerDescriptor' @ [176:78] ==> val callerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'resolvedCall' @ [178:43] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'call' @ [178:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [178:61] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'resolvedCall' @ [180:40] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'extensionReceiver' @ [180:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'receiver' @ [181:29] ==> var receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'receiver' @ [182:29] ==> var receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [182:40] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'dispatchReceiver' @ [182:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'if (receiver is ImplicitReceiver) {
                            result.add(KotlinImplicitThisUsage(callElement, receiver.declarationDescriptor))
                        }
                        else if (receiver == null) {
                            result.add(
                                    object : UnresolvableCollisionUsageInfo(callElement, null) {
                                        override fun getDescription(): String {
                                            val signature = IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.render(callerDescriptor)
                                            return "There is already a variable '$currentName' in $signature. It will conflict with the new parameter."
                                        }
                                    }
                            )
                        }' @ [185:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'receiver' @ [185:29] ==> var receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'result' @ [186:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'add' @ [186:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinImplicitThisUsage' @ [186:40] ==> public constructor KotlinImplicitThisUsage(callElement: KtElement, targetDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisUsage[ClassConstructorDescriptorImpl]

'callElement' @ [186:64] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'receiver' @ [186:77] ==> var receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'declarationDescriptor' @ [186:86] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'receiver' @ [188:34] ==> var receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'result' @ [189:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[ValueParameterDescriptorImpl]

'add' @ [189:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'UnresolvableCollisionUsageInfo' @ [190:46] ==> public constructor UnresolvableCollisionUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.rename.UnresolvableCollisionUsageInfo[JavaClassConstructorDescriptor]

'callElement' @ [190:77] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'IdeDescriptorRenderers' @ [192:61] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [192:84] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [192:117] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'callerDescriptor' @ [192:124] ==> val callerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages[LocalVariableDescriptor]

'currentName' @ [193:83] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'signature' @ [193:100] ==> val signature: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findCallerUsages.<no name provided>.visitSimpleNameExpression.<no name provided>.getDescription[LocalVariableDescriptor]

'LinkedHashSet' @ [203:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiReference

'functionPsi' @ [205:27] ==> value-parameter functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[ValueParameterDescriptorImpl]

'useScope' @ [205:39] ==> public final val PsiElement.useScope: SearchScope[MyPropertyDescriptor]

'KotlinReferencesSearchOptions' @ [206:23] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'KotlinReferencesSearchParameters' @ [207:26] ==> public constructor KotlinReferencesSearchParameters(elementToSearch: PsiElement, scope: SearchScope = ..., ignoreAccessScope: Boolean = ..., optimizer: SearchRequestCollector? = ..., kotlinOptions: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[DeserializedClassConstructorDescriptor]

'functionPsi' @ [207:59] ==> value-parameter functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[ValueParameterDescriptorImpl]

'searchScope' @ [207:72] ==> val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'options' @ [207:98] ==> val options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'result' @ [208:9] ==> val result: LinkedHashSet<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'addAll' @ [208:16] ==> public open fun addAll(elements: Collection<PsiReference>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'search' @ [208:40] ==> @NotNull public open fun search(@NotNull p0: ReferencesSearch.SearchParameters): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'parameters' @ [208:47] ==> val parameters: KotlinReferencesSearchParameters defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'findAll' @ [208:59] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'functionPsi' @ [209:13] ==> value-parameter functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[ValueParameterDescriptorImpl]

'functionPsi' @ [209:42] ==> value-parameter functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[ValueParameterDescriptorImpl]

'functionPsi' @ [210:13] ==> value-parameter functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[ValueParameterDescriptorImpl]

'toLightMethods' @ [210:25] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'flatMapTo' @ [210:42] ==> public inline fun <T, R, C : MutableCollection<in (PsiReference..PsiReference?)>> Iterable<PsiMethod>.flatMapTo(destination: LinkedHashSet<PsiReference>, transform: (PsiMethod) -> Iterable<(PsiReference..PsiReference?)>): LinkedHashSet<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <C : MutableCollection<in R>> -> LinkedHashSet<PsiReference>

'result' @ [210:52] ==> val result: LinkedHashSet<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'search' @ [210:85] ==> public open fun search(@NotNull p0: PsiMethod, p1: (SearchScope..SearchScope?), p2: Boolean): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'it' @ [210:92] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences.<anonymous>[ValueParameterDescriptorImpl]

'searchScope' @ [210:96] ==> val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'findAll' @ [210:115] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'result' @ [213:16] ==> val result: LinkedHashSet<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReferences[LocalVariableDescriptor]

'functionUsageInfo' @ [221:27] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'isInherited' @ [221:45] ==> public final val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'isInherited' @ [223:13] ==> val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'result' @ [224:13] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [224:20] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'functionUsageInfo' @ [224:24] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'functionUsageInfo' @ [227:27] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'element' @ [227:45] ==> public final val <T : PsiElement> KotlinCallableDefinitionUsage<out PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> Captured(*)

'findReferences' @ [229:27] ==> private final fun findReferences(functionPsi: PsiElement): Set<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'functionPsi' @ [229:42] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'reference' @ [230:27] ==> val reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [230:37] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [232:17] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [233:30] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [233:38] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
                    parent is KtCallExpression ->
                        result.add(KotlinFunctionCallUsage(parent, functionUsageInfo))

                    parent is KtUserType && parent.parent is KtTypeReference -> {
                        parent = parent.parent.parent

                        if (parent is KtConstructorCalleeExpression && parent.parent is KtSuperTypeCallEntry)
                            result.add(KotlinFunctionCallUsage(parent.parent as KtSuperTypeCallEntry, functionUsageInfo))
                    }

                    element is KtSimpleNameExpression && (functionPsi is KtProperty || functionPsi is KtParameter) ->
                        result.add(KotlinPropertyCallUsage(element))
                }' @ [235:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'parent' @ [236:21] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'result' @ [237:25] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [237:32] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinFunctionCallUsage' @ [237:36] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'parent' @ [237:60] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'functionUsageInfo' @ [237:68] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'parent' @ [239:21] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [239:45] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [239:52] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [240:25] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [240:34] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [240:41] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [240:48] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [242:29] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [242:72] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [242:79] ==> public final val KtConstructorCalleeExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [243:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [243:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinFunctionCallUsage' @ [243:40] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'parent' @ [243:64] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [243:71] ==> public final val KtConstructorCalleeExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'functionUsageInfo' @ [243:103] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'element' @ [246:21] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'functionPsi' @ [246:59] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'functionPsi' @ [246:88] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'result' @ [247:25] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [247:32] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinPropertyCallUsage' @ [247:36] ==> public constructor KotlinPropertyCallUsage(element: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinPropertyCallUsage[ClassConstructorDescriptorImpl]

'element' @ [247:60] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'changeInfo' @ [252:23] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'oldName' @ [252:34] ==> public val KotlinChangeInfo.oldName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[PropertyDescriptorImpl]

'oldName' @ [254:13] ==> val oldName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'findNonCodeUsages' @ [255:33] ==> public open fun findNonCodeUsages(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: (String..String?), p5: (MutableCollection<(UsageInfo..UsageInfo?)>..Collection<(UsageInfo..UsageInfo?)>?)): Unit defined in com.intellij.refactoring.util.TextOccurrencesUtil[JavaMethodDescriptor]

'functionPsi' @ [255:51] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldName' @ [255:64] ==> val oldName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'changeInfo' @ [255:85] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'newName' @ [255:96] ==> public final var KotlinChangeInfo.newName: String[MyPropertyDescriptor]

'result' @ [255:105] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'functionPsi' @ [258:30] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'getValueParameters' @ [258:65] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [260:31] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'receiverParameterInfo' @ [260:42] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'functionPsi' @ [262:27] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'?:' @ [262:66] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'functionPsi' @ [262:67] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'getContainingClassOrObject' @ [262:79] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'isData' @ [262:122] ==> public final fun isData(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'component1' @ [264:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [264:18] ==> public final operator fun component2(): KotlinParameterInfo defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [264:36] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'newParameters' @ [264:47] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'withIndex' @ [264:61] ==> public fun <T> Array<out KotlinParameterInfo>.withIndex(): Iterable<IndexedValue<KotlinParameterInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'parameterInfo' @ [265:17] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldIndex' @ [265:31] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'parameterInfo' @ [265:48] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldIndex' @ [265:62] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'oldParameters' @ [265:73] ==> val oldParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'size' @ [265:87] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'oldParameters' @ [266:32] ==> val oldParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parameterInfo' @ [266:46] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldIndex' @ [266:60] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'oldParam' @ [267:36] ==> val oldParam: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'name' @ [267:45] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'parameterInfo' @ [269:21] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'newReceiverInfo' @ [269:38] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldParamName' @ [270:22] ==> val oldParamName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldParamName' @ [270:46] ==> val oldParamName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parameterInfo' @ [270:62] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'name' @ [270:76] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'isDataClass' @ [271:21] ==> val isDataClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'i' @ [271:36] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parameterInfo' @ [271:41] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldIndex' @ [271:55] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'iterator' @ [272:39] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [272:56] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'oldParam' @ [272:63] ==> val oldParam: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'oldParam' @ [272:73] ==> val oldParam: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'useScope' @ [272:82] ==> public final val KtParameter.useScope: SearchScope[MyPropertyDescriptor]

'reference' @ [273:39] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [273:49] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (isDataClass &&
                            element is KtSimpleNameExpression &&
                            (element.parent as? KtCallExpression)?.calleeExpression == element &&
                            element.getReferencedName() != parameterInfo.name &&
                            OperatorNameConventions.COMPONENT_REGEX.matches(element.getReferencedName())) {
                            result.add(KotlinDataClassComponentUsage(element, "component${i + 1}"))
                        }
                        // Usages in named arguments of the calls usage will be changed when the function call is changed
                        else if ((element is KtSimpleNameExpression || element is KDocName) && element.parent !is KtValueArgumentName) {
                            result.add(KotlinParameterUsage(element as KtElement, parameterInfo, functionUsageInfo))
                        }' @ [275:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'isDataClass' @ [275:29] ==> val isDataClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [276:29] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'==' @ [277:29] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [277:30] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [277:38] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'calleeExpression' @ [277:68] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [277:88] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [278:29] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'getReferencedName' @ [278:37] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'parameterInfo' @ [278:60] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'name' @ [278:74] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'OperatorNameConventions' @ [279:29] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'COMPONENT_REGEX' @ [279:53] ==> @field:JvmField public final val COMPONENT_REGEX: Regex defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'matches' @ [279:69] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'element' @ [279:77] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'getReferencedName' @ [279:85] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'result' @ [280:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [280:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinDataClassComponentUsage' @ [280:40] ==> public constructor KotlinDataClassComponentUsage(calleeExpression: KtSimpleNameExpression, newName: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinDataClassComponentUsage[ClassConstructorDescriptorImpl]

'element' @ [280:70] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'i' @ [280:91] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [283:35] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [283:72] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'element' @ [283:96] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parent' @ [283:104] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [284:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [284:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinParameterUsage' @ [284:40] ==> public constructor KotlinParameterUsage(element: KtElement, parameterInfo: KotlinParameterInfo, containingCallable: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[ClassConstructorDescriptorImpl]

'element' @ [284:61] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'parameterInfo' @ [284:83] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'functionUsageInfo' @ [284:98] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'isDataClass' @ [291:13] ==> val isDataClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'!' @ [291:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [291:29] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'hasAppendedParametersOnly' @ [291:40] ==> public final fun hasAppendedParametersOnly(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'functionPsi' @ [292:14] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'valueParameters' @ [292:51] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [292:67] ==> public fun <T> List<(KtParameter..KtParameter?)>.firstOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'let' @ [292:82] ==> @InlineOnly public inline fun <T, R> KtParameter.let(block: (KtParameter) -> MutableSet<UsageInfo>): MutableSet<UsageInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> MutableSet<UsageInfo>

'search' @ [293:34] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'it' @ [293:41] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages.<anonymous>[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [293:45] ==> public inline fun <T, R : Any, C : MutableCollection<in KotlinComponentUsageInDestructuring>> Iterable<(PsiReference..PsiReference?)>.mapNotNullTo(destination: MutableSet<UsageInfo>, transform: ((PsiReference..PsiReference?)) -> KotlinComponentUsageInDestructuring?): MutableSet<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> KotlinComponentUsageInDestructuring
    <C : MutableCollection<in R>> -> MutableSet<UsageInfo>

'result' @ [293:58] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'it' @ [294:46] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [294:49] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KotlinComponentUsageInDestructuring' @ [295:21] ==> public constructor KotlinComponentUsageInDestructuring(element: KtDestructuringDeclarationEntry) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinComponentUsageInDestructuring[ClassConstructorDescriptorImpl]

'destructuringEntry' @ [295:57] ==> val destructuringEntry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'functionPsi' @ [300:13] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'newReceiverInfo' @ [300:42] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'changeInfo' @ [300:61] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'methodDescriptor' @ [300:72] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [300:89] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'findOriginalReceiversUsages' @ [301:13] ==> private final fun findOriginalReceiversUsages(functionUsageInfo: KotlinCallableDefinitionUsage<*>, result: MutableSet<UsageInfo>, changeInfo: KotlinChangeInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'functionUsageInfo' @ [301:41] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'result' @ [301:60] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'changeInfo' @ [301:68] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'functionPsi' @ [304:13] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'functionPsi' @ [304:39] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'isEnum' @ [304:51] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'functionPsi' @ [305:33] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'declarations' @ [305:45] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'declaration' @ [306:21] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'declaration' @ [306:51] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'superTypeListEntries' @ [306:63] ==> public final val KtEnumEntry.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'isEmpty' @ [306:84] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'result' @ [307:21] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [307:28] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinEnumEntryWithoutSuperCallUsage' @ [307:32] ==> public constructor KotlinEnumEntryWithoutSuperCallUsage(enumEntry: KtEnumEntry) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinEnumEntryWithoutSuperCallUsage[ClassConstructorDescriptorImpl]

'declaration' @ [307:69] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'functionPsi' @ [312:9] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'processDelegationCallConstructorUsages' @ [312:21] ==> public fun PsiElement.processDelegationCallConstructorUsages(scope: SearchScope, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'functionPsi' @ [312:60] ==> val functionPsi: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[LocalVariableDescriptor]

'useScope' @ [312:72] ==> public final val KtNamedDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'when (it) {
                is KtConstructorDelegationCall -> result.add(KotlinConstructorDelegationCallUsage(it, changeInfo))
                is KtSuperTypeCallEntry -> result.add(KotlinFunctionCallUsage(it, functionUsageInfo))
            }' @ [313:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [313:19] ==> value-parameter it: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [314:51] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [314:58] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinConstructorDelegationCallUsage' @ [314:62] ==> public constructor KotlinConstructorDelegationCallUsage(call: KtConstructorDelegationCall, changeInfo: KotlinChangeInfo) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinConstructorDelegationCallUsage[ClassConstructorDescriptorImpl]

'it' @ [314:99] ==> value-parameter it: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages.<anonymous>[ValueParameterDescriptorImpl]

'changeInfo' @ [314:103] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'result' @ [315:44] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'add' @ [315:51] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinFunctionCallUsage' @ [315:55] ==> public constructor KotlinFunctionCallUsage(element: KtCallElement, callee: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[ClassConstructorDescriptorImpl]

'it' @ [315:79] ==> value-parameter it: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages.<anonymous>[ValueParameterDescriptorImpl]

'functionUsageInfo' @ [315:83] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOneMethodUsages[ValueParameterDescriptorImpl]

'functionUsageInfo' @ [322:26] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[ValueParameterDescriptorImpl]

'declaration' @ [322:44] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'ktFunction' @ [324:20] ==> val ktFunction: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'bodyExpression' @ [324:31] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'body' @ [325:9] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'accept' @ [325:15] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<(Void..Void?), (BindingContext..BindingContext?)>, data: (BindingContext..BindingContext?)): (Void..Void?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (java.lang.Void..java.lang.Void?)
    <D : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.BindingContext..org.jetbrains.kotlin.resolve.BindingContext?)

'visitor' @ [325:22] ==> value-parameter visitor: KtTreeVisitor<BindingContext> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[ValueParameterDescriptorImpl]

'body' @ [325:31] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'analyze' @ [325:36] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [325:60] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'ktFunction' @ [327:27] ==> val ktFunction: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'valueParameters' @ [327:38] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameter' @ [328:32] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'defaultValue' @ [328:42] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultValue' @ [329:13] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'accept' @ [329:27] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<(Void..Void?), (BindingContext..BindingContext?)>, data: (BindingContext..BindingContext?)): (Void..Void?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (java.lang.Void..java.lang.Void?)
    <D : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.BindingContext..org.jetbrains.kotlin.resolve.BindingContext?)

'visitor' @ [329:34] ==> value-parameter visitor: KtTreeVisitor<BindingContext> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[ValueParameterDescriptorImpl]

'defaultValue' @ [329:43] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processInternalReferences[LocalVariableDescriptor]

'analyze' @ [329:56] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [329:80] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'changeInfo' @ [338:36] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'methodDescriptor' @ [338:47] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [338:64] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'functionUsageInfo' @ [339:34] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'originalCallableDescriptor' @ [339:52] ==> public final val originalCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'processInternalReferences' @ [340:9] ==> private final fun processInternalReferences(functionUsageInfo: KotlinCallableDefinitionUsage<*>, visitor: KtTreeVisitor<BindingContext>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'functionUsageInfo' @ [341:17] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'KtTreeVisitor<BindingContext>' @ [342:26] ==> public constructor KtTreeVisitor<D : (Any..Any?)>() defined in org.jetbrains.kotlin.psi.KtTreeVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <D : (Any..Any?)> -> BindingContext

'originalReceiverInfo' @ [346:29] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'!' @ [346:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [346:62] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'hasParameter' @ [346:73] ==> public final fun hasParameter(parameterInfo: KotlinParameterInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'originalReceiverInfo' @ [346:86] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'expression' @ [347:29] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[ValueParameterDescriptorImpl]

'parent' @ [347:40] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (receiverDescriptor === callableDescriptor.extensionReceiverParameter) {
                            assert(originalReceiverInfo != null) { "No original receiver info provided: " + functionUsageInfo.declaration.text }
                            result.add(KotlinParameterUsage(expression, originalReceiverInfo!!, functionUsageInfo))
                        }
                        else {
                            val targetDescriptor = receiverDescriptor.type.constructor.declarationDescriptor
                            assert(targetDescriptor != null) { "Receiver type has no descriptor: " + functionUsageInfo.declaration.text }
                            result.add(KotlinNonQualifiedOuterThisUsage(expression.parent as KtThisExpression, targetDescriptor!!))
                        }' @ [349:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'receiverDescriptor' @ [349:29] ==> value-parameter receiverDescriptor: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[ValueParameterDescriptorImpl]

'callableDescriptor' @ [349:52] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'extensionReceiverParameter' @ [349:71] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'assert' @ [350:29] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'originalReceiverInfo' @ [350:36] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'+' @ [350:68] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionUsageInfo' @ [350:109] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'declaration' @ [350:127] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'text' @ [350:139] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'result' @ [351:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'add' @ [351:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinParameterUsage' @ [351:40] ==> public constructor KotlinParameterUsage(element: KtElement, parameterInfo: KotlinParameterInfo, containingCallable: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[ClassConstructorDescriptorImpl]

'expression' @ [351:61] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[ValueParameterDescriptorImpl]

'originalReceiverInfo' @ [351:73] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'functionUsageInfo' @ [351:97] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'receiverDescriptor' @ [354:52] ==> value-parameter receiverDescriptor: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[ValueParameterDescriptorImpl]

'type' @ [354:71] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [354:76] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [354:88] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'assert' @ [355:29] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [355:36] ==> val targetDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[LocalVariableDescriptor]

'+' @ [355:64] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionUsageInfo' @ [355:102] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'declaration' @ [355:120] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'text' @ [355:132] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'result' @ [356:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'add' @ [356:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinNonQualifiedOuterThisUsage' @ [356:40] ==> public constructor KotlinNonQualifiedOuterThisUsage(element: KtThisExpression, targetDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinNonQualifiedOuterThisUsage[ClassConstructorDescriptorImpl]

'expression' @ [356:73] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[ValueParameterDescriptorImpl]

'parent' @ [356:84] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetDescriptor' @ [356:112] ==> val targetDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processExplicitThis[LocalVariableDescriptor]

'implicitReceiver' @ [363:48] ==> value-parameter implicitReceiver: ImplicitReceiver defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processImplicitThis[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [363:65] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'if (compareDescriptors(callElement.project, targetDescriptor, callableDescriptor)) {
                            assert(originalReceiverInfo != null) { "No original receiver info provided: " + functionUsageInfo.declaration.text }
                            if (originalReceiverInfo in changeInfo.getNonReceiverParameters()) {
                                result.add(KotlinImplicitThisToParameterUsage(callElement, originalReceiverInfo!!, functionUsageInfo))
                            }
                        }
                        else {
                            result.add(KotlinImplicitThisUsage(callElement, targetDescriptor))
                        }' @ [364:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'compareDescriptors' @ [364:29] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'callElement' @ [364:48] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processImplicitThis[ValueParameterDescriptorImpl]

'project' @ [364:60] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'targetDescriptor' @ [364:69] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processImplicitThis[LocalVariableDescriptor]

'callableDescriptor' @ [364:87] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'assert' @ [365:29] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'originalReceiverInfo' @ [365:36] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'+' @ [365:68] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionUsageInfo' @ [365:109] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'declaration' @ [365:127] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'text' @ [365:139] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'originalReceiverInfo' @ [366:33] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'changeInfo' @ [366:57] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [366:68] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'result' @ [367:33] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'add' @ [367:40] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinImplicitThisToParameterUsage' @ [367:44] ==> public constructor KotlinImplicitThisToParameterUsage(callElement: KtElement, parameterInfo: KotlinParameterInfo, containingCallable: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisToParameterUsage[ClassConstructorDescriptorImpl]

'callElement' @ [367:79] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processImplicitThis[ValueParameterDescriptorImpl]

'originalReceiverInfo' @ [367:92] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[LocalVariableDescriptor]

'functionUsageInfo' @ [367:116] ==> value-parameter functionUsageInfo: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'result' @ [371:29] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages[ValueParameterDescriptorImpl]

'add' @ [371:36] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KotlinImplicitThisUsage' @ [371:40] ==> public constructor KotlinImplicitThisUsage(callElement: KtElement, targetDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinImplicitThisUsage[ClassConstructorDescriptorImpl]

'callElement' @ [371:64] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processImplicitThis[ValueParameterDescriptorImpl]

'targetDescriptor' @ [371:77] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.processImplicitThis[LocalVariableDescriptor]

'expression' @ [376:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [376:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [376:71] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [378:51] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [378:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resultingDescriptor' @ [379:29] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'processExplicitThis' @ [380:29] ==> private final fun processExplicitThis(expression: KtSimpleNameExpression, receiverDescriptor: ReceiverParameterDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [380:49] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [380:61] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [384:45] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'extensionReceiver' @ [384:58] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [384:79] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'dispatchReceiver' @ [384:92] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'receiverValue' @ [385:29] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'processImplicitThis' @ [386:29] ==> private final fun processImplicitThis(callElement: KtElement, implicitReceiver: ImplicitReceiver): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [386:49] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'call' @ [386:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [386:67] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'receiverValue' @ [386:80] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findOriginalReceiversUsages.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'changeInfo' @ [395:22] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[ValueParameterDescriptorImpl]

'method' @ [395:33] ==> public final val ChangeInfo.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [396:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [396:14] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'isTrueJavaMethod' @ [396:21] ==> public fun PsiElement.isTrueJavaMethod(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'method' @ [397:9] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'method' @ [399:13] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'containingClass' @ [399:20] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'method' @ [401:36] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'getJavaMethodDescriptor' @ [401:43] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [401:70] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDescriptor' @ [402:13] ==> val containingDescriptor: JavaClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'defaultFunctionTypeForSamInterface' @ [402:34] ==> public final val JavaClassDescriptor.defaultFunctionTypeForSamInterface: SimpleType?[MyPropertyDescriptor]

'method' @ [403:24] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'containingClass' @ [403:31] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'iterator' @ [405:21] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [405:38] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'samClass' @ [405:45] ==> val samClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'ref' @ [406:17] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'ref' @ [408:26] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'expression' @ [408:30] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'callee' @ [409:34] ==> val callee: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [409:41] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'callExpression' @ [410:17] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'calleeExpression' @ [410:32] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callee' @ [410:53] ==> val callee: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'callExpression' @ [412:29] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'valueArguments' @ [412:44] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [413:17] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'size' @ [413:27] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'arguments' @ [415:33] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'getArgumentExpression' @ [415:46] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argExpression' @ [416:17] ==> val argExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'callExpression' @ [418:27] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'analyze' @ [418:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [418:66] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'argExpression' @ [420:35] ==> val argExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'functionLiteral' @ [420:49] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'context' @ [421:38] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'get' @ [421:46] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), p1: (PsiElement..PsiElement?)): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'FUNCTION' @ [421:65] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'functionLiteral' @ [421:75] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'assert' @ [422:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [422:20] ==> val functionDescriptor: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'+' @ [422:50] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionLiteral' @ [422:73] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'text' @ [422:89] ==> public final val KtFunctionLiteral.text: (String..String?)[MyPropertyDescriptor]

'context' @ [424:31] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'getType' @ [424:39] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'callExpression' @ [424:47] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'result' @ [426:13] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[ValueParameterDescriptorImpl]

'add' @ [426:20] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'DeferredJavaMethodOverrideOrSAMUsage' @ [426:24] ==> public constructor DeferredJavaMethodOverrideOrSAMUsage(function: KtFunction, functionDescriptor: FunctionDescriptor, samCallType: KotlinType?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.DeferredJavaMethodOverrideOrSAMUsage[ClassConstructorDescriptorImpl]

'functionLiteral' @ [426:61] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'functionDescriptor' @ [426:78] ==> val functionDescriptor: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'samCallType' @ [426:100] ==> val samCallType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findSAMUsages[LocalVariableDescriptor]

'changeInfo' @ [431:22] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[ValueParameterDescriptorImpl]

'method' @ [431:33] ==> public final val ChangeInfo.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'iterator' @ [433:34] ==> public abstract fun iterator(): MutableIterator<(PsiMethod..PsiMethod?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [433:58] ==> @NotNull public open fun search(@NotNull p0: PsiMethod): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'method' @ [433:65] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'overridingMethod' @ [434:36] ==> val overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'namedUnwrappedElement' @ [434:53] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'unwrappedElement' @ [435:38] ==> val unwrappedElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [435:55] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'result' @ [436:13] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[ValueParameterDescriptorImpl]

'add' @ [436:20] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'DeferredJavaMethodOverrideOrSAMUsage' @ [436:24] ==> public constructor DeferredJavaMethodOverrideOrSAMUsage(function: KtFunction, functionDescriptor: FunctionDescriptor, samCallType: KotlinType?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.DeferredJavaMethodOverrideOrSAMUsage[ClassConstructorDescriptorImpl]

'unwrappedElement' @ [436:61] ==> val unwrappedElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'functionDescriptor' @ [436:79] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'findDeferredUsagesOfParameters' @ [437:13] ==> private final fun findDeferredUsagesOfParameters(changeInfo: ChangeInfo, result: MutableSet<UsageInfo>, function: KtNamedFunction, functionDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'changeInfo' @ [437:44] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[ValueParameterDescriptorImpl]

'result' @ [437:56] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[ValueParameterDescriptorImpl]

'unwrappedElement' @ [437:64] ==> val unwrappedElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'functionDescriptor' @ [437:82] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinOverrides[LocalVariableDescriptor]

'changeInfo' @ [442:22] ==> value-parameter changeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[ValueParameterDescriptorImpl]

'method' @ [442:33] ==> public final val JavaChangeInfo.method: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'!' @ [443:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [443:14] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[LocalVariableDescriptor]

'isTrueJavaMethod' @ [443:21] ==> public fun PsiElement.isTrueJavaMethod(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'changeInfo' @ [445:31] ==> value-parameter changeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[ValueParameterDescriptorImpl]

'methodsToPropagateParameters' @ [445:42] ==> public final val JavaChangeInfo.methodsToPropagateParameters: (MutableCollection<(PsiMethod..PsiMethod?)>..Collection<(PsiMethod..PsiMethod?)>?)[MyPropertyDescriptor]

'addDeferredCallerIfPossible' @ [446:13] ==> private final fun addDeferredCallerIfPossible(result: MutableSet<UsageInfo>, overridingCaller: PsiMethod): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'result' @ [446:41] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[ValueParameterDescriptorImpl]

'primaryCaller' @ [446:49] ==> val primaryCaller: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[LocalVariableDescriptor]

'iterator' @ [447:38] ==> public abstract fun iterator(): MutableIterator<(PsiMethod..PsiMethod?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [447:62] ==> @NotNull public open fun search(@NotNull p0: PsiMethod): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'primaryCaller' @ [447:69] ==> val primaryCaller: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[LocalVariableDescriptor]

'addDeferredCallerIfPossible' @ [448:17] ==> private final fun addDeferredCallerIfPossible(result: MutableSet<UsageInfo>, overridingCaller: PsiMethod): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'result' @ [448:45] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[ValueParameterDescriptorImpl]

'overridingCaller' @ [448:53] ==> val overridingCaller: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findKotlinCallers[LocalVariableDescriptor]

'overridingCaller' @ [454:32] ==> value-parameter overridingCaller: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.addDeferredCallerIfPossible[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [454:49] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'unwrappedElement' @ [455:13] ==> val unwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.addDeferredCallerIfPossible[LocalVariableDescriptor]

'unwrappedElement' @ [455:47] ==> val unwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.addDeferredCallerIfPossible[LocalVariableDescriptor]

'result' @ [456:13] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.addDeferredCallerIfPossible[ValueParameterDescriptorImpl]

'add' @ [456:20] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'DeferredJavaMethodKotlinCallerUsage' @ [456:24] ==> public constructor DeferredJavaMethodKotlinCallerUsage(declaration: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.DeferredJavaMethodKotlinCallerUsage[ClassConstructorDescriptorImpl]

'unwrappedElement' @ [456:60] ==> val unwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.addDeferredCallerIfPossible[LocalVariableDescriptor]

'KotlinCallableDefinitionUsage' @ [465:41] ==> public constructor KotlinCallableDefinitionUsage<T : PsiElement>(function: PsiElement, originalCallableDescriptor: CallableDescriptor, baseFunction: KotlinCallableDefinitionUsage<PsiElement>?, samCallType: KotlinType?, canDropOverride: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiElement

'function' @ [465:83] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[ValueParameterDescriptorImpl]

'functionDescriptor' @ [465:93] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[ValueParameterDescriptorImpl]

'function' @ [466:29] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [466:38] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'changeInfo' @ [467:26] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[ValueParameterDescriptorImpl]

'newParameters' @ [467:37] ==> public final val ChangeInfo.newParameters: (Array<(ParameterInfo..ParameterInfo?)>..Array<out (ParameterInfo..ParameterInfo?)>)[MyPropertyDescriptor]

'component1' @ [468:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [468:27] ==> public final operator fun component2(): (ParameterInfo..ParameterInfo?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameters' @ [468:45] ==> val parameters: (Array<(ParameterInfo..ParameterInfo?)>..Array<out (ParameterInfo..ParameterInfo?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'withIndex' @ [468:56] ==> public fun <T> Array<out (ParameterInfo..ParameterInfo?)>.withIndex(): Iterable<IndexedValue<(ParameterInfo..ParameterInfo?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.changeSignature.ParameterInfo..com.intellij.refactoring.changeSignature.ParameterInfo?)

'!' @ [469:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterInfo' @ [469:19] ==> val parameterInfo: (ParameterInfo..ParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'oldIndex' @ [469:33] ==> public final val ParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'parameterInfo' @ [469:50] ==> val parameterInfo: (ParameterInfo..ParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'oldIndex' @ [469:64] ==> public final val ParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'oldParameters' @ [469:75] ==> val oldParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'size' @ [469:89] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'oldParameters' @ [471:28] ==> val oldParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'parameterInfo' @ [471:42] ==> val parameterInfo: (ParameterInfo..ParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'oldIndex' @ [471:56] ==> public final val ParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'oldParam' @ [472:32] ==> val oldParam: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'name' @ [472:41] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'!' @ [474:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'oldParamName' @ [474:19] ==> val oldParamName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'oldParamName' @ [474:43] ==> val oldParamName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'parameterInfo' @ [474:59] ==> val parameterInfo: (ParameterInfo..ParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'name' @ [474:73] ==> public final var ParameterInfo.name: (String..String?)[MyPropertyDescriptor]

'iterator' @ [476:31] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [476:48] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'oldParam' @ [476:55] ==> val oldParam: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'oldParam' @ [476:65] ==> val oldParam: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'useScope' @ [476:74] ==> public final val KtParameter.useScope: SearchScope[MyPropertyDescriptor]

'reference' @ [477:31] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'element' @ [477:41] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [479:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [479:24] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'element' @ [479:61] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'element' @ [479:85] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'parent' @ [479:93] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [481:17] ==> value-parameter result: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[ValueParameterDescriptorImpl]

'add' @ [481:24] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'JavaMethodDeferredKotlinUsage<KtElement>' @ [482:34] ==> public constructor JavaMethodDeferredKotlinUsage<T : PsiElement>(element: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodDeferredKotlinUsage[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtElement

'element' @ [482:75] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'JavaMethodKotlinUsageWithDelegate<KtElement>' @ [484:49] ==> public constructor JavaMethodKotlinUsageWithDelegate<T : PsiElement>(psiElement: KtElement, javaMethodChangeInfo: KotlinChangeInfo) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtElement

'element' @ [484:94] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'javaMethodChangeInfo' @ [484:116] ==> value-parameter javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters.<no name provided>.resolve[ValueParameterDescriptorImpl]

'KotlinParameterUsage' @ [486:49] ==> public constructor KotlinParameterUsage(element: KtElement, parameterInfo: KotlinParameterInfo, containingCallable: KotlinCallableDefinitionUsage<*>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[ClassConstructorDescriptorImpl]

'element' @ [486:70] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'this' @ [487:70] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters.<no name provided>.resolve.<no name provided>[LazyClassReceiverParameterDescriptor]

'javaMethodChangeInfo' @ [487:75] ==> public final var javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters.<no name provided>.resolve.<no name provided>[PropertyDescriptorImpl]

'newParameters' @ [487:96] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'paramIndex' @ [487:110] ==> val paramIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'functionInfoForParameters' @ [488:70] ==> val functionInfoForParameters: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findDeferredUsagesOfParameters[LocalVariableDescriptor]

'MultiMap' @ [498:22] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'refUsages' @ [502:26] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'get' @ [502:36] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'usageInfos' @ [503:30] ==> val usageInfos: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'filterNot' @ [503:41] ==> public inline fun <T> Array<out UsageInfo>.filterNot(predicate: (UsageInfo) -> Boolean): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'getOverriderOrCaller' @ [503:53] ==> private final fun getOverriderOrCaller(usage: UsageInfo): PsiMethod? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'it' @ [503:74] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts.<anonymous>[ValueParameterDescriptorImpl]

'adjustedUsages' @ [504:13] ==> val adjustedUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'size' @ [504:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'usageInfos' @ [504:35] ==> val usageInfos: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'size' @ [504:46] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'refUsages' @ [505:13] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'set' @ [505:23] ==> public final fun set(@Nullable p0: Array<UsageInfo>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'adjustedUsages' @ [505:27] ==> val adjustedUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'toTypedArray' @ [505:42] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'info' @ [508:13] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'result' @ [508:54] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'info' @ [510:28] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'delegate' @ [510:33] ==> public final var delegate: KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[PropertyDescriptorImpl]

'HashSet' @ [512:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in com.intellij.util.containers.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'info' @ [513:24] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'method' @ [513:29] ==> public final val KotlinChangeInfoWrapper.method: PsiElement[MyPropertyDescriptor]

'function' @ [514:31] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'analyze' @ [514:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [514:78] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'ktChangeInfo' @ [515:29] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'originalBaseFunctionDescriptor' @ [515:42] ==> public val KotlinChangeInfo.originalBaseFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[PropertyDescriptorImpl]

'oldDescriptor' @ [516:37] ==> val oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'containingDeclaration' @ [516:51] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when {
            oldDescriptor is ConstructorDescriptor && containingDeclaration is ClassDescriptorWithResolutionScopes ->
                containingDeclaration.scopeForInitializerResolution
            function is KtFunction ->
                function.getBodyScope(bindingContext)
            else ->
                null
        }' @ [518:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LexicalScope?, entry1: LexicalScope?, entry2: LexicalScope?): LexicalScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LexicalScope?

'oldDescriptor' @ [519:13] ==> val oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'containingDeclaration' @ [519:55] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'containingDeclaration' @ [520:17] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'scopeForInitializerResolution' @ [520:39] ==> public final val ClassDescriptorWithResolutionScopes.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'function' @ [521:13] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'function' @ [522:17] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getBodyScope' @ [522:26] ==> public fun KtDeclarationWithBody.getBodyScope(bindingContext: BindingContext): LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring in file CallableRefactoring.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [522:39] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'oldDescriptor' @ [527:29] ==> val oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getContainingScope' @ [527:43] ==> public fun DeclarationDescriptor.getContainingScope(): LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring in file CallableRefactoring.kt[SimpleFunctionDescriptorImpl]

'ktChangeInfo' @ [529:20] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'kind' @ [529:33] ==> public val KotlinChangeInfo.kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[PropertyDescriptorImpl]

'!' @ [530:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kind' @ [530:14] ==> val kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'isConstructor' @ [530:19] ==> public final val isConstructor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[PropertyDescriptorImpl]

'callableScope' @ [530:36] ==> val callableScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'!' @ [530:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [530:62] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'newName' @ [530:67] ==> public final val KotlinChangeInfoWrapper.newName: String[MyPropertyDescriptor]

'isEmpty' @ [530:75] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'identifier' @ [531:32] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'info' @ [531:43] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'newName' @ [531:48] ==> public final val KotlinChangeInfoWrapper.newName: String[MyPropertyDescriptor]

'if (oldDescriptor is FunctionDescriptor)
                callableScope.getAllAccessibleFunctions(newName)
            else
                callableScope.getAllAccessibleVariables(newName)' @ [532:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<CallableDescriptor>, elseBranch: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<CallableDescriptor>

'oldDescriptor' @ [532:33] ==> val oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'callableScope' @ [533:17] ==> val callableScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getAllAccessibleFunctions' @ [533:31] ==> public fun LexicalScope.getAllAccessibleFunctions(name: Name): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'newName' @ [533:57] ==> val newName: Name defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'callableScope' @ [535:17] ==> val callableScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getAllAccessibleVariables' @ [535:31] ==> public fun LexicalScope.getAllAccessibleVariables(name: Name): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'newName' @ [535:57] ==> val newName: Name defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'info' @ [536:28] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'newParameters' @ [536:33] ==> public final val KotlinChangeInfoWrapper.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'map' @ [536:47] ==> public inline fun <T, R> Array<out KotlinParameterInfo>.map(transform: (KotlinParameterInfo) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo
    <R> -> KotlinType?

'it' @ [536:53] ==> value-parameter it: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts.<anonymous>[ValueParameterDescriptorImpl]

'currentTypeInfo' @ [536:56] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'type' @ [536:72] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'conflicts' @ [537:30] ==> val conflicts: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'conflict' @ [538:21] ==> val conflict: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'oldDescriptor' @ [538:34] ==> val oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [540:39] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [540:63] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'conflict' @ [540:87] ==> val conflict: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'conflictElement' @ [541:21] ==> val conflictElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'info' @ [541:41] ==> value-parameter info: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'method' @ [541:46] ==> public final val KotlinChangeInfoWrapper.method: PsiElement[MyPropertyDescriptor]

'listOfNotNull' @ [543:38] ==> public fun <T : Any> listOfNotNull(element: KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'conflict' @ [543:52] ==> val conflict: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'extensionReceiverParameter' @ [543:61] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [543:89] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'conflict' @ [543:97] ==> val conflict: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'valueParameters' @ [543:106] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [543:122] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [543:128] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [543:131] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'candidateTypes' @ [545:21] ==> val candidateTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'newTypes' @ [545:39] ==> val newTypes: List<KotlinType?> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'result' @ [546:21] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'putValue' @ [546:28] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'conflictElement' @ [546:37] ==> val conflictElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'+' @ [546:54] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'SHORT_NAMES_IN_TYPES' @ [546:104] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [546:125] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'conflict' @ [546:132] ==> val conflict: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'ktChangeInfo' @ [552:27] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getNonReceiverParameters' @ [552:40] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'parameter' @ [553:28] ==> val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'valOrVar' @ [553:38] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'parameter' @ [554:33] ==> val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'name' @ [554:43] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'!' @ [556:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterNames' @ [556:18] ==> val parameterNames: HashSet<String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'add' @ [556:33] ==> public open fun add(element: (String..String?)): Boolean defined in com.intellij.util.containers.HashSet[JavaMethodDescriptor]

'parameterName' @ [556:37] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'result' @ [557:17] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'putValue' @ [557:24] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'function' @ [557:33] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'parameterName' @ [557:68] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'parametersScope' @ [560:17] ==> val parametersScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'if (kind === KotlinMethodDescriptor.Kind.PRIMARY_CONSTRUCTOR && valOrVar !== KotlinValVar.None) {
                    for (property in parametersScope.getVariablesFromImplicitReceivers(Name.identifier(parameterName))) {
                        val propertyDeclaration = DescriptorToSourceUtils.descriptorToDeclaration(property) ?: continue
                        if (propertyDeclaration.parent !is KtParameterList) {
                            result.putValue(propertyDeclaration, "Duplicating property '$parameterName'")
                            break
                        }
                    }
                }
                else if (function is KtFunction) {
                    for (variable in parametersScope.getContributedVariables(Name.identifier(parameterName), NoLookupLocation.FROM_IDE)) {
                        if (variable is ValueParameterDescriptor) continue
                        val conflictElement = DescriptorToSourceUtils.descriptorToDeclaration(variable)
                        result.putValue(conflictElement, "Duplicating local variable '$parameterName'")
                    }
                }' @ [561:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'kind' @ [561:21] ==> val kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'PRIMARY_CONSTRUCTOR' @ [561:58] ==> enum entry PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'valOrVar' @ [561:81] ==> val valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'None' @ [561:107] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'parametersScope' @ [562:38] ==> val parametersScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getVariablesFromImplicitReceivers' @ [562:54] ==> public fun LexicalScope.getVariablesFromImplicitReceivers(name: Name): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'identifier' @ [562:93] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parameterName' @ [562:104] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'?:' @ [563:51] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'descriptorToDeclaration' @ [563:75] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'property' @ [563:99] ==> val property: VariableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'propertyDeclaration' @ [564:29] ==> val propertyDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'parent' @ [564:49] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [565:29] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'putValue' @ [565:36] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'propertyDeclaration' @ [565:45] ==> val propertyDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'parameterName' @ [565:90] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'function' @ [570:26] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'parametersScope' @ [571:38] ==> val parametersScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'getContributedVariables' @ [571:54] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [571:83] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parameterName' @ [571:94] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'FROM_IDE' @ [571:127] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'variable' @ [572:29] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [573:47] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [573:71] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'variable' @ [573:95] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'result' @ [574:25] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'putValue' @ [574:32] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'conflictElement' @ [574:41] ==> val conflictElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'parameterName' @ [574:88] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'ktChangeInfo' @ [580:31] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'receiverParameterInfo' @ [580:44] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'ktChangeInfo' @ [581:36] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'methodDescriptor' @ [581:49] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [581:66] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'function' @ [582:13] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'newReceiverInfo' @ [582:50] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'originalReceiverInfo' @ [582:69] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'findReceiverIntroducingConflicts' @ [583:13] ==> private final fun findReceiverIntroducingConflicts(result: MultiMap<PsiElement, String>, callable: PsiElement, newReceiverInfo: KotlinParameterInfo?): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'result' @ [583:46] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'function' @ [583:54] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'newReceiverInfo' @ [583:64] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'findInternalExplicitReceiverConflicts' @ [584:13] ==> private final fun findInternalExplicitReceiverConflicts(usages: Array<UsageInfo>, result: MultiMap<PsiElement, String>, originalReceiverInfo: KotlinParameterInfo?): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'refUsages' @ [584:51] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'get' @ [584:61] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'result' @ [584:68] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'originalReceiverInfo' @ [584:76] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'findReceiverToParameterInSafeCallsConflicts' @ [585:13] ==> private final fun findReceiverToParameterInSafeCallsConflicts(usages: Array<UsageInfo>, result: MultiMap<PsiElement, String>, changeInfo: KotlinChangeInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'refUsages' @ [585:57] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'get' @ [585:67] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'result' @ [585:74] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'ktChangeInfo' @ [585:82] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'findThisLabelConflicts' @ [586:13] ==> private final fun findThisLabelConflicts(refUsages: Ref<Array<UsageInfo>>, result: MultiMap<PsiElement, String>, changeInfo: KotlinChangeInfo, callable: KtCallableDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'refUsages' @ [586:36] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[ValueParameterDescriptorImpl]

'result' @ [586:47] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'ktChangeInfo' @ [586:55] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'function' @ [586:69] ==> val function: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'usageInfos' @ [589:27] ==> val usageInfos: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'usageInfo' @ [590:17] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'usageInfo' @ [591:36] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'element' @ [591:46] ==> public final val KotlinCallerUsage.element: KtNamedDeclaration?[MyPropertyDescriptor]

'resolveToDescriptorIfAny' @ [591:55] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'findParameterDuplicationInCaller' @ [592:13] ==> private final fun findParameterDuplicationInCaller(result: MultiMap<PsiElement, String>, changeInfo: KotlinChangeInfo, caller: KtNamedDeclaration, callerDescriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'result' @ [592:46] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'ktChangeInfo' @ [592:54] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'usageInfo' @ [592:68] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'element' @ [592:78] ==> public final val KotlinCallerUsage.element: KtNamedDeclaration?[MyPropertyDescriptor]

'callerDescriptor' @ [592:89] ==> val callerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'result' @ [595:16] ==> val result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findConflicts[LocalVariableDescriptor]

'caller' @ [603:31] ==> value-parameter caller: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[ValueParameterDescriptorImpl]

'getValueParameters' @ [603:38] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [604:34] ==> val valueParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'associateBy' @ [604:50] ==> public inline fun <T, K> Iterable<KtParameter>.associateBy(keySelector: (KtParameter) -> String?): Map<String?, KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <K> -> String?

'it' @ [604:64] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [604:67] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [605:25] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [605:48] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [605:81] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'callerDescriptor' @ [605:88] ==> value-parameter callerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[ValueParameterDescriptorImpl]

'changeInfo' @ [606:31] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [606:42] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'!' @ [607:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterInfo' @ [607:19] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'isNewParameter' @ [607:33] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'parameterInfo' @ [609:24] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'name' @ [609:38] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'existingParameters' @ [610:29] ==> val existingParameters: Map<String?, KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'name' @ [610:48] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'result' @ [612:13] ==> value-parameter result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[ValueParameterDescriptorImpl]

'putValue' @ [612:20] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'parameter' @ [612:29] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'name' @ [612:72] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'signature' @ [612:82] ==> val signature: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findParameterDuplicationInCaller[LocalVariableDescriptor]

'KtPsiFactory' @ [621:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'callable' @ [621:39] ==> value-parameter callable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[ValueParameterDescriptorImpl]

'project' @ [621:48] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'refUsages' @ [622:27] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[ValueParameterDescriptorImpl]

'get' @ [622:37] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'usageInfo' @ [623:17] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'usageInfo' @ [625:31] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'getReplacementText' @ [625:41] ==> public open fun getReplacementText(changeInfo: KotlinChangeInfo): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinParameterUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [625:60] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[ValueParameterDescriptorImpl]

'!' @ [626:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newExprText' @ [626:18] ==> val newExprText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'startsWith' @ [626:30] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'usageInfo' @ [628:17] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'element' @ [628:27] ==> public final val KotlinParameterUsage.element: KtElement?[MyPropertyDescriptor]

'usageInfo' @ [630:32] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'element' @ [630:42] ==> public final val KotlinParameterUsage.element: KtElement?[MyPropertyDescriptor]

'originalExpr' @ [631:34] ==> val originalExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'analyze' @ [631:47] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [631:71] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'originalExpr' @ [632:25] ==> val originalExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'getResolutionScope' @ [632:38] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [632:57] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'originalExpr' @ [632:73] ==> val originalExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'getResolutionFacade' @ [632:86] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [634:27] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'createExpression' @ [634:38] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newExprText' @ [634:55] ==> val newExprText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'newExpr' @ [636:30] ==> val newExpr: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'analyzeInContext' @ [636:38] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [636:55] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'originalExpr' @ [636:62] ==> val originalExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'newExpr' @ [638:29] ==> val newExpr: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'getTargetLabel' @ [638:37] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedSimpleFunctionDescriptor]

'labelExpr' @ [639:17] ==> val labelExpr: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'newContext' @ [639:38] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'get' @ [639:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): (MutableCollection<out (PsiElement..PsiElement?)>?..Collection<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (kotlin.collections.MutableCollection<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..kotlin.collections.Collection<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>?)

'AMBIGUOUS_LABEL_TARGET' @ [639:68] ==> public final val AMBIGUOUS_LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'labelExpr' @ [639:92] ==> val labelExpr: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'result' @ [640:17] ==> value-parameter result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[ValueParameterDescriptorImpl]

'putValue' @ [640:24] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalExpr' @ [641:25] ==> val originalExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'+' @ [642:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newExprText' @ [642:80] ==> val newExprText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'labelExpr' @ [642:106] ==> val labelExpr: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'text' @ [642:116] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'newContext' @ [646:30] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'get' @ [646:41] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [646:60] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'newExpr' @ [646:78] ==> val newExpr: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'instanceReference' @ [646:86] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'thisTarget' @ [647:34] ==> val thisTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'source' @ [647:83] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [647:91] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'thisTargetPsi' @ [648:17] ==> val thisTargetPsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'callable' @ [648:42] ==> value-parameter callable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[ValueParameterDescriptorImpl]

'isAncestor' @ [648:51] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'thisTargetPsi' @ [648:62] ==> val thisTargetPsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'result' @ [649:17] ==> value-parameter result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[ValueParameterDescriptorImpl]

'putValue' @ [649:24] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalExpr' @ [650:25] ==> val originalExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'newExprText' @ [651:77] ==> val newExprText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findThisLabelConflicts[LocalVariableDescriptor]

'originalReceiverInfo' @ [661:13] ==> value-parameter originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[ValueParameterDescriptorImpl]

'usages' @ [663:27] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[ValueParameterDescriptorImpl]

'!' @ [664:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usageInfo' @ [664:19] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'usageInfo' @ [664:59] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'usageInfo' @ [666:31] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'element' @ [666:41] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'callElement' @ [668:26] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'parent' @ [668:38] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [669:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'parent' @ [669:52] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'selectorExpression' @ [669:59] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'callElement' @ [669:82] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'+' @ [670:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'htmlEmphasize' @ [670:112] ==> public open fun htmlEmphasize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'parent' @ [670:126] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'text' @ [670:133] ==> public final val KtQualifiedExpression.text: (String..String?)[MyPropertyDescriptor]

'result' @ [671:17] ==> value-parameter result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[ValueParameterDescriptorImpl]

'putValue' @ [671:24] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'callElement' @ [671:33] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'message' @ [671:46] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findInternalExplicitReceiverConflicts[LocalVariableDescriptor]

'changeInfo' @ [681:36] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[ValueParameterDescriptorImpl]

'methodDescriptor' @ [681:47] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [681:64] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'originalReceiverInfo' @ [682:13] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'originalReceiverInfo' @ [682:45] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'changeInfo' @ [682:70] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [682:81] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'usages' @ [684:27] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[ValueParameterDescriptorImpl]

'!' @ [685:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usageInfo' @ [685:19] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'usageInfo' @ [685:59] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'usageInfo' @ [687:31] ==> val usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'element' @ [687:41] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'callElement' @ [688:39] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'getQualifiedExpressionForSelector' @ [688:51] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'qualifiedExpression' @ [689:17] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'result' @ [690:17] ==> value-parameter result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[ValueParameterDescriptorImpl]

'putValue' @ [690:24] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'callElement' @ [691:25] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'htmlEmphasize' @ [692:106] ==> public open fun htmlEmphasize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'qualifiedExpression' @ [692:120] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverToParameterInSafeCallsConflicts[LocalVariableDescriptor]

'text' @ [692:140] ==> public final val KtSafeQualifiedExpression.text: (String..String?)[MyPropertyDescriptor]

'newReceiverInfo' @ [702:13] ==> value-parameter newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'callable' @ [702:41] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'callable' @ [702:73] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'bodyExpression' @ [702:82] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'callable' @ [703:35] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'analyzeFully' @ [703:44] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [705:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtSimpleNameExpression

'callable' @ [706:13] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [706:22] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [707:36] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [707:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'originalContext' @ [707:55] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'resolvedCall' @ [708:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts.<anonymous>[LocalVariableDescriptor]

'noReceivers' @ [708:34] ==> internal fun ResolvedCall<*>.noReceivers(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'noReceiverRefs' @ [709:21] ==> val noReceiverRefs: ArrayList<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'it' @ [709:39] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [713:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'callable' @ [713:43] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'project' @ [713:52] ==> public final val KtNamedFunction.project: Project[MyPropertyDescriptor]

'callable' @ [714:29] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'containingFile' @ [714:38] ==> public final val KtNamedFunction.containingFile: PsiFile[MyPropertyDescriptor]

'createTempCopy' @ [714:64] ==> public fun KtFile.createTempCopy(text: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'tempFile' @ [715:40] ==> val tempFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'findElementAt' @ [715:49] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'callable' @ [715:63] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'textOffset' @ [715:72] ==> public final val KtNamedFunction.textOffset: Int[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [715:85] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'psiFactory' @ [716:35] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'createType' @ [716:46] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newReceiverInfo' @ [716:57] ==> value-parameter newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'currentTypeInfo' @ [716:73] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'render' @ [716:89] ==> public fun KotlinTypeInfo.render(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'functionWithReceiver' @ [717:13] ==> val functionWithReceiver: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'setReceiverTypeReference' @ [717:34] ==> public fun KtCallableDeclaration.setReceiverTypeReference(typeRef: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[DeserializedSimpleFunctionDescriptor]

'receiverTypeRef' @ [717:59] ==> val receiverTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'functionWithReceiver' @ [718:30] ==> val functionWithReceiver: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'bodyExpression' @ [718:51] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'analyze' @ [718:68] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [718:92] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callable' @ [720:34] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'bodyExpression' @ [720:43] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'textOffset' @ [720:60] ==> public final val KtExpression.textOffset: Int[MyPropertyDescriptor]

'functionWithReceiver' @ [721:27] ==> val functionWithReceiver: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'bodyExpression' @ [721:48] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'noReceiverRefs' @ [722:33] ==> val noReceiverRefs: ArrayList<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'newBody' @ [723:30] ==> val newBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'findElementAt' @ [724:26] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'originalRef' @ [724:40] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'textOffset' @ [724:52] ==> public final val KtSimpleNameExpression.textOffset: Int[MyPropertyDescriptor]

'originalOffset' @ [724:65] ==> val originalOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [725:27] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'newRef' @ [726:39] ==> val newRef: KtReferenceExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'getResolvedCall' @ [726:46] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [726:62] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'newResolvedCall' @ [727:21] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'newResolvedCall' @ [727:48] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'extensionReceiver' @ [727:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'newResolvedCall' @ [727:93] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'dispatchReceiver' @ [727:109] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'originalRef' @ [728:38] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'getResolvedCall' @ [728:50] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'originalContext' @ [728:66] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'candidateDescriptor' @ [728:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'DescriptorToSourceUtilsIde' @ [729:39] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [729:66] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'callable' @ [729:84] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'project' @ [729:93] ==> public final val KtNamedFunction.project: Project[MyPropertyDescriptor]

'descriptor' @ [729:102] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'if (declaration != null) RefactoringUIUtil.getDescription(declaration, true) else originalRef.text' @ [730:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'declaration' @ [730:38] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'getDescription' @ [730:77] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'declaration' @ [730:92] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'originalRef' @ [730:116] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'text' @ [730:128] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'result' @ [731:21] ==> value-parameter result: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[ValueParameterDescriptorImpl]

'putValue' @ [731:28] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalRef' @ [731:37] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'prefix' @ [731:50] ==> val prefix: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.findReceiverIntroducingConflicts[LocalVariableDescriptor]

'capitalize' @ [731:57] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'usageInfo' @ [739:16] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.isJavaMethodUsage[ValueParameterDescriptorImpl]

'usageInfo' @ [739:65] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.isJavaMethodUsage[ValueParameterDescriptorImpl]

'originalUsageInfo' @ [747:13] ==> value-parameter originalUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'originalUsageInfo' @ [747:75] ==> value-parameter originalUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'resolve' @ [747:93] ==> public abstract fun resolve(javaMethodChangeInfo: KotlinChangeInfo): JavaMethodKotlinUsageWithDelegate<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodDeferredKotlinUsage[SimpleFunctionDescriptorImpl]

'javaMethodChangeInfo' @ [747:101] ==> value-parameter javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'?:' @ [749:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtCallElement?, right: KtCallElement): KtCallElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtCallElement

'getParentOfType' @ [749:39] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtCallElement..KtCallElement?)>): KtCallElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtCallElement..org.jetbrains.kotlin.psi.KtCallElement?)

'originalUsageInfo' @ [749:55] ==> value-parameter originalUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'element' @ [749:73] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'java' @ [749:103] ==> public val <T> KClass<KtCallElement>.java: Class<KtCallElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallElement

'originalUsageInfo' @ [750:25] ==> value-parameter originalUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'reference' @ [750:43] ==> public final val UsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'resolve' @ [750:54] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'JavaMethodKotlinCallUsage' @ [751:16] ==> public constructor JavaMethodKotlinCallUsage(callElement: KtCallElement, javaMethodChangeInfo: KotlinChangeInfo, propagationCall: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinCallUsage[ClassConstructorDescriptorImpl]

'callElement' @ [751:42] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[LocalVariableDescriptor]

'javaMethodChangeInfo' @ [751:55] ==> value-parameter javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'refTarget' @ [751:77] ==> val refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[LocalVariableDescriptor]

'refTarget' @ [751:98] ==> val refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[LocalVariableDescriptor]

'isCaller' @ [751:108] ==> public fun PsiElement.isCaller(allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'allUsages' @ [751:117] ==> value-parameter allUsages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.createReplacementUsage[ValueParameterDescriptorImpl]

'baseMethod' @ [762:27] ==> value-parameter baseMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>[ValueParameterDescriptorImpl]

'project' @ [762:38] ==> public final val PsiMethod.project: Project[MyPropertyDescriptor]

'this' @ [763:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[LazyClassReceiverParameterDescriptor]

'nullManager' @ [763:18] ==> private final val nullManager: NullableNotNullManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getInstance' @ [763:55] ==> public open fun getInstance(p0: (Project..Project?)): (NullableNotNullManager..NullableNotNullManager?) defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'project' @ [763:67] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>[LocalVariableDescriptor]

'this' @ [764:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[LazyClassReceiverParameterDescriptor]

'javaPsiFacade' @ [764:18] ==> private final val javaPsiFacade: JavaPsiFacade defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getInstance' @ [764:48] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [764:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>[LocalVariableDescriptor]

'this' @ [765:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[LazyClassReceiverParameterDescriptor]

'javaCodeStyleManager' @ [765:18] ==> private final val javaCodeStyleManager: JavaCodeStyleManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getInstance' @ [765:62] ==> public open fun getInstance(p0: (Project..Project?)): (JavaCodeStyleManager..JavaCodeStyleManager?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'project' @ [765:74] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>[LocalVariableDescriptor]

'this' @ [767:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[LazyClassReceiverParameterDescriptor]

'methodAnnotation' @ [767:18] ==> private final val methodAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getNullabilityAnnotation' @ [767:37] ==> private final fun getNullabilityAnnotation(element: PsiModifierListOwner): PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[SimpleFunctionDescriptorImpl]

'baseMethod' @ [767:62] ==> value-parameter baseMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>[ValueParameterDescriptorImpl]

'this' @ [768:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[LazyClassReceiverParameterDescriptor]

'parameterAnnotations' @ [768:18] ==> private final val parameterAnnotations: Array<PsiAnnotation?> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'baseMethod' @ [768:41] ==> value-parameter baseMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>[ValueParameterDescriptorImpl]

'parameterList' @ [768:52] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [768:66] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'map' @ [768:77] ==> public inline fun <T, R> Array<out (PsiParameter..PsiParameter?)>.map(transform: ((PsiParameter..PsiParameter?)) -> PsiAnnotation?): List<PsiAnnotation?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)
    <R> -> PsiAnnotation?

'getNullabilityAnnotation' @ [768:83] ==> private final fun getNullabilityAnnotation(element: PsiModifierListOwner): PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[SimpleFunctionDescriptorImpl]

'it' @ [768:108] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [768:114] ==> public inline fun <reified T> Collection<PsiAnnotation?>.toTypedArray(): Array<PsiAnnotation?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiAnnotation?

'nullManager' @ [772:34] ==> private final val nullManager: NullableNotNullManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getNullableAnnotation' @ [772:46] ==> @Nullable public open fun getNullableAnnotation(@NotNull p0: PsiModifierListOwner, p1: Boolean): PsiAnnotation? defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'element' @ [772:68] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.getNullabilityAnnotation[ValueParameterDescriptorImpl]

'nullManager' @ [773:37] ==> private final val nullManager: NullableNotNullManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getNotNullAnnotation' @ [773:49] ==> @Nullable public open fun getNotNullAnnotation(@NotNull p0: PsiModifierListOwner, p1: Boolean): PsiAnnotation? defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'element' @ [773:70] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.getNullabilityAnnotation[ValueParameterDescriptorImpl]

'==' @ [774:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullAnnotation' @ [774:18] ==> val nullAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.getNullabilityAnnotation[LocalVariableDescriptor]

'notNullAnnotation' @ [774:46] ==> val notNullAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.getNullabilityAnnotation[LocalVariableDescriptor]

'nullAnnotation' @ [775:20] ==> val nullAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.getNullabilityAnnotation[LocalVariableDescriptor]

'notNullAnnotation' @ [775:38] ==> val notNullAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.getNullabilityAnnotation[LocalVariableDescriptor]

'nullManager' @ [779:38] ==> private final val nullManager: NullableNotNullManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getNullableAnnotation' @ [779:50] ==> @Nullable public open fun getNullableAnnotation(@NotNull p0: PsiModifierListOwner, p1: Boolean): PsiAnnotation? defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'element' @ [779:72] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'nullManager' @ [780:37] ==> private final val nullManager: NullableNotNullManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'getNotNullAnnotation' @ [780:49] ==> @Nullable public open fun getNotNullAnnotation(@NotNull p0: PsiModifierListOwner, p1: Boolean): PsiAnnotation? defined in com.intellij.codeInsight.NullableNotNullManager[JavaMethodDescriptor]

'element' @ [780:70] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'notNullAnnotation' @ [782:17] ==> val notNullAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'nullableAnnotation' @ [782:46] ==> val nullableAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'element' @ [782:76] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'annotation' @ [784:43] ==> value-parameter annotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'qualifiedName' @ [784:55] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'annotationQualifiedName' @ [785:17] ==> val annotationQualifiedName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'javaPsiFacade' @ [786:20] ==> private final val javaPsiFacade: JavaPsiFacade defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'findClass' @ [786:34] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'annotationQualifiedName' @ [786:44] ==> val annotationQualifiedName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'element' @ [786:69] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'resolveScope' @ [786:77] ==> public final val PsiModifierListOwner.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'notNullAnnotation' @ [788:13] ==> val notNullAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'delete' @ [788:32] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiAnnotation[JavaMethodDescriptor]

'nullableAnnotation' @ [789:13] ==> val nullableAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'delete' @ [789:33] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiAnnotation[JavaMethodDescriptor]

'annotationQualifiedName' @ [791:17] ==> val annotationQualifiedName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'element' @ [793:32] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'modifierList' @ [793:40] ==> public final val PsiModifierListOwner.modifierList: PsiModifierList?[MyPropertyDescriptor]

'modifierList' @ [794:17] ==> val modifierList: PsiModifierList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'modifierList' @ [795:17] ==> val modifierList: PsiModifierList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'addAnnotation' @ [795:30] ==> @NotNull public abstract fun addAnnotation(@NotNull @NonNls p0: String): PsiAnnotation defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'annotationQualifiedName' @ [795:44] ==> val annotationQualifiedName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[LocalVariableDescriptor]

'javaCodeStyleManager' @ [796:17] ==> private final val javaCodeStyleManager: JavaCodeStyleManager defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'shortenClassReferences' @ [796:38] ==> @NotNull public abstract fun shortenClassReferences(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'element' @ [796:61] ==> value-parameter element: PsiModifierListOwner defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.addNullabilityAnnotationIfApplicable[ValueParameterDescriptorImpl]

'currentMethod' @ [801:37] ==> value-parameter currentMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.processMethod[ValueParameterDescriptorImpl]

'parameterList' @ [801:51] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [801:65] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'addNullabilityAnnotationIfApplicable' @ [802:13] ==> private final fun addNullabilityAnnotationIfApplicable(element: PsiModifierListOwner, annotation: PsiAnnotation?): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[SimpleFunctionDescriptorImpl]

'currentMethod' @ [802:50] ==> value-parameter currentMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.processMethod[ValueParameterDescriptorImpl]

'methodAnnotation' @ [802:65] ==> private final val methodAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'parameterAnnotations' @ [803:23] ==> private final val parameterAnnotations: Array<PsiAnnotation?> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'indices' @ [803:44] ==> public val <T> Array<out PsiAnnotation?>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiAnnotation?

'addNullabilityAnnotationIfApplicable' @ [804:17] ==> private final fun addNullabilityAnnotationIfApplicable(element: PsiModifierListOwner, annotation: PsiAnnotation?): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[SimpleFunctionDescriptorImpl]

'currentParameters' @ [804:54] ==> val currentParameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.processMethod[LocalVariableDescriptor]

'i' @ [804:72] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.processMethod[LocalVariableDescriptor]

'parameterAnnotations' @ [804:76] ==> private final val parameterAnnotations: Array<PsiAnnotation?> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[PropertyDescriptorImpl]

'i' @ [804:97] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator.processMethod[LocalVariableDescriptor]

'usage' @ [809:57] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.isOverriderOrCaller[ValueParameterDescriptorImpl]

'usage' @ [809:88] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.isOverriderOrCaller[ValueParameterDescriptorImpl]

'usage' @ [812:13] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.getOverriderOrCaller[ValueParameterDescriptorImpl]

'usage' @ [812:49] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.getOverriderOrCaller[ValueParameterDescriptorImpl]

'overridingMethod' @ [812:55] ==> public final val OverriderUsageInfo.overridingMethod: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'usage' @ [813:13] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.getOverriderOrCaller[ValueParameterDescriptorImpl]

'usage' @ [814:27] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.getOverriderOrCaller[ValueParameterDescriptorImpl]

'element' @ [814:33] ==> public final val CallerUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'if (element is PsiMethod) element else null' @ [815:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiMethod?, elseBranch: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiMethod?

'element' @ [815:24] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.getOverriderOrCaller[LocalVariableDescriptor]

'element' @ [815:46] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.getOverriderOrCaller[LocalVariableDescriptor]

'changeInfo' @ [821:22] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'method' @ [821:33] ==> public final val ChangeInfo.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isJavaMethodUsage' @ [822:33] ==> private final fun isJavaMethodUsage(usageInfo: UsageInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'usageInfo' @ [822:51] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'usageInfo' @ [824:13] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'!!' @ [825:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinChangeInfo?): KotlinChangeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinChangeInfo

'changeInfo' @ [825:33] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'delegate' @ [825:72] ==> public final var delegate: KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[PropertyDescriptorImpl]

'ktChangeInfo' @ [826:35] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'getOrCreateJavaChangeInfos' @ [826:48] ==> public final fun getOrCreateJavaChangeInfos(): List<JavaChangeInfo>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'javaChangeInfos' @ [827:13] ==> val javaChangeInfos: List<JavaChangeInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'firstOrNull' @ [827:29] ==> public inline fun <T> Iterable<JavaChangeInfo>.firstOrNull(predicate: (JavaChangeInfo) -> Boolean): JavaChangeInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaChangeInfo

'ktChangeInfo' @ [828:17] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'originalToCurrentMethods' @ [828:30] ==> public final var originalToCurrentMethods: Map<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'usageInfo' @ [828:55] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'javaChangeInfo' @ [828:65] ==> public final val javaChangeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinWrapperForJavaUsageInfos[PropertyDescriptorImpl]

'method' @ [828:80] ==> public final val JavaChangeInfo.method: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'it' @ [828:91] ==> value-parameter it: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [828:94] ==> public final val JavaChangeInfo.method: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'let' @ [829:16] ==> @InlineOnly public inline fun <T, R> JavaChangeInfo.let(block: (JavaChangeInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaChangeInfo
    <R> -> Unit

'NullabilityPropagator' @ [830:45] ==> public constructor NullabilityPropagator(baseMethod: PsiMethod) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[ClassConstructorDescriptorImpl]

'javaChangeInfo' @ [830:67] ==> value-parameter javaChangeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [830:82] ==> public final val JavaChangeInfo.method: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'usageInfo' @ [831:38] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'javaUsageInfos' @ [831:48] ==> public final val javaUsageInfos: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinWrapperForJavaUsageInfos[PropertyDescriptorImpl]

'EP_NAME' @ [832:64] ==> public final val EP_NAME: (ExtensionPointName<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..ExtensionPointName<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor[JavaPropertyDescriptor]

'extensions' @ [832:72] ==> public final val <T : (Any..Any?)> ExtensionPointName<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>.extensions: (Array<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor..com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor?)

'javaUsageInfos' @ [834:31] ==> val javaUsageInfos: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'isOverriderOrCaller' @ [835:25] ==> private final fun isOverriderOrCaller(usage: UsageInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'usage' @ [835:45] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'beforeMethodChange' @ [835:55] ==> value-parameter beforeMethodChange: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'processors' @ [836:39] ==> val processors: (Array<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'processor' @ [837:29] ==> val processor: (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'isOverriderOrCaller' @ [838:29] ==> private final fun isOverriderOrCaller(usage: UsageInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'usage' @ [838:49] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'processor' @ [839:29] ==> val processor: (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'processUsage' @ [839:39] ==> public abstract fun processUsage(p0: (ChangeInfo..ChangeInfo?), p1: (UsageInfo..UsageInfo?), p2: Boolean, p3: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)): Boolean defined in com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor[JavaMethodDescriptor]

'javaChangeInfo' @ [839:52] ==> value-parameter javaChangeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'usage' @ [839:68] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'javaUsageInfos' @ [839:81] ==> val javaUsageInfos: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'processor' @ [841:29] ==> val processor: (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'processUsage' @ [841:39] ==> public abstract fun processUsage(p0: (ChangeInfo..ChangeInfo?), p1: (UsageInfo..UsageInfo?), p2: Boolean, p3: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)): Boolean defined in com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor[JavaMethodDescriptor]

'javaChangeInfo' @ [841:52] ==> value-parameter javaChangeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[ValueParameterDescriptorImpl]

'usage' @ [841:68] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'beforeMethodChange' @ [841:75] ==> value-parameter beforeMethodChange: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'javaUsageInfos' @ [841:95] ==> val javaUsageInfos: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'usage' @ [843:25] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'usage' @ [843:56] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'isOriginalOverrider' @ [843:62] ==> public final val OverriderUsageInfo.isOriginalOverrider: Boolean[MyPropertyDescriptor]

'usage' @ [844:48] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'overridingMethod' @ [844:54] ==> public final val OverriderUsageInfo.overridingMethod: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'overridingMethod' @ [845:29] ==> val overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'overridingMethod' @ [845:57] ==> val overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'nullabilityPropagator' @ [846:29] ==> val nullabilityPropagator: KotlinChangeSignatureUsageProcessor.NullabilityPropagator defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'processMethod' @ [846:51] ==> public final fun processMethod(currentMethod: PsiMethod): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.NullabilityPropagator[SimpleFunctionDescriptorImpl]

'overridingMethod' @ [846:65] ==> val overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage.<anonymous>[LocalVariableDescriptor]

'beforeMethodChange' @ [853:13] ==> value-parameter beforeMethodChange: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'method' @ [854:17] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'initializedOriginalDescriptor' @ [854:41] ==> private final var initializedOriginalDescriptor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[PropertyDescriptorImpl]

'usages' @ [856:37] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'firstIsInstanceOrNull' @ [856:44] ==> public inline fun <reified T : Any> Array<*>.firstIsInstanceOrNull(): KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> OriginalJavaMethodDescriptorWrapper

'descriptorWrapper' @ [857:17] ==> val descriptorWrapper: KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'descriptorWrapper' @ [857:46] ==> val descriptorWrapper: KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'originalJavaMethodDescriptor' @ [857:64] ==> internal final var originalJavaMethodDescriptor: KotlinMethodDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper[PropertyDescriptorImpl]

'method' @ [859:35] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'unwrapped' @ [859:42] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'method' @ [860:45] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'getJavaOrKotlinMemberDescriptor' @ [860:52] ==> @JvmOverloads public fun PsiMember.getJavaOrKotlinMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'createDeepCopy' @ [860:87] ==> public fun DeclarationDescriptor.createDeepCopy(): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'descriptorWrapper' @ [862:13] ==> val descriptorWrapper: KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'originalJavaMethodDescriptor' @ [862:31] ==> internal final var originalJavaMethodDescriptor: KotlinMethodDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper[PropertyDescriptorImpl]

'KotlinChangeSignatureData' @ [862:62] ==> public constructor KotlinChangeSignatureData(baseDescriptor: CallableDescriptor, baseDeclaration: PsiElement, descriptorsForSignatureChange: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[ClassConstructorDescriptorImpl]

'baseDeclarationDescriptor' @ [862:88] ==> val baseDeclarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'baseDeclaration' @ [863:88] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'listOf' @ [864:88] ==> public fun <T> listOf(element: CallableDescriptor): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'baseDeclarationDescriptor' @ [864:95] ==> val baseDeclarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'DummyKotlinChangeInfo' @ [868:35] ==> public constructor DummyKotlinChangeInfo(method: PsiElement, methodDescriptor: KotlinMethodDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.DummyKotlinChangeInfo[ClassConstructorDescriptorImpl]

'changeInfo' @ [868:57] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'method' @ [868:68] ==> public final val ChangeInfo.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'descriptorWrapper' @ [868:76] ==> val descriptorWrapper: KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'originalJavaMethodDescriptor' @ [868:94] ==> internal final var originalJavaMethodDescriptor: KotlinMethodDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper[PropertyDescriptorImpl]

'usages' @ [869:23] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'indices' @ [869:30] ==> public val <T> Array<out UsageInfo>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UsageInfo

'usages' @ [870:36] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'i' @ [870:43] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'!' @ [871:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isJavaMethodUsage' @ [871:22] ==> private final fun isJavaMethodUsage(usageInfo: UsageInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'oldUsageInfo' @ [871:40] ==> val oldUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'createReplacementUsage' @ [873:36] ==> private final fun createReplacementUsage(originalUsageInfo: UsageInfo, javaMethodChangeInfo: KotlinChangeInfo, allUsages: Array<UsageInfo>): UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[SimpleFunctionDescriptorImpl]

'oldUsageInfo' @ [873:59] ==> val oldUsageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'dummyChangeInfo' @ [873:73] ==> val dummyChangeInfo: KotlinChangeSignatureUsageProcessor.DummyKotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'usages' @ [873:90] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'newUsageInfo' @ [874:21] ==> val newUsageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'usages' @ [875:21] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'i' @ [875:28] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'newUsageInfo' @ [875:33] ==> val newUsageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'initializedOriginalDescriptor' @ [879:13] ==> private final var initializedOriginalDescriptor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor[PropertyDescriptorImpl]

'usageInfo' @ [884:23] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'element' @ [884:33] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'usageInfo' @ [886:13] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'usageInfo' @ [888:17] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'javaMethodChangeInfo' @ [888:27] ==> public final var javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[PropertyDescriptorImpl]

'usages' @ [889:41] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'firstIsInstanceOrNull' @ [889:48] ==> public inline fun <reified T : Any> Array<*>.firstIsInstanceOrNull(): KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> OriginalJavaMethodDescriptorWrapper

'?:' @ [890:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinMethodDescriptor?, right: KotlinMethodDescriptor): KotlinMethodDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinMethodDescriptor

'descriptorWrapper' @ [890:41] ==> val descriptorWrapper: KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'originalJavaMethodDescriptor' @ [890:60] ==> internal final var originalJavaMethodDescriptor: KotlinMethodDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.OriginalJavaMethodDescriptorWrapper[PropertyDescriptorImpl]

'changeInfo' @ [892:44] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'toJetChangeInfo' @ [892:55] ==> public fun ChangeInfo.toJetChangeInfo(originalChangeSignatureDescriptor: KotlinMethodDescriptor, resolutionFacade: ResolutionFacade? = ...): KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[SimpleFunctionDescriptorImpl]

'methodDescriptor' @ [892:71] ==> val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'usages' @ [893:30] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'info' @ [894:22] ==> val info: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'javaMethodChangeInfo' @ [894:70] ==> public final var javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[PropertyDescriptorImpl]

'javaMethodChangeInfo' @ [894:93] ==> val javaMethodChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'usageInfo' @ [898:20] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'processUsage' @ [898:30] ==> public final fun processUsage(allUsages: Array<UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.JavaMethodKotlinUsageWithDelegate[SimpleFunctionDescriptorImpl]

'usages' @ [898:43] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'usageInfo' @ [901:13] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'isJavaMethodUsage' @ [901:49] ==> val isJavaMethodUsage: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'getParentOfType' @ [902:38] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtSimpleNameExpression..KtSimpleNameExpression?)>, p2: Boolean): KtSimpleNameExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtSimpleNameExpression..org.jetbrains.kotlin.psi.KtSimpleNameExpression?)

'usageInfo' @ [902:54] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'element' @ [902:64] ==> public final val MoveRenameUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'java' @ [902:103] ==> public val <T> KClass<KtSimpleNameExpression>.java: Class<KtSimpleNameExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'callee' @ [903:23] ==> val callee: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'mainReference' @ [903:31] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'ref' @ [904:17] ==> val ref: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'ref' @ [905:17] ==> val ref: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'handleElementRename' @ [905:21] ==> public open fun handleElementRename(newElementName: String?): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'method' @ [905:42] ==> val method: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'name' @ [905:63] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'Suppress' @ [912:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'?:' @ [913:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'usageInfo' @ [913:17] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'processUsage' @ [913:61] ==> public abstract fun processUsage(changeInfo: KotlinChangeInfo, element: PsiElement, allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[SimpleFunctionDescriptorImpl]

'!!' @ [913:74] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinChangeInfo?): KotlinChangeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinChangeInfo

'changeInfo' @ [913:75] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'delegate' @ [913:114] ==> public final var delegate: KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[PropertyDescriptorImpl]

'element' @ [913:126] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[LocalVariableDescriptor]

'usages' @ [913:135] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processUsage[ValueParameterDescriptorImpl]

'when (changeInfo) {
            is KotlinChangeInfoWrapper -> changeInfo.delegate!!
            is JavaChangeInfo -> {
                val method = changeInfo.method as? KtLightMethod ?: return false
                var baseFunction = method.kotlinOrigin ?: return false
                if (baseFunction is KtClass) {
                    baseFunction = baseFunction.createPrimaryConstructorIfAbsent()
                }
                val resolutionFacade = baseFunction.getResolutionFacade()
                val baseFunctionDescriptor = baseFunction.resolveToDescriptor() as FunctionDescriptor
                val methodDescriptor = KotlinChangeSignatureData(baseFunctionDescriptor, baseFunction, listOf(baseFunctionDescriptor))

                val dummyClass = JavaPsiFacade.getElementFactory(method.project).createClass("Dummy")
                val dummyMethod = createJavaMethod(method, dummyClass)
                dummyMethod.containingFile.moduleInfo = baseFunction.getModuleInfo()
                try {
                    changeInfo.updateMethod(dummyMethod)
                    JavaChangeSignatureUsageProcessor().processPrimaryMethod(changeInfo)
                    changeInfo.toJetChangeInfo(methodDescriptor, resolutionFacade)
                }
                finally {
                    changeInfo.updateMethod(method)
                }
            }
            else -> return false
        }' @ [917:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinChangeInfo, entry1: KotlinChangeInfo, entry2: KotlinChangeInfo): KotlinChangeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinChangeInfo

'changeInfo' @ [917:34] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'changeInfo' @ [918:43] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'delegate' @ [918:54] ==> public final var delegate: KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[PropertyDescriptorImpl]

'changeInfo' @ [920:30] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'method' @ [920:41] ==> public final val JavaChangeInfo.method: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'method' @ [921:36] ==> val method: KtLightMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'kotlinOrigin' @ [921:43] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'baseFunction' @ [922:21] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'baseFunction' @ [923:21] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'baseFunction' @ [923:36] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'createPrimaryConstructorIfAbsent' @ [923:49] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'baseFunction' @ [925:40] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'getResolutionFacade' @ [925:53] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'baseFunction' @ [926:46] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'resolveToDescriptor' @ [926:59] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KotlinChangeSignatureData' @ [927:40] ==> public constructor KotlinChangeSignatureData(baseDescriptor: CallableDescriptor, baseDeclaration: PsiElement, descriptorsForSignatureChange: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[ClassConstructorDescriptorImpl]

'baseFunctionDescriptor' @ [927:66] ==> val baseFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'baseFunction' @ [927:90] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'listOf' @ [927:104] ==> public fun <T> listOf(element: FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'baseFunctionDescriptor' @ [927:111] ==> val baseFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'getElementFactory' @ [929:48] ==> public open fun getElementFactory(@NotNull p0: Project): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'method' @ [929:66] ==> val method: KtLightMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'project' @ [929:73] ==> public final val KtLightMethod.project: Project[MyPropertyDescriptor]

'createClass' @ [929:82] ==> @NotNull public abstract fun createClass(@NonNls @NotNull p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'createJavaMethod' @ [930:35] ==> public fun createJavaMethod(template: PsiMethod, targetClass: PsiClass): PsiMethod defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'method' @ [930:52] ==> val method: KtLightMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'dummyClass' @ [930:60] ==> val dummyClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'dummyMethod' @ [931:17] ==> val dummyMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'containingFile' @ [931:29] ==> public final val PsiMethod.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'moduleInfo' @ [931:44] ==> public var PsiFile.moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'baseFunction' @ [931:57] ==> var baseFunction: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'getModuleInfo' @ [931:70] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [933:21] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'updateMethod' @ [933:32] ==> public abstract fun updateMethod(p0: (PsiMethod..PsiMethod?)): Unit defined in com.intellij.refactoring.changeSignature.JavaChangeInfo[JavaMethodDescriptor]

'dummyMethod' @ [933:45] ==> val dummyMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'JavaChangeSignatureUsageProcessor' @ [934:21] ==> public constructor JavaChangeSignatureUsageProcessor() defined in com.intellij.refactoring.changeSignature.JavaChangeSignatureUsageProcessor[JavaClassConstructorDescriptor]

'processPrimaryMethod' @ [934:57] ==> public open fun processPrimaryMethod(p0: (ChangeInfo..ChangeInfo?)): Boolean defined in com.intellij.refactoring.changeSignature.JavaChangeSignatureUsageProcessor[JavaMethodDescriptor]

'changeInfo' @ [934:78] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'changeInfo' @ [935:21] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'toJetChangeInfo' @ [935:32] ==> public fun ChangeInfo.toJetChangeInfo(originalChangeSignatureDescriptor: KotlinMethodDescriptor, resolutionFacade: ResolutionFacade? = ...): KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[SimpleFunctionDescriptorImpl]

'methodDescriptor' @ [935:48] ==> val methodDescriptor: KotlinChangeSignatureData defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'resolutionFacade' @ [935:66] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'changeInfo' @ [938:21] ==> value-parameter changeInfo: ChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[ValueParameterDescriptorImpl]

'updateMethod' @ [938:32] ==> public abstract fun updateMethod(p0: (PsiMethod..PsiMethod?)): Unit defined in com.intellij.refactoring.changeSignature.JavaChangeInfo[JavaMethodDescriptor]

'method' @ [938:45] ==> val method: KtLightMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'ktChangeInfo' @ [944:33] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'methodDescriptor' @ [944:46] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'primaryCallables' @ [944:63] ==> public abstract val primaryCallables: Collection<KotlinCallableDefinitionUsage<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'primaryFunction' @ [945:13] ==> val primaryFunction: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'processUsage' @ [945:29] ==> public open fun processUsage(changeInfo: KotlinChangeInfo, element: PsiElement, allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'ktChangeInfo' @ [945:42] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'primaryFunction' @ [945:56] ==> val primaryFunction: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'declaration' @ [945:72] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'EMPTY_ARRAY' @ [945:95] ==> public final val EMPTY_ARRAY: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?) defined in com.intellij.usageView.UsageInfo[JavaPropertyDescriptor]

'ktChangeInfo' @ [947:9] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureUsageProcessor.processPrimaryMethod[LocalVariableDescriptor]

'primaryMethodUpdated' @ [947:22] ==> public final fun primaryMethodUpdated(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

