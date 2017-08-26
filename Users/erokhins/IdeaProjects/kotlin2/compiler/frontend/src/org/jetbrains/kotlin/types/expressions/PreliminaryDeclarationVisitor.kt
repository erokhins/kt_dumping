'AssignedVariablesSearcher' @ [33:4] ==> public constructor AssignedVariablesSearcher() defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[ClassConstructorDescriptorImpl]

'lazyTrigger' @ [36:9] ==> private final val lazyTrigger: Unit defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[PropertyDescriptorImpl]

'super' @ [37:16] ==> <this> defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[LazyClassReceiverParameterDescriptor]

'writers' @ [37:22] ==> public open fun writers(variableDescriptor: VariableDescriptor): MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [37:30] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.writers[ValueParameterDescriptorImpl]

'getValue' @ [40:32] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'declaration' @ [41:9] ==> public final val declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[PropertyDescriptorImpl]

'accept' @ [41:21] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'this' @ [41:28] ==> <this> defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [47:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForExpression[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [47:24] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'let' @ [47:64] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Unit

'createForDeclaration' @ [47:70] ==> public final fun createForDeclaration(declaration: KtDeclaration, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion[SimpleFunctionDescriptorImpl]

'it' @ [47:91] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForExpression.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [47:95] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForExpression[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [47:102] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForExpression[ValueParameterDescriptorImpl]

'declaration' @ [51:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.topMostNonClassDeclaration[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [51:29] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'filterIsInstance' @ [51:45] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtDeclaration> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtDeclaration

'findLast' @ [51:79] ==> @InlineOnly public inline fun <T> Sequence<KtDeclaration>.findLast(predicate: (KtDeclaration) -> Boolean): KtDeclaration? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [51:90] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.topMostNonClassDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [51:118] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.topMostNonClassDeclaration[ValueParameterDescriptorImpl]

'topMostNonClassDeclaration' @ [54:32] ==> private final fun topMostNonClassDeclaration(declaration: KtDeclaration): KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [54:59] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[ValueParameterDescriptorImpl]

'trace' @ [55:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[ValueParameterDescriptorImpl]

'get' @ [55:23] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..ReadOnlySlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?), key: (KtDeclaration..KtDeclaration?)): PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor..org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor?)

'PRELIMINARY_VISITOR' @ [55:42] ==> public final val PRELIMINARY_VISITOR: (WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'visitorOwner' @ [55:63] ==> val visitorOwner: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[LocalVariableDescriptor]

'trace' @ [56:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[ValueParameterDescriptorImpl]

'record' @ [56:19] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?), key: (KtDeclaration..KtDeclaration?), value: (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor..org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor?)

'PRELIMINARY_VISITOR' @ [56:41] ==> public final val PRELIMINARY_VISITOR: (WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'visitorOwner' @ [56:62] ==> val visitorOwner: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[LocalVariableDescriptor]

'PreliminaryDeclarationVisitor' @ [57:26] ==> public constructor PreliminaryDeclarationVisitor(declaration: KtDeclaration, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[ClassConstructorDescriptorImpl]

'visitorOwner' @ [57:56] ==> val visitorOwner: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[LocalVariableDescriptor]

'languageVersionSettings' @ [57:70] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.createForDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [62:40] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[ValueParameterDescriptorImpl]

'containingDeclaration' @ [62:59] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'DescriptorToSourceUtils' @ [64:21] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [64:45] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'containingDescriptor' @ [64:69] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'bindingContext' @ [65:38] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[ValueParameterDescriptorImpl]

'get' @ [65:53] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..ReadOnlySlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?), key: (KtDeclaration..KtDeclaration?)): PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor..org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor?)

'PRELIMINARY_VISITOR' @ [65:72] ==> public final val PRELIMINARY_VISITOR: (WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'currentDeclaration' @ [65:93] ==> var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'preliminaryVisitor' @ [66:20] ==> var preliminaryVisitor: PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'currentDeclaration' @ [66:50] ==> var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'currentDeclaration' @ [67:17] ==> var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'currentDeclaration' @ [67:38] ==> var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'getStrictParentOfType' @ [67:57] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'preliminaryVisitor' @ [68:17] ==> var preliminaryVisitor: PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'bindingContext' @ [68:38] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[ValueParameterDescriptorImpl]

'get' @ [68:53] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..ReadOnlySlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?), key: (KtDeclaration..KtDeclaration?)): PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor..org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor?)

'PRELIMINARY_VISITOR' @ [68:72] ==> public final val PRELIMINARY_VISITOR: (WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>..WritableSlice<(KtDeclaration..KtDeclaration?), (PreliminaryDeclarationVisitor..PreliminaryDeclarationVisitor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'currentDeclaration' @ [68:93] ==> var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

'preliminaryVisitor' @ [70:20] ==> var preliminaryVisitor: PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion.getVisitorByVariable[LocalVariableDescriptor]

