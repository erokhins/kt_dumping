'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [40:14] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [40:22] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'supportsFeature' @ [40:46] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'DslMarkersSupport' @ [40:78] ==> enum entry DslMarkersSupport defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'resolvedCall' @ [41:37] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[ValueParameterDescriptorImpl]

'getImplicitReceivers' @ [41:50] ==> public fun ResolvedCall<*>.getImplicitReceivers(): Collection<ReceiverValue> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'callImplicitReceivers' @ [43:38] ==> val callImplicitReceivers: Collection<ReceiverValue> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[LocalVariableDescriptor]

'checkCallImplicitReceiver' @ [44:13] ==> private final fun checkCallImplicitReceiver(callImplicitReceiver: ReceiverValue, resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker[SimpleFunctionDescriptorImpl]

'callImplicitReceiver' @ [44:39] ==> val callImplicitReceiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[LocalVariableDescriptor]

'resolvedCall' @ [44:61] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[ValueParameterDescriptorImpl]

'reportOn' @ [44:75] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [44:85] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [55:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[ValueParameterDescriptorImpl]

'scope' @ [55:25] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'parentsWithSelf' @ [55:31] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedPropertyDescriptor]

'mapNotNull' @ [56:26] ==> public fun <T, R : Any> Sequence<HierarchicalScope>.mapNotNull(transform: (HierarchicalScope) -> ReceiverValue?): Sequence<ReceiverValue> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope
    <R : Any> -> ReceiverValue

'it' @ [56:40] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver.<anonymous>[ValueParameterDescriptorImpl]

'implicitReceiver' @ [56:62] ==> public abstract val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'value' @ [56:80] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'takeWhile' @ [57:26] ==> public fun <T> Sequence<ReceiverValue>.takeWhile(predicate: (ReceiverValue) -> Boolean): Sequence<ReceiverValue> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue

'it' @ [57:38] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver.<anonymous>[ValueParameterDescriptorImpl]

'callImplicitReceiver' @ [57:44] ==> value-parameter callImplicitReceiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[ValueParameterDescriptorImpl]

'toList' @ [57:67] ==> public fun <T> Sequence<ReceiverValue>.toList(): List<ReceiverValue> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue

'receiversUntilOneFromTheCall' @ [59:13] ==> val receiversUntilOneFromTheCall: List<ReceiverValue> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[LocalVariableDescriptor]

'isEmpty' @ [59:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'callImplicitReceiver' @ [61:30] ==> value-parameter callImplicitReceiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[ValueParameterDescriptorImpl]

'type' @ [61:51] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'extractDslMarkerFqNames' @ [61:56] ==> public final fun KotlinType.extractDslMarkerFqNames(): Set<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker[SimpleFunctionDescriptorImpl]

'callDslMarkers' @ [62:13] ==> val callDslMarkers: Set<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[LocalVariableDescriptor]

'isEmpty' @ [62:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'receiversUntilOneFromTheCall' @ [65:17] ==> val receiversUntilOneFromTheCall: List<ReceiverValue> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[LocalVariableDescriptor]

'firstOrNull' @ [65:46] ==> public inline fun <T> Iterable<ReceiverValue>.firstOrNull(predicate: (ReceiverValue) -> Boolean): ReceiverValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue

'receiver' @ [65:72] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [65:81] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'extractDslMarkerFqNames' @ [65:86] ==> public final fun KotlinType.extractDslMarkerFqNames(): Set<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker[SimpleFunctionDescriptorImpl]

'any' @ [65:112] ==> public inline fun <T> Iterable<FqName>.any(predicate: (FqName) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'callDslMarkers' @ [65:116] ==> val callDslMarkers: Set<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[LocalVariableDescriptor]

'contains' @ [65:132] ==> public abstract fun contains(element: FqName): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'closestAnotherReceiverWithSameDslMarker' @ [67:13] ==> val closestAnotherReceiverWithSameDslMarker: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[LocalVariableDescriptor]

'context' @ [69:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[ValueParameterDescriptorImpl]

'trace' @ [69:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [69:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DSL_SCOPE_VIOLATION' @ [69:41] ==> public final val DSL_SCOPE_VIOLATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [69:61] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: CallableDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [69:64] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[ValueParameterDescriptorImpl]

'resolvedCall' @ [69:74] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.checkCallImplicitReceiver[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [69:87] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'mutableSetOf' @ [74:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'result' @ [76:9] ==> val result: MutableSet<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.extractDslMarkerFqNames[LocalVariableDescriptor]

'addAll' @ [76:16] ==> public abstract fun addAll(elements: Collection<FqName>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'annotations' @ [76:23] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'extractDslMarkerFqNames' @ [76:35] ==> private fun Annotations.extractDslMarkerFqNames(): List<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers in file DslScopeViolationCallChecker.kt[SimpleFunctionDescriptorImpl]

'getAbbreviation' @ [78:9] ==> public fun KotlinType.getAbbreviation(): SimpleType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'constructor' @ [78:28] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [78:41] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'run' @ [78:64] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.run(block: (ClassifierDescriptor).() -> Boolean?): Boolean? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Boolean?

'result' @ [79:13] ==> val result: MutableSet<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.extractDslMarkerFqNames[LocalVariableDescriptor]

'addAll' @ [79:20] ==> public abstract fun addAll(elements: Collection<FqName>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'annotations' @ [79:27] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassifierDescriptor[DeserializedPropertyDescriptor]

'extractDslMarkerFqNames' @ [79:39] ==> private fun Annotations.extractDslMarkerFqNames(): List<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers in file DslScopeViolationCallChecker.kt[SimpleFunctionDescriptorImpl]

'safeAs' @ [80:13] ==> public inline fun <reified T : Any> Any?.safeAs(): TypeAliasDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TypeAliasDescriptor

'run' @ [80:44] ==> @InlineOnly public inline fun <T, R> TypeAliasDescriptor.run(block: TypeAliasDescriptor.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor
    <R> -> Boolean

'result' @ [81:17] ==> val result: MutableSet<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.extractDslMarkerFqNames[LocalVariableDescriptor]

'addAll' @ [81:24] ==> public abstract fun addAll(elements: Collection<FqName>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'underlyingType' @ [81:31] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'extractDslMarkerFqNames' @ [81:46] ==> public final fun KotlinType.extractDslMarkerFqNames(): Set<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker[SimpleFunctionDescriptorImpl]

'constructor' @ [85:9] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [85:21] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'getAllSuperClassifiers' @ [85:44] ==> public fun ClassifierDescriptor.getAllSuperClassifiers(): Sequence<ClassifierDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'asIterable' @ [85:70] ==> public fun <T> Sequence<ClassifierDescriptor>.asIterable(): Iterable<ClassifierDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'flatMapTo' @ [86:19] ==> public inline fun <T, R, C : MutableCollection<in FqName>> Iterable<ClassifierDescriptor>.flatMapTo(destination: MutableSet<FqName>, transform: (ClassifierDescriptor) -> Iterable<FqName>): MutableSet<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> FqName
    <C : MutableCollection<in R>> -> MutableSet<FqName>

'result' @ [86:29] ==> val result: MutableSet<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.extractDslMarkerFqNames[LocalVariableDescriptor]

'it' @ [86:39] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.extractDslMarkerFqNames.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [86:42] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassifierDescriptor[DeserializedPropertyDescriptor]

'extractDslMarkerFqNames' @ [86:54] ==> private fun Annotations.extractDslMarkerFqNames(): List<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers in file DslScopeViolationCallChecker.kt[SimpleFunctionDescriptorImpl]

'result' @ [88:16] ==> val result: MutableSet<FqName> defined in org.jetbrains.kotlin.resolve.calls.checkers.DslScopeViolationCallChecker.extractDslMarkerFqNames[LocalVariableDescriptor]

'filter' @ [94:9] ==> public inline fun <T> Iterable<AnnotationDescriptor>.filter(predicate: (AnnotationDescriptor) -> Boolean): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'isDslMarker' @ [94:38] ==> private fun AnnotationDescriptor.isDslMarker(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers in file DslScopeViolationCallChecker.kt[SimpleFunctionDescriptorImpl]

'map' @ [94:51] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> FqName

'it' @ [94:57] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.extractDslMarkerFqNames.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [94:60] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'annotationClass' @ [97:27] ==> public val AnnotationDescriptor.annotationClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'classDescriptor' @ [98:12] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.isDslMarker[LocalVariableDescriptor]

'annotations' @ [98:28] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedPropertyDescriptor]

'hasAnnotation' @ [98:40] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'DSL_MARKER_FQ_NAME' @ [98:54] ==> private val DSL_MARKER_FQ_NAME: FqName defined in org.jetbrains.kotlin.resolve.calls.checkers in file DslScopeViolationCallChecker.kt[PropertyDescriptorImpl]

'FqName' @ [101:34] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

