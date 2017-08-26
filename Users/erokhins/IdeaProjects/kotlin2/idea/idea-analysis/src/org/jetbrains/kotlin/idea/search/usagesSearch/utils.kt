'this' @ [48:13] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.descriptor[ReceiverParameterDescriptorImpl]

'analyze' @ [48:18] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'get' @ [48:28] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [48:47] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [48:74] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.descriptor[ReceiverParameterDescriptorImpl]

'this' @ [52:23] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.constructor[ReceiverParameterDescriptorImpl]

'analyze' @ [52:28] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (this) {
            is KtClassOrObject -> context[BindingContext.CLASS, this]?.unsubstitutedPrimaryConstructor
            is KtFunction -> context[BindingContext.CONSTRUCTOR, this]
            else -> null
        }' @ [53:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConstructorDescriptor?, entry1: ConstructorDescriptor?, entry2: ConstructorDescriptor?): ConstructorDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ConstructorDescriptor?

'this' @ [53:22] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.constructor[ReceiverParameterDescriptorImpl]

'context' @ [54:35] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.<get-constructor>[LocalVariableDescriptor]

'CLASS' @ [54:58] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [54:65] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.constructor[ReceiverParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [54:72] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'context' @ [55:30] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.<get-constructor>[LocalVariableDescriptor]

'CONSTRUCTOR' @ [55:53] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [55:66] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.constructor[ReceiverParameterDescriptorImpl]

'this' @ [61:13] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.propertyDescriptor[ReceiverParameterDescriptorImpl]

'analyze' @ [61:18] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'get' @ [61:28] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?), p1: (PsiElement..PsiElement?)): PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [61:47] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [61:78] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.propertyDescriptor[ReceiverParameterDescriptorImpl]

'it' @ [65:79] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.checkUsageVsOriginalDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [65:82] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'unwrappedTargets' @ [68:12] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'filterIsInstance' @ [69:14] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtDeclaration

'any' @ [70:14] ==> public inline fun <T> Iterable<KtDeclaration>.any(predicate: (KtDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'invoke' @ [71:39] ==> public abstract operator fun invoke(p1: KtDeclaration): DeclarationDescriptor? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [71:63] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.checkUsageVsOriginalDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'usageDescriptor' @ [72:17] ==> val usageDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.checkUsageVsOriginalDescriptor.<anonymous>[LocalVariableDescriptor]

'invoke' @ [72:44] ==> public abstract operator fun invoke(usageDescriptor: @ParameterName DeclarationDescriptor, targetDescriptor: @ParameterName DeclarationDescriptor): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'usageDescriptor' @ [72:52] ==> val usageDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.checkUsageVsOriginalDescriptor.<anonymous>[LocalVariableDescriptor]

'targetDescriptor' @ [72:69] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.checkUsageVsOriginalDescriptor[ValueParameterDescriptorImpl]

'element' @ [77:9] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [77:19] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'with' @ [79:82] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiElement, block: PsiElement.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Boolean

'element' @ [79:88] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [81:20] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiConstructorCall? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiConstructorCall

'call' @ [82:16] ==> val call: PsiConstructorCall? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkJavaUsage[LocalVariableDescriptor]

'parent' @ [82:24] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'call' @ [82:34] ==> val call: PsiConstructorCall? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkJavaUsage[LocalVariableDescriptor]

'resolveConstructor' @ [82:40] ==> @Nullable public abstract fun resolveConstructor(): PsiMethod? defined in com.intellij.psi.PsiConstructorCall[JavaMethodDescriptor]

'containingClass' @ [82:62] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'navigationElement' @ [82:79] ==> public final val PsiClass.navigationElement: PsiElement[MyPropertyDescriptor]

'ktClassOrObject' @ [82:100] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage[ValueParameterDescriptorImpl]

'this' @ [86:13] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>[ReceiverParameterDescriptorImpl]

'getConstructorCallDescriptor' @ [88:26] ==> private fun KtElement.getConstructorCallDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [89:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkKotlinUsage[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [91:27] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [91:51] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [91:75] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkKotlinUsage[LocalVariableDescriptor]

'containingDeclaration' @ [91:86] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'declaration' @ [92:16] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkKotlinUsage[LocalVariableDescriptor]

'ktClassOrObject' @ [92:31] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage[ValueParameterDescriptorImpl]

'declaration' @ [92:51] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkKotlinUsage[LocalVariableDescriptor]

'declaration' @ [92:86] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>.checkKotlinUsage[LocalVariableDescriptor]

'getContainingClassOrObject' @ [92:98] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'ktClassOrObject' @ [92:130] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage[ValueParameterDescriptorImpl]

'checkJavaUsage' @ [95:5] ==> local final fun checkJavaUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>[SimpleFunctionDescriptorImpl]

'checkKotlinUsage' @ [95:25] ==> local final fun checkKotlinUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.isConstructorUsage.<anonymous>[SimpleFunctionDescriptorImpl]

'this' @ [99:26] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[ReceiverParameterDescriptorImpl]

'analyze' @ [99:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getNonStrictParentOfType' @ [100:39] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtConstructorCalleeExpression

'constructorCalleeExpression' @ [101:9] ==> val constructorCalleeExpression: KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'bindingContext' @ [102:16] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'get' @ [102:31] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [102:50] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'constructorCalleeExpression' @ [102:68] ==> val constructorCalleeExpression: KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'constructorReferenceExpression' @ [102:96] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [105:26] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'callExpression' @ [106:9] ==> val callExpression: KtCallElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'callExpression' @ [107:22] ==> val callExpression: KtCallElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'calleeExpression' @ [107:37] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callee' @ [108:13] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'bindingContext' @ [109:20] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'get' @ [109:35] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [109:54] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callee' @ [109:72] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getConstructorCallDescriptor[LocalVariableDescriptor]

'buildProcessDelegationCallConstructorUsagesTask' @ [117:16] ==> public fun PsiElement.buildProcessDelegationCallConstructorUsagesTask(scope: SearchScope, process: (KtCallElement) -> Boolean): () -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [117:64] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.processDelegationCallConstructorUsages[ValueParameterDescriptorImpl]

'process' @ [117:71] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.processDelegationCallConstructorUsages[ValueParameterDescriptorImpl]

'invoke' @ [118:12] ==> public abstract operator fun invoke(): Boolean defined in kotlin.Function0[FunctionInvokeDescriptor]

'getApplication' @ [123:24] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'assertReadAccessAllowed' @ [123:41] ==> public abstract fun assertReadAccessAllowed(): Unit defined in com.intellij.openapi.application.Application[JavaMethodDescriptor]

'buildProcessDelegationCallKotlinConstructorUsagesTask' @ [124:17] ==> private fun PsiElement.buildProcessDelegationCallKotlinConstructorUsagesTask(scope: SearchScope, process: (KtCallElement) -> Boolean): () -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [124:71] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallConstructorUsagesTask[ValueParameterDescriptorImpl]

'process' @ [124:78] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallConstructorUsagesTask[ValueParameterDescriptorImpl]

'buildProcessDelegationCallJavaConstructorUsagesTask' @ [125:17] ==> private fun PsiElement.buildProcessDelegationCallJavaConstructorUsagesTask(scope: SearchScope, process: (KtCallElement) -> Boolean): () -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [125:69] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallConstructorUsagesTask[ValueParameterDescriptorImpl]

'process' @ [125:76] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallConstructorUsagesTask[ValueParameterDescriptorImpl]

'invoke' @ [126:14] ==> public abstract operator fun invoke(): Boolean defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [126:25] ==> public abstract operator fun invoke(): Boolean defined in kotlin.Function0[FunctionInvokeDescriptor]

'unwrapped' @ [130:19] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'element' @ [131:9] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'element' @ [131:28] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'scope' @ [131:40] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[ValueParameterDescriptorImpl]

'when (element) {
        is KtConstructor<*> -> element.getContainingClassOrObject()
        is KtClass -> element
        else -> return { true }
    }' @ [133:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtClassOrObject, entry1: KtClassOrObject, entry2: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtClassOrObject

'element' @ [133:23] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'element' @ [134:32] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'getContainingClassOrObject' @ [134:40] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'element' @ [135:23] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'klass' @ [139:9] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'element' @ [139:30] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'element' @ [140:22] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'constructor' @ [140:30] ==> public val KtDeclaration.constructor: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'!' @ [142:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processClassDelegationCallsToSpecifiedConstructor' @ [142:10] ==> private fun processClassDelegationCallsToSpecifiedConstructor(klass: KtClass, constructor: DeclarationDescriptor, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [142:60] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'descriptor' @ [142:67] ==> val descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'process' @ [142:79] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[ValueParameterDescriptorImpl]

'processInheritorsDelegatingCallToSpecifiedConstructor' @ [145:14] ==> private fun processInheritorsDelegatingCallToSpecifiedConstructor(klass: PsiElement, scope: SearchScope, descriptor: ConstructorDescriptor, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [145:68] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'scope' @ [145:75] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[ValueParameterDescriptorImpl]

'descriptor' @ [145:82] ==> val descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[LocalVariableDescriptor]

'process' @ [145:94] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallKotlinConstructorUsagesTask[ValueParameterDescriptorImpl]

'this' @ [149:9] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[ReceiverParameterDescriptorImpl]

'this' @ [151:9] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[ReceiverParameterDescriptorImpl]

'this' @ [151:34] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[ReceiverParameterDescriptorImpl]

'kotlinOrigin' @ [151:39] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'!' @ [152:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [152:11] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[ReceiverParameterDescriptorImpl]

'isConstructor' @ [152:32] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'containingClass' @ [153:17] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'getJavaMethodDescriptor' @ [154:22] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve in file JavaResolveExtension.kt[SimpleFunctionDescriptorImpl]

'processInheritorsDelegatingCallToSpecifiedConstructor' @ [155:14] ==> private fun processInheritorsDelegatingCallToSpecifiedConstructor(klass: PsiElement, scope: SearchScope, descriptor: ConstructorDescriptor, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [155:68] ==> val klass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[LocalVariableDescriptor]

'scope' @ [155:75] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[ValueParameterDescriptorImpl]

'descriptor' @ [155:82] ==> val descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[LocalVariableDescriptor]

'process' @ [155:94] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.buildProcessDelegationCallJavaConstructorUsagesTask[ValueParameterDescriptorImpl]

'HierarchySearchRequest' @ [165:12] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: PsiElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiElement

'klass' @ [165:35] ==> value-parameter klass: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor[ValueParameterDescriptorImpl]

'scope' @ [165:42] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor[ValueParameterDescriptorImpl]

'searchInheritors' @ [165:56] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file classInheritorsSearch.kt[SimpleFunctionDescriptorImpl]

'all' @ [165:75] ==> public inline fun <T> Iterable<(PsiClass..PsiClass?)>.all(predicate: ((PsiClass..PsiClass?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'runReadAction' @ [166:9] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'it' @ [167:29] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [167:32] ==> @InlineOnly @SinceKotlin public inline fun <T> (PsiClass..PsiClass?).takeIf(predicate: ((PsiClass..PsiClass?)) -> Boolean): PsiClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [167:41] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [167:44] ==> public final val PsiClass.isValid: Boolean[MyPropertyDescriptor]

'unwrapped' @ [167:55] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'if (unwrapped is KtClass)
                processClassDelegationCallsToSpecifiedConstructor(unwrapped, descriptor, process)
            else
                true' @ [168:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'unwrapped' @ [168:17] ==> val unwrapped: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'processClassDelegationCallsToSpecifiedConstructor' @ [169:17] ==> private fun processClassDelegationCallsToSpecifiedConstructor(klass: KtClass, constructor: DeclarationDescriptor, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'unwrapped' @ [169:67] ==> val unwrapped: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [169:78] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor[ValueParameterDescriptorImpl]

'process' @ [169:90] ==> value-parameter process: (KtCallElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.processInheritorsDelegatingCallToSpecifiedConstructor[ValueParameterDescriptorImpl]

'klass' @ [179:34] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [179:40] ==> public final val KtClass.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'secondaryConstructor' @ [180:40] ==> val secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'getDelegationCall' @ [180:61] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'getConstructorCallDescriptor' @ [180:81] ==> private fun KtElement.getConstructorCallDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [181:13] ==> value-parameter constructor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[ValueParameterDescriptorImpl]

'delegationCallDescriptor' @ [181:28] ==> val delegationCallDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'!' @ [182:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [182:18] ==> public abstract operator fun invoke(p1: KtCallElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'secondaryConstructor' @ [182:26] ==> val secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'getDelegationCall' @ [182:47] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'!' @ [185:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [185:10] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[ValueParameterDescriptorImpl]

'isEnum' @ [185:16] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'klass' @ [186:25] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[ValueParameterDescriptorImpl]

'declarations' @ [186:31] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'declaration' @ [187:13] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'declaration' @ [188:34] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'superTypeListEntries' @ [188:46] ==> public final val KtEnumEntry.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [188:67] ==> public fun <T> List<KtSuperTypeListEntry>.firstOrNull(): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'delegationCall' @ [189:17] ==> val delegationCall: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'constructor' @ [189:59] ==> value-parameter constructor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[ValueParameterDescriptorImpl]

'delegationCall' @ [189:74] ==> val delegationCall: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'calleeExpression' @ [189:89] ==> public final val KtSuperTypeCallEntry.calleeExpression: KtConstructorCalleeExpression[MyPropertyDescriptor]

'getConstructorCallDescriptor' @ [189:106] ==> private fun KtElement.getConstructorCallDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'!' @ [190:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [190:22] ==> public abstract operator fun invoke(p1: KtCallElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'delegationCall' @ [190:30] ==> val delegationCall: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.search.usagesSearch.processClassDelegationCallsToSpecifiedConstructor[LocalVariableDescriptor]

'declaration' @ [200:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage[ValueParameterDescriptorImpl]

'descriptor' @ [200:34] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'checkUsageVsOriginalDescriptor' @ [201:12] ==> public fun PsiReference.checkUsageVsOriginalDescriptor(targetDescriptor: DeclarationDescriptor, declarationToDescriptor: (KtDeclaration) -> DeclarationDescriptor? = ..., checker: (usageDescriptor: DeclarationDescriptor, targetDescriptor: DeclarationDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [201:43] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage[LocalVariableDescriptor]

'when {
            usageDescriptor == targetDescriptor -> false
            usageDescriptor !is FunctionDescriptor -> false
            else -> {
                val receiverDescriptor =
                        usageDescriptor.extensionReceiverParameter?.type?.constructor?.declarationDescriptor
                val containingDescriptor = targetDescriptor.containingDeclaration

                containingDescriptor == receiverDescriptor
                || (containingDescriptor is ClassDescriptor
                    && receiverDescriptor is ClassDescriptor
                    && DescriptorUtils.isSubclass(containingDescriptor, receiverDescriptor))
            }
        }' @ [202:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'usageDescriptor' @ [203:13] ==> value-parameter usageDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[ValueParameterDescriptorImpl]

'targetDescriptor' @ [203:32] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[ValueParameterDescriptorImpl]

'usageDescriptor' @ [204:13] ==> value-parameter usageDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[ValueParameterDescriptorImpl]

'usageDescriptor' @ [207:25] ==> value-parameter usageDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [207:41] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [207:69] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [207:75] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [207:88] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'targetDescriptor' @ [208:44] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [208:61] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'containingDescriptor' @ [210:17] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[LocalVariableDescriptor]

'receiverDescriptor' @ [210:41] ==> val receiverDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[LocalVariableDescriptor]

'containingDescriptor' @ [211:21] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[LocalVariableDescriptor]

'receiverDescriptor' @ [212:24] ==> val receiverDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[LocalVariableDescriptor]

'isSubclass' @ [213:40] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDescriptor' @ [213:51] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[LocalVariableDescriptor]

'receiverDescriptor' @ [213:73] ==> val receiverDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isExtensionOfDeclarationClassUsage.<anonymous>[LocalVariableDescriptor]

'declaration' @ [222:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isUsageInContainingDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [222:34] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'checkUsageVsOriginalDescriptor' @ [223:12] ==> public fun PsiReference.checkUsageVsOriginalDescriptor(targetDescriptor: DeclarationDescriptor, declarationToDescriptor: (KtDeclaration) -> DeclarationDescriptor? = ..., checker: (usageDescriptor: DeclarationDescriptor, targetDescriptor: DeclarationDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [223:43] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isUsageInContainingDeclaration[LocalVariableDescriptor]

'usageDescriptor' @ [224:9] ==> value-parameter usageDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isUsageInContainingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'targetDescriptor' @ [224:28] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isUsageInContainingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'usageDescriptor' @ [225:12] ==> value-parameter usageDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isUsageInContainingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [225:28] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'targetDescriptor' @ [225:53] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isUsageInContainingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [225:70] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (declaration is KtParameter) {
            // we don't treat parameters in overriding method as "override" here (overriding parameters usages are searched optionally and via searching of overriding methods first)
            if (declaration.hasValOrVar()) declaration.propertyDescriptor else null
        }
        else {
            declaration.descriptor as? CallableDescriptor
        }' @ [231:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor?, elseBranch: CallableDescriptor?): CallableDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor?

'declaration' @ [231:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'if (declaration.hasValOrVar()) declaration.propertyDescriptor else null' @ [233:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyDescriptor?, elseBranch: PropertyDescriptor?): PropertyDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyDescriptor?

'declaration' @ [233:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [233:29] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'declaration' @ [233:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [233:56] ==> public val KtParameter.propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'declaration' @ [236:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [236:25] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'invoke' @ [240:28] ==> public abstract operator fun invoke(p1: KtDeclaration): CallableDescriptor? defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [240:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage[ValueParameterDescriptorImpl]

'unwrappedTargets' @ [242:12] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'any' @ [242:29] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (it) {
            is KtDeclaration -> {
                val usageDescriptor = toDescriptor(it)
                usageDescriptor != null && OverridingUtil.overrides(usageDescriptor, targetDescriptor)
            }
            is PsiMethod -> {
                declaration.toLightMethods().any { superMethod -> MethodSignatureUtil.isSuperMethod(superMethod, it) }
            }
            else -> false
        }' @ [243:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [243:15] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [245:39] ==> public abstract operator fun invoke(p1: KtDeclaration): CallableDescriptor? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [245:52] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'usageDescriptor' @ [246:17] ==> val usageDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[LocalVariableDescriptor]

'overrides' @ [246:59] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> overrides(@NotNull p0: CallableDescriptor, @NotNull p1: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'usageDescriptor' @ [246:69] ==> val usageDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[LocalVariableDescriptor]

'targetDescriptor' @ [246:86] ==> val targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage[LocalVariableDescriptor]

'declaration' @ [249:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage[ValueParameterDescriptorImpl]

'toLightMethods' @ [249:29] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'any' @ [249:46] ==> public inline fun <T> Iterable<PsiMethod>.any(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'isSuperMethod' @ [249:87] ==> public open fun isSuperMethod(@NotNull p0: PsiMethod, @NotNull p1: PsiMethod): Boolean defined in com.intellij.psi.util.MethodSignatureUtil[JavaMethodDescriptor]

'superMethod' @ [249:101] ==> value-parameter superMethod: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [249:114] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.isCallableOverrideUsage.<anonymous>[ValueParameterDescriptorImpl]

'toLightMethods' @ [257:24] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'if (lightMethods.isNotEmpty()) {
        lightMethods.flatMapTo(LinkedHashSet()) { MethodReferencesSearch.search(it) }
    }
    else {
        ReferencesSearch.search(this).findAll()
    }' @ [258:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<PsiReference>, elseBranch: Collection<PsiReference>): Collection<PsiReference>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<PsiReference>

'lightMethods' @ [258:16] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.usagesSearch.searchReferencesOrMethodReferences[LocalVariableDescriptor]

'isNotEmpty' @ [258:29] ==> @InlineOnly public inline fun <T> Collection<PsiMethod>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'lightMethods' @ [259:9] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.usagesSearch.searchReferencesOrMethodReferences[LocalVariableDescriptor]

'flatMapTo' @ [259:22] ==> public inline fun <T, R, C : MutableCollection<in (PsiReference..PsiReference?)>> Iterable<PsiMethod>.flatMapTo(destination: LinkedHashSet<(PsiReference..PsiReference?)> /* = LinkedHashSet<(PsiReference..PsiReference?)> */, transform: (PsiMethod) -> Iterable<(PsiReference..PsiReference?)>): LinkedHashSet<(PsiReference..PsiReference?)> /* = LinkedHashSet<(PsiReference..PsiReference?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <C : MutableCollection<in R>> -> LinkedHashSet<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>

'LinkedHashSet' @ [259:32] ==> public final fun <E> <init>(): LinkedHashSet<(PsiReference..PsiReference?)> /* = LinkedHashSet<(PsiReference..PsiReference?)> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'search' @ [259:74] ==> public open fun search(p0: (PsiMethod..PsiMethod?)): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'it' @ [259:81] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.searchReferencesOrMethodReferences.<anonymous>[ValueParameterDescriptorImpl]

'search' @ [262:26] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'this' @ [262:33] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.searchReferencesOrMethodReferences[ReceiverParameterDescriptorImpl]

'findAll' @ [262:39] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

