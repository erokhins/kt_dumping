'reportSmartCasts' @ [35:9] ==> private final fun reportSmartCasts(candidate: ResolvedCallAtom, resultingDescriptor: CallableDescriptor, kotlinDiagnosticsHolder: KotlinDiagnosticsHolder): Unit defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter[SimpleFunctionDescriptorImpl]

'candidate' @ [35:26] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportAdditionalDiagnostics[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [35:37] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportAdditionalDiagnostics[ValueParameterDescriptorImpl]

'kotlinDiagnosticsHolder' @ [35:58] ==> value-parameter kotlinDiagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportAdditionalDiagnostics[ValueParameterDescriptorImpl]

'argument' @ [43:13] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.createSmartCastDiagnostic[ValueParameterDescriptorImpl]

'!' @ [44:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [44:32] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [44:40] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'argument' @ [44:52] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.createSmartCastDiagnostic[ValueParameterDescriptorImpl]

'receiver' @ [44:61] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[PropertyDescriptorImpl]

'receiverValue' @ [44:70] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [44:84] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'expectedResultType' @ [44:90] ==> value-parameter expectedResultType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.createSmartCastDiagnostic[ValueParameterDescriptorImpl]

'SmartCastDiagnostic' @ [45:20] ==> public constructor SmartCastDiagnostic(argument: ExpressionKotlinCallArgument, smartCastType: UnwrappedType, kotlinCall: KotlinCall?) defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[ClassConstructorDescriptorImpl]

'argument' @ [45:40] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.createSmartCastDiagnostic[ValueParameterDescriptorImpl]

'expectedResultType' @ [45:50] ==> value-parameter expectedResultType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.createSmartCastDiagnostic[ValueParameterDescriptorImpl]

'unwrap' @ [45:69] ==> public final fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'candidate' @ [45:79] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.createSmartCastDiagnostic[ValueParameterDescriptorImpl]

'atom' @ [45:89] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'receiver' @ [55:13] ==> value-parameter receiver: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'parameter' @ [55:33] ==> value-parameter parameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'parameter' @ [56:28] ==> value-parameter parameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'type' @ [56:38] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [56:43] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'let' @ [56:52] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'if (receiver.isSafeCall) it.makeNullableAsSpecified(true) else it' @ [56:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType, elseBranch: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType

'receiver' @ [56:62] ==> value-parameter receiver: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'isSafeCall' @ [56:71] ==> public abstract val isSafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[PropertyDescriptorImpl]

'it' @ [56:83] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver.<anonymous>[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [56:86] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'it' @ [56:121] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver.<anonymous>[ValueParameterDescriptorImpl]

'createSmartCastDiagnostic' @ [58:35] ==> private final fun createSmartCastDiagnostic(candidate: ResolvedCallAtom, argument: KotlinCallArgument, expectedResultType: UnwrappedType): SmartCastDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter[SimpleFunctionDescriptorImpl]

'candidate' @ [58:61] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'receiver' @ [58:72] ==> value-parameter receiver: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'expectedType' @ [58:82] ==> val expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[LocalVariableDescriptor]

'smartCastDiagnostic' @ [61:16] ==> val smartCastDiagnostic: SmartCastDiagnostic defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[LocalVariableDescriptor]

'takeIf' @ [61:36] ==> @InlineOnly @SinceKotlin public inline fun <T> SmartCastDiagnostic.takeIf(predicate: (SmartCastDiagnostic) -> Boolean): SmartCastDiagnostic? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastDiagnostic

'candidate' @ [62:13] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'diagnostics' @ [62:23] ==> public final lateinit var diagnostics: Collection<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'filterIsInstance' @ [62:35] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<UnsafeCallError> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> UnsafeCallError

'none' @ [62:71] ==> public inline fun <T> Iterable<UnsafeCallError>.none(predicate: (UnsafeCallError) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnsafeCallError

'it' @ [63:17] ==> value-parameter it: UnsafeCallError defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [63:20] ==> public final val receiver: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.UnsafeCallError[PropertyDescriptorImpl]

'receiver' @ [63:32] ==> value-parameter receiver: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'candidate' @ [66:13] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'diagnostics' @ [66:23] ==> public final lateinit var diagnostics: Collection<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'filterIsInstance' @ [66:35] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<UnstableSmartCast> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> UnstableSmartCast

'none' @ [66:73] ==> public inline fun <T> Iterable<UnstableSmartCast>.none(predicate: (UnstableSmartCast) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnstableSmartCast

'it' @ [67:17] ==> value-parameter it: UnstableSmartCast defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [67:20] ==> public final val argument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[PropertyDescriptorImpl]

'receiver' @ [67:32] ==> value-parameter receiver: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCastOnReceiver[ValueParameterDescriptorImpl]

'kotlinDiagnosticsHolder' @ [77:9] ==> value-parameter kotlinDiagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'addDiagnosticIfNotNull' @ [77:33] ==> public fun KotlinDiagnosticsHolder.addDiagnosticIfNotNull(diagnostic: KotlinCallDiagnostic?): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file ResolutionCandidate.kt[SimpleFunctionDescriptorImpl]

'reportSmartCastOnReceiver' @ [77:56] ==> private final fun reportSmartCastOnReceiver(candidate: ResolvedCallAtom, receiver: SimpleKotlinCallArgument?, parameter: ReceiverParameterDescriptor?): SmartCastDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter[SimpleFunctionDescriptorImpl]

'candidate' @ [77:82] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'candidate' @ [77:93] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'extensionReceiverArgument' @ [77:103] ==> public abstract val extensionReceiverArgument: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'resultingDescriptor' @ [77:130] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [77:150] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'kotlinDiagnosticsHolder' @ [78:9] ==> value-parameter kotlinDiagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'addDiagnosticIfNotNull' @ [78:33] ==> public fun KotlinDiagnosticsHolder.addDiagnosticIfNotNull(diagnostic: KotlinCallDiagnostic?): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file ResolutionCandidate.kt[SimpleFunctionDescriptorImpl]

'reportSmartCastOnReceiver' @ [78:56] ==> private final fun reportSmartCastOnReceiver(candidate: ResolvedCallAtom, receiver: SimpleKotlinCallArgument?, parameter: ReceiverParameterDescriptor?): SmartCastDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter[SimpleFunctionDescriptorImpl]

'candidate' @ [78:82] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'candidate' @ [78:93] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'dispatchReceiverArgument' @ [78:103] ==> public abstract val dispatchReceiverArgument: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'resultingDescriptor' @ [78:129] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [78:149] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'resultingDescriptor' @ [80:27] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'valueParameters' @ [80:47] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'candidate' @ [81:30] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'argumentMappingByOriginal' @ [81:40] ==> public abstract val argumentMappingByOriginal: Map<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'parameter' @ [81:66] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

'original' @ [81:76] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'arguments' @ [81:87] ==> public abstract val arguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[PropertyDescriptorImpl]

'createSmartCastDiagnostic' @ [82:43] ==> private final fun createSmartCastDiagnostic(candidate: ResolvedCallAtom, argument: KotlinCallArgument, expectedResultType: UnwrappedType): SmartCastDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter[SimpleFunctionDescriptorImpl]

'candidate' @ [82:69] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'argument' @ [82:80] ==> val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

'argument' @ [82:90] ==> val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

'getExpectedType' @ [82:99] ==> internal fun KotlinCallArgument.getExpectedType(parameter: ParameterDescriptor): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components[SimpleFunctionDescriptorImpl]

'parameter' @ [82:115] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

'candidate' @ [84:53] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'diagnostics' @ [84:63] ==> public final lateinit var diagnostics: Collection<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'filterIsInstance' @ [84:75] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<UnstableSmartCast> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> UnstableSmartCast

'any' @ [84:113] ==> public inline fun <T> Iterable<UnstableSmartCast>.any(predicate: (UnstableSmartCast) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnstableSmartCast

'it' @ [85:21] ==> value-parameter it: UnstableSmartCast defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [85:24] ==> public final val argument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[PropertyDescriptorImpl]

'argument' @ [85:36] ==> val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

'!' @ [88:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thereIsUnstableSmartCastError' @ [88:22] ==> val thereIsUnstableSmartCastError: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

'kotlinDiagnosticsHolder' @ [89:21] ==> value-parameter kotlinDiagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[ValueParameterDescriptorImpl]

'addDiagnostic' @ [89:45] ==> public abstract fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder[SimpleFunctionDescriptorImpl]

'smartCastDiagnostic' @ [89:59] ==> val smartCastDiagnostic: SmartCastDiagnostic defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter.reportSmartCasts[LocalVariableDescriptor]

