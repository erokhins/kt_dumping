'ArgumentMapping' @ [38:32] ==> public constructor ArgumentMapping(parameterToCallArgumentMap: Map<ValueParameterDescriptor, ResolvedCallArgument>, diagnostics: List<KotlinCallDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.ArgumentMapping[ClassConstructorDescriptorImpl]

'emptyMap' @ [38:48] ==> public fun <K, V> emptyMap(): Map<ValueParameterDescriptor, ResolvedCallArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'emptyList' @ [38:60] ==> public fun <T> emptyList(): List<KotlinCallDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'mapArguments' @ [41:13] ==> public final fun mapArguments(argumentsInParenthesis: List<KotlinCallArgument>, externalArgument: KotlinCallArgument?, descriptor: CallableDescriptor): ArgumentsToParametersMapper.ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper[SimpleFunctionDescriptorImpl]

'call' @ [41:26] ==> value-parameter call: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'argumentsInParenthesis' @ [41:31] ==> public abstract val argumentsInParenthesis: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'call' @ [41:55] ==> value-parameter call: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'externalArgument' @ [41:60] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'descriptor' @ [41:78] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'if (argumentsInParenthesis.isEmpty() && externalArgument == null && descriptor.valueParameters.isEmpty()) {
            return EmptyArgumentMapping
        }
        else {
            val processor = CallArgumentProcessor(descriptor)
            processor.processArgumentsInParenthesis(argumentsInParenthesis)

            if (externalArgument != null) {
                processor.processExternalArgument(externalArgument)
            }
            processor.processDefaultsAndRunChecks()

            return ArgumentMapping(processor.result, processor.getDiagnostics())
        }' @ [49:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'argumentsInParenthesis' @ [49:13] ==> value-parameter argumentsInParenthesis: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'isEmpty' @ [49:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'externalArgument' @ [49:49] ==> value-parameter externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'descriptor' @ [49:77] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'valueParameters' @ [49:88] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [49:104] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'EmptyArgumentMapping' @ [50:20] ==> public final val EmptyArgumentMapping: ArgumentsToParametersMapper.ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper[PropertyDescriptorImpl]

'CallArgumentProcessor' @ [53:29] ==> public constructor CallArgumentProcessor(descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[ClassConstructorDescriptorImpl]

'descriptor' @ [53:51] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'processor' @ [54:13] ==> val processor: ArgumentsToParametersMapper.CallArgumentProcessor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[LocalVariableDescriptor]

'processArgumentsInParenthesis' @ [54:23] ==> public final fun processArgumentsInParenthesis(arguments: List<KotlinCallArgument>): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'argumentsInParenthesis' @ [54:53] ==> value-parameter argumentsInParenthesis: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'externalArgument' @ [56:17] ==> value-parameter externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'processor' @ [57:17] ==> val processor: ArgumentsToParametersMapper.CallArgumentProcessor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[LocalVariableDescriptor]

'processExternalArgument' @ [57:27] ==> public final fun processExternalArgument(externalArgument: KotlinCallArgument): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'externalArgument' @ [57:51] ==> value-parameter externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[ValueParameterDescriptorImpl]

'processor' @ [59:13] ==> val processor: ArgumentsToParametersMapper.CallArgumentProcessor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[LocalVariableDescriptor]

'processDefaultsAndRunChecks' @ [59:23] ==> public final fun processDefaultsAndRunChecks(): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'ArgumentMapping' @ [61:20] ==> public constructor ArgumentMapping(parameterToCallArgumentMap: Map<ValueParameterDescriptor, ResolvedCallArgument>, diagnostics: List<KotlinCallDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.ArgumentMapping[ClassConstructorDescriptorImpl]

'processor' @ [61:36] ==> val processor: ArgumentsToParametersMapper.CallArgumentProcessor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[LocalVariableDescriptor]

'result' @ [61:46] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'processor' @ [61:54] ==> val processor: ArgumentsToParametersMapper.CallArgumentProcessor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.mapArguments[LocalVariableDescriptor]

'getDiagnostics' @ [61:64] ==> public final fun getDiagnostics(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'LinkedHashMap' @ [66:82] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueParameterDescriptor
    <V : (Any..Any?)> -> ResolvedCallArgument

'POSITION_ARGUMENTS' @ [67:35] ==> enum entry POSITION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'descriptor' @ [69:72] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'valueParameters' @ [69:83] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'diagnostics' @ [78:17] ==> private final var diagnostics: MutableList<KotlinCallDiagnostic>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'diagnostics' @ [79:17] ==> private final var diagnostics: MutableList<KotlinCallDiagnostic>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'ArrayList' @ [79:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinCallDiagnostic

'diagnostics' @ [81:13] ==> private final var diagnostics: MutableList<KotlinCallDiagnostic>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'add' @ [81:27] ==> public abstract fun add(element: KotlinCallDiagnostic): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [81:31] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.addDiagnostic[ValueParameterDescriptorImpl]

'diagnostics' @ [84:32] ==> private final var diagnostics: MutableList<KotlinCallDiagnostic>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'emptyList' @ [84:47] ==> public fun <T> emptyList(): List<KotlinCallDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'nameToParameter' @ [87:17] ==> private final var nameToParameter: Map<Name, ValueParameterDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'nameToParameter' @ [88:17] ==> private final var nameToParameter: Map<Name, ValueParameterDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameters' @ [88:35] ==> private final val parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'associateBy' @ [88:46] ==> public inline fun <T, K> Iterable<ValueParameterDescriptor>.associateBy(keySelector: (ValueParameterDescriptor) -> Name): Map<Name, ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <K> -> Name

'it' @ [88:60] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.getParameterByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [88:63] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'nameToParameter' @ [90:20] ==> private final var nameToParameter: Map<Name, ValueParameterDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'name' @ [90:38] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.getParameterByName[ValueParameterDescriptorImpl]

'varargArguments' @ [94:17] ==> private final var varargArguments: MutableList<KotlinCallArgument>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'varargArguments' @ [95:17] ==> private final var varargArguments: MutableList<KotlinCallArgument>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'ArrayList' @ [95:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinCallArgument

'varargArguments' @ [97:13] ==> private final var varargArguments: MutableList<KotlinCallArgument>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'add' @ [97:31] ==> public abstract fun add(element: KotlinCallArgument): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argument' @ [97:35] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.addVarargArgument[ValueParameterDescriptorImpl]

'assert' @ [107:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state' @ [107:20] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'VARARG_POSITION' @ [107:35] ==> enum entry VARARG_POSITION defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'state' @ [107:73] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameters' @ [108:29] ==> private final val parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'currentParameterIndex' @ [108:40] ==> private final var currentParameterIndex: Int defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'result' @ [109:13] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'put' @ [109:20] ==> public abstract fun put(key: ValueParameterDescriptor, value: ResolvedCallArgument): ResolvedCallArgument? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'parameter' @ [109:24] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.completeVarargPositionArguments[LocalVariableDescriptor]

'original' @ [109:34] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'VarargArgument' @ [109:65] ==> public constructor VarargArgument(arguments: List<KotlinCallArgument>) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.VarargArgument[ClassConstructorDescriptorImpl]

'varargArguments' @ [109:80] ==> private final var varargArguments: MutableList<KotlinCallArgument>? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'state' @ [114:17] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'NAMED_ARGUMENT' @ [114:32] ==> enum entry NAMED_ARGUMENT defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'addDiagnostic' @ [115:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'MixingNamedAndPositionArguments' @ [115:31] ==> public constructor MixingNamedAndPositionArguments(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.MixingNamedAndPositionArguments[ClassConstructorDescriptorImpl]

'argument' @ [115:63] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[ValueParameterDescriptorImpl]

'parameters' @ [119:29] ==> private final val parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'getOrNull' @ [119:40] ==> public fun <T> List<ValueParameterDescriptor>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'currentParameterIndex' @ [119:50] ==> private final var currentParameterIndex: Int defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameter' @ [120:17] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[LocalVariableDescriptor]

'addDiagnostic' @ [121:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'TooManyArguments' @ [121:31] ==> public constructor TooManyArguments(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.TooManyArguments[ClassConstructorDescriptorImpl]

'argument' @ [121:48] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[ValueParameterDescriptorImpl]

'descriptor' @ [121:58] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'if (!parameter.isVararg) {
                currentParameterIndex++

                result.put(parameter.original, ResolvedCallArgument.SimpleArgument(argument))
                return false
            }
            // all position arguments will be mapped to current vararg parameter
            else {
                addVarargArgument(argument)
                return true
            }' @ [125:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [125:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [125:18] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[LocalVariableDescriptor]

'isVararg' @ [125:28] ==> public val ValueParameterDescriptor.isVararg: Boolean defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'currentParameterIndex' @ [126:17] ==> private final var currentParameterIndex: Int defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'result' @ [128:17] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'put' @ [128:24] ==> public abstract fun put(key: ValueParameterDescriptor, value: ResolvedCallArgument): ResolvedCallArgument? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'parameter' @ [128:28] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[LocalVariableDescriptor]

'original' @ [128:38] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'SimpleArgument' @ [128:69] ==> public constructor SimpleArgument(callArgument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.SimpleArgument[ClassConstructorDescriptorImpl]

'argument' @ [128:84] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[ValueParameterDescriptorImpl]

'addVarargArgument' @ [133:17] ==> private final fun addVarargArgument(argument: KotlinCallArgument): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'argument' @ [133:35] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processPositionArgument[ValueParameterDescriptorImpl]

'!' @ [139:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [139:18] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'hasStableParameterNames' @ [139:29] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'addDiagnostic' @ [140:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NamedArgumentNotAllowed' @ [140:31] ==> public constructor NamedArgumentNotAllowed(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentNotAllowed[ClassConstructorDescriptorImpl]

'argument' @ [140:55] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[ValueParameterDescriptorImpl]

'descriptor' @ [140:65] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'findParameterByName' @ [143:29] ==> private final fun findParameterByName(argument: KotlinCallArgument, name: Name): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'argument' @ [143:49] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[ValueParameterDescriptorImpl]

'name' @ [143:59] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[ValueParameterDescriptorImpl]

'addDiagnostic' @ [145:13] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NamedArgumentReference' @ [145:27] ==> public constructor NamedArgumentReference(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentReference[ClassConstructorDescriptorImpl]

'argument' @ [145:50] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[ValueParameterDescriptorImpl]

'parameter' @ [145:60] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[LocalVariableDescriptor]

'result' @ [147:13] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameter' @ [147:20] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[LocalVariableDescriptor]

'original' @ [147:30] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'let' @ [147:41] ==> @InlineOnly public inline fun <T, R> ResolvedCallArgument.let(block: (ResolvedCallArgument) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCallArgument
    <R> -> Nothing

'addDiagnostic' @ [148:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'ArgumentPassedTwice' @ [148:31] ==> public constructor ArgumentPassedTwice(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor, firstOccurrence: ResolvedCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentPassedTwice[ClassConstructorDescriptorImpl]

'argument' @ [148:51] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[ValueParameterDescriptorImpl]

'parameter' @ [148:61] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[LocalVariableDescriptor]

'it' @ [148:72] ==> value-parameter it: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [152:13] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameter' @ [152:20] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[LocalVariableDescriptor]

'original' @ [152:30] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'SimpleArgument' @ [152:63] ==> public constructor SimpleArgument(callArgument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.SimpleArgument[ClassConstructorDescriptorImpl]

'argument' @ [152:78] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processNamedArgument[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [155:86] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'firstOrNull' @ [155:108] ==> public inline fun <T> Iterable<ValueParameterDescriptor>.firstOrNull(predicate: (ValueParameterDescriptor) -> Boolean): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'it' @ [156:13] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.getOverriddenParameterWithOtherName.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [156:16] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'hasStableParameterNames' @ [156:38] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'it' @ [156:67] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.getOverriddenParameterWithOtherName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [156:70] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [156:78] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'getParameterByName' @ [160:29] ==> private final fun getParameterByName(name: Name): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'name' @ [160:48] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[ValueParameterDescriptorImpl]

'descriptor' @ [162:17] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'descriptor' @ [162:59] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'kind' @ [162:70] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [162:108] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'if (parameter == null) {
                    for (valueParameter in descriptor.valueParameters) {
                        val matchedParameter = valueParameter.overriddenDescriptors.firstOrNull {
                            it.containingDeclaration.hasStableParameterNames() && it.name == name
                        }
                        if (matchedParameter != null) {
                            addDiagnostic(NamedArgumentReference(argument, valueParameter))
                            addDiagnostic(NameForAmbiguousParameter(argument, valueParameter, matchedParameter))
                            return valueParameter
                        }
                    }
                }
                else {
                    parameter.getOverriddenParameterWithOtherName()?.let {
                        addDiagnostic(NameForAmbiguousParameter(argument, parameter, it))
                    }
                }' @ [163:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'parameter' @ [163:21] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'descriptor' @ [164:44] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'valueParameters' @ [164:55] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'valueParameter' @ [165:48] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'overriddenDescriptors' @ [165:63] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'firstOrNull' @ [165:85] ==> public inline fun <T> Iterable<ValueParameterDescriptor>.firstOrNull(predicate: (ValueParameterDescriptor) -> Boolean): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'it' @ [166:29] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [166:32] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'hasStableParameterNames' @ [166:54] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'it' @ [166:83] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [166:86] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [166:94] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[ValueParameterDescriptorImpl]

'matchedParameter' @ [168:29] ==> val matchedParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'addDiagnostic' @ [169:29] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NamedArgumentReference' @ [169:43] ==> public constructor NamedArgumentReference(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentReference[ClassConstructorDescriptorImpl]

'argument' @ [169:66] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[ValueParameterDescriptorImpl]

'valueParameter' @ [169:76] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'addDiagnostic' @ [170:29] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NameForAmbiguousParameter' @ [170:43] ==> public constructor NameForAmbiguousParameter(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor, overriddenParameterWithOtherName: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NameForAmbiguousParameter[ClassConstructorDescriptorImpl]

'argument' @ [170:69] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[ValueParameterDescriptorImpl]

'valueParameter' @ [170:79] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'matchedParameter' @ [170:95] ==> val matchedParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'valueParameter' @ [171:36] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'parameter' @ [176:21] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'getOverriddenParameterWithOtherName' @ [176:31] ==> private final fun ValueParameterDescriptor.getOverriddenParameterWithOtherName(): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'let' @ [176:70] ==> @InlineOnly public inline fun <T, R> ValueParameterDescriptor.let(block: (ValueParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <R> -> Unit

'addDiagnostic' @ [177:25] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NameForAmbiguousParameter' @ [177:39] ==> public constructor NameForAmbiguousParameter(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor, overriddenParameterWithOtherName: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NameForAmbiguousParameter[ClassConstructorDescriptorImpl]

'argument' @ [177:65] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[ValueParameterDescriptorImpl]

'parameter' @ [177:75] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'it' @ [177:86] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [182:17] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'addDiagnostic' @ [182:36] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NameNotFound' @ [182:50] ==> public constructor NameNotFound(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NameNotFound[ClassConstructorDescriptorImpl]

'argument' @ [182:63] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[ValueParameterDescriptorImpl]

'descriptor' @ [182:73] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameter' @ [184:20] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.findParameterByName[LocalVariableDescriptor]

'arguments' @ [189:30] ==> value-parameter arguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processArgumentsInParenthesis[ValueParameterDescriptorImpl]

'argument' @ [190:36] ==> val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processArgumentsInParenthesis[LocalVariableDescriptor]

'argumentName' @ [190:45] ==> public abstract val argumentName: Name? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallArgument[PropertyDescriptorImpl]

'if (argumentName == null) {
                    if (processPositionArgument(argument)) {
                        state = State.VARARG_POSITION
                    }
                }
                // process named argument
                else {
                    if (state == State.VARARG_POSITION) {
                        completeVarargPositionArguments()
                    }
                    state = State.POSITION_ARGUMENTS

                    processNamedArgument(argument, argumentName)
                }' @ [193:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentName' @ [193:21] ==> val argumentName: Name? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processArgumentsInParenthesis[LocalVariableDescriptor]

'processPositionArgument' @ [194:25] ==> private final fun processPositionArgument(argument: KotlinCallArgument): Boolean defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'argument' @ [194:49] ==> val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processArgumentsInParenthesis[LocalVariableDescriptor]

'state' @ [195:25] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'VARARG_POSITION' @ [195:39] ==> enum entry VARARG_POSITION defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'state' @ [200:25] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'VARARG_POSITION' @ [200:40] ==> enum entry VARARG_POSITION defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'completeVarargPositionArguments' @ [201:25] ==> private final fun completeVarargPositionArguments(): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'state' @ [203:21] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'POSITION_ARGUMENTS' @ [203:35] ==> enum entry POSITION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'processNamedArgument' @ [205:21] ==> private final fun processNamedArgument(argument: KotlinCallArgument, name: Name): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'argument' @ [205:42] ==> val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processArgumentsInParenthesis[LocalVariableDescriptor]

'argumentName' @ [205:52] ==> val argumentName: Name? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processArgumentsInParenthesis[LocalVariableDescriptor]

'state' @ [208:17] ==> private final var state: ArgumentsToParametersMapper.CallArgumentProcessor.State defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'VARARG_POSITION' @ [208:32] ==> enum entry VARARG_POSITION defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.State[FakeCallableDescriptorForObject]

'completeVarargPositionArguments' @ [209:17] ==> private final fun completeVarargPositionArguments(): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'parameters' @ [214:33] ==> private final val parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'lastOrNull' @ [214:44] ==> public fun <T> List<ValueParameterDescriptor>.lastOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'lastParameter' @ [215:17] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[LocalVariableDescriptor]

'addDiagnostic' @ [216:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'TooManyArguments' @ [216:31] ==> public constructor TooManyArguments(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.TooManyArguments[ClassConstructorDescriptorImpl]

'externalArgument' @ [216:48] ==> value-parameter externalArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[ValueParameterDescriptorImpl]

'descriptor' @ [216:66] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'lastParameter' @ [220:17] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[LocalVariableDescriptor]

'isVararg' @ [220:31] ==> public val ValueParameterDescriptor.isVararg: Boolean defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'addDiagnostic' @ [221:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'VarargArgumentOutsideParentheses' @ [221:31] ==> public constructor VarargArgumentOutsideParentheses(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.VarargArgumentOutsideParentheses[ClassConstructorDescriptorImpl]

'externalArgument' @ [221:64] ==> value-parameter externalArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[ValueParameterDescriptorImpl]

'lastParameter' @ [221:82] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[LocalVariableDescriptor]

'result' @ [225:38] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'lastParameter' @ [225:45] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[LocalVariableDescriptor]

'original' @ [225:59] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'previousOccurrence' @ [226:17] ==> val previousOccurrence: ResolvedCallArgument? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[LocalVariableDescriptor]

'addDiagnostic' @ [227:17] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'TooManyArguments' @ [227:31] ==> public constructor TooManyArguments(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.TooManyArguments[ClassConstructorDescriptorImpl]

'externalArgument' @ [227:48] ==> value-parameter externalArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[ValueParameterDescriptorImpl]

'descriptor' @ [227:66] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'result' @ [232:13] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'lastParameter' @ [232:20] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[LocalVariableDescriptor]

'original' @ [232:34] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'SimpleArgument' @ [232:67] ==> public constructor SimpleArgument(callArgument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.SimpleArgument[ClassConstructorDescriptorImpl]

'externalArgument' @ [232:82] ==> value-parameter externalArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processExternalArgument[ValueParameterDescriptorImpl]

'component1' @ [236:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'component2' @ [236:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component2(): ResolvedCallArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'result' @ [236:51] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'!' @ [237:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [237:22] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'isVararg' @ [237:32] ==> public val ValueParameterDescriptor.isVararg: Boolean defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'if (resolvedArgument !is ResolvedCallArgument.SimpleArgument) {
                        error("Incorrect resolved argument for parameter $parameter :$resolvedArgument")
                    }
                    else {
                        if (resolvedArgument.callArgument.isSpread) {
                            addDiagnostic(NonVarargSpread(resolvedArgument.callArgument, parameter))
                        }
                    }' @ [238:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedArgument' @ [238:25] ==> val resolvedArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'error' @ [239:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameter' @ [239:75] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'resolvedArgument' @ [239:87] ==> val resolvedArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'resolvedArgument' @ [242:29] ==> val resolvedArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'callArgument' @ [242:46] ==> public final val callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.SimpleArgument[PropertyDescriptorImpl]

'isSpread' @ [242:59] ==> public abstract val isSpread: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallArgument[PropertyDescriptorImpl]

'addDiagnostic' @ [243:29] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NonVarargSpread' @ [243:43] ==> public constructor NonVarargSpread(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NonVarargSpread[ClassConstructorDescriptorImpl]

'resolvedArgument' @ [243:59] ==> val resolvedArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'callArgument' @ [243:76] ==> public final val callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.SimpleArgument[PropertyDescriptorImpl]

'parameter' @ [243:90] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'parameters' @ [249:31] ==> private final val parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'!' @ [250:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [250:22] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'containsKey' @ [250:29] ==> public abstract fun containsKey(key: ValueParameterDescriptor): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'parameter' @ [250:41] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'original' @ [250:51] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'if (parameter.hasDefaultValue()) {
                        result[parameter.original] = ResolvedCallArgument.DefaultArgument
                    }
                    else if (parameter.isVararg) {
                        result[parameter.original] = ResolvedCallArgument.VarargArgument(emptyList())
                    }
                    else {
                        addDiagnostic(NoValueForParameter(parameter, descriptor))
                    }' @ [251:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameter' @ [251:25] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'hasDefaultValue' @ [251:35] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'result' @ [252:25] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameter' @ [252:32] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'original' @ [252:42] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'DefaultArgument' @ [252:75] ==> public object DefaultArgument : ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[FakeCallableDescriptorForObject]

'if (parameter.isVararg) {
                        result[parameter.original] = ResolvedCallArgument.VarargArgument(emptyList())
                    }
                    else {
                        addDiagnostic(NoValueForParameter(parameter, descriptor))
                    }' @ [254:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameter' @ [254:30] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'isVararg' @ [254:40] ==> public val ValueParameterDescriptor.isVararg: Boolean defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'result' @ [255:25] ==> public final val result: MutableMap<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

'parameter' @ [255:32] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'original' @ [255:42] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'VarargArgument' @ [255:75] ==> public constructor VarargArgument(arguments: List<KotlinCallArgument>) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.VarargArgument[ClassConstructorDescriptorImpl]

'emptyList' @ [255:90] ==> public fun <T> emptyList(): List<KotlinCallArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument

'addDiagnostic' @ [258:25] ==> private final fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[SimpleFunctionDescriptorImpl]

'NoValueForParameter' @ [258:39] ==> public constructor NoValueForParameter(parameterDescriptor: ValueParameterDescriptor, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NoValueForParameter[ClassConstructorDescriptorImpl]

'parameter' @ [258:59] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor.processDefaultsAndRunChecks[LocalVariableDescriptor]

'descriptor' @ [258:70] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.CallArgumentProcessor[PropertyDescriptorImpl]

