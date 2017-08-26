'lazy' @ [38:34] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Collection<ExpectedInfo>): Lazy<Collection<ExpectedInfo>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<ExpectedInfo>

'NONE' @ [38:60] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'invoke' @ [38:68] ==> public abstract operator fun invoke(): Collection<ExpectedInfo> defined in kotlin.Function0[FunctionInvokeDescriptor]

'when (descriptor) {
            is FunctionDescriptor -> {
                when (callType) {
                    CallType.DEFAULT, CallType.DOT, CallType.SAFE, CallType.SUPER_MEMBERS -> {
                        val needTypeArguments = needTypeArguments(descriptor)
                        val parameters = descriptor.valueParameters
                        when (parameters.size) {
                            0 -> KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = false)

                            1 -> {
                                if (callType != CallType.SUPER_MEMBERS) { // for super call we don't suggest to generate "super.foo { ... }" (seems to be non-typical use)
                                    val parameter = parameters.single()
                                    val parameterType = parameter.type
                                    if (parameterType.isFunctionType) {
                                        if (getValueParametersCountFromFunctionType(parameterType) <= 1 && !parameter.hasDefaultValue()) {
                                            // otherwise additional item with lambda template is to be added
                                            return KotlinFunctionInsertHandler.Normal(
                                                    callType, needTypeArguments, inputValueArguments = false,
                                                    lambdaInfo = GenerateLambdaInfo(parameterType, false)
                                            )
                                        }
                                    }
                                }

                                KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = true)
                            }

                            else -> KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = true)
                        }
                    }

                    CallType.INFIX -> KotlinFunctionInsertHandler.Infix

                    else -> KotlinFunctionInsertHandler.OnlyName(callType)
                }

            }

            is PropertyDescriptor -> KotlinPropertyInsertHandler(callType)

            is ClassifierDescriptor -> KotlinClassifierInsertHandler

            else -> BaseDeclarationInsertHandler()
        }' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: InsertHandler<LookupElement>, entry1: InsertHandler<LookupElement>, entry2: InsertHandler<LookupElement>, entry3: InsertHandler<LookupElement>): InsertHandler<LookupElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> InsertHandler<LookupElement>

'descriptor' @ [41:22] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[ValueParameterDescriptorImpl]

'when (callType) {
                    CallType.DEFAULT, CallType.DOT, CallType.SAFE, CallType.SUPER_MEMBERS -> {
                        val needTypeArguments = needTypeArguments(descriptor)
                        val parameters = descriptor.valueParameters
                        when (parameters.size) {
                            0 -> KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = false)

                            1 -> {
                                if (callType != CallType.SUPER_MEMBERS) { // for super call we don't suggest to generate "super.foo { ... }" (seems to be non-typical use)
                                    val parameter = parameters.single()
                                    val parameterType = parameter.type
                                    if (parameterType.isFunctionType) {
                                        if (getValueParametersCountFromFunctionType(parameterType) <= 1 && !parameter.hasDefaultValue()) {
                                            // otherwise additional item with lambda template is to be added
                                            return KotlinFunctionInsertHandler.Normal(
                                                    callType, needTypeArguments, inputValueArguments = false,
                                                    lambdaInfo = GenerateLambdaInfo(parameterType, false)
                                            )
                                        }
                                    }
                                }

                                KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = true)
                            }

                            else -> KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = true)
                        }
                    }

                    CallType.INFIX -> KotlinFunctionInsertHandler.Infix

                    else -> KotlinFunctionInsertHandler.OnlyName(callType)
                }' @ [43:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinFunctionInsertHandler, entry1: KotlinFunctionInsertHandler, entry2: KotlinFunctionInsertHandler): KotlinFunctionInsertHandler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinFunctionInsertHandler

'callType' @ [43:23] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'DEFAULT' @ [44:30] ==> public object DEFAULT : CallType<Nothing?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'DOT' @ [44:48] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'SAFE' @ [44:62] ==> public object SAFE : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'SUPER_MEMBERS' @ [44:77] ==> public object SUPER_MEMBERS : CallType<KtSuperExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'needTypeArguments' @ [45:49] ==> private final fun needTypeArguments(function: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [45:67] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[ValueParameterDescriptorImpl]

'descriptor' @ [46:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[ValueParameterDescriptorImpl]

'valueParameters' @ [46:53] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'when (parameters.size) {
                            0 -> KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = false)

                            1 -> {
                                if (callType != CallType.SUPER_MEMBERS) { // for super call we don't suggest to generate "super.foo { ... }" (seems to be non-typical use)
                                    val parameter = parameters.single()
                                    val parameterType = parameter.type
                                    if (parameterType.isFunctionType) {
                                        if (getValueParametersCountFromFunctionType(parameterType) <= 1 && !parameter.hasDefaultValue()) {
                                            // otherwise additional item with lambda template is to be added
                                            return KotlinFunctionInsertHandler.Normal(
                                                    callType, needTypeArguments, inputValueArguments = false,
                                                    lambdaInfo = GenerateLambdaInfo(parameterType, false)
                                            )
                                        }
                                    }
                                }

                                KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = true)
                            }

                            else -> KotlinFunctionInsertHandler.Normal(callType, needTypeArguments, inputValueArguments = true)
                        }' @ [47:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinFunctionInsertHandler.Normal, entry1: KotlinFunctionInsertHandler.Normal, entry2: KotlinFunctionInsertHandler.Normal): KotlinFunctionInsertHandler.Normal[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Normal

'parameters' @ [47:31] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'size' @ [47:42] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'Normal' @ [48:62] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'callType' @ [48:69] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'needTypeArguments' @ [48:79] ==> val needTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'callType' @ [51:37] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'SUPER_MEMBERS' @ [51:58] ==> public object SUPER_MEMBERS : CallType<KtSuperExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'parameters' @ [52:53] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'single' @ [52:64] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.single(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'parameter' @ [53:57] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'type' @ [53:67] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'parameterType' @ [54:41] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'isFunctionType' @ [54:55] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'getValueParametersCountFromFunctionType' @ [55:45] ==> public fun getValueParametersCountFromFunctionType(type: KotlinType): Int defined in org.jetbrains.kotlin.resolve.calls.util[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [55:85] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'!' @ [55:108] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [55:109] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'hasDefaultValue' @ [55:119] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'Normal' @ [57:80] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'callType' @ [58:53] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'needTypeArguments' @ [58:63] ==> val needTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'GenerateLambdaInfo' @ [59:66] ==> public constructor GenerateLambdaInfo(lambdaType: KotlinType, explicitParameters: Boolean) defined in org.jetbrains.kotlin.idea.completion.handlers.GenerateLambdaInfo[ClassConstructorDescriptorImpl]

'parameterType' @ [59:85] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'Normal' @ [65:61] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'callType' @ [65:68] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'needTypeArguments' @ [65:78] ==> val needTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'Normal' @ [68:65] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'callType' @ [68:72] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'needTypeArguments' @ [68:82] ==> val needTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.insertHandler[LocalVariableDescriptor]

'INFIX' @ [72:30] ==> public object INFIX : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'Infix' @ [72:67] ==> public object Infix : KotlinFunctionInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler[FakeCallableDescriptorForObject]

'OnlyName' @ [74:57] ==> public constructor OnlyName(callType: CallType<*>) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.OnlyName[ClassConstructorDescriptorImpl]

'callType' @ [74:66] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'KotlinPropertyInsertHandler' @ [79:38] ==> public constructor KotlinPropertyInsertHandler(callType: CallType<*>) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinPropertyInsertHandler[ClassConstructorDescriptorImpl]

'callType' @ [79:66] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'KotlinClassifierInsertHandler' @ [81:40] ==> public object KotlinClassifierInsertHandler : BaseDeclarationInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers in file KotlinClassifierInsertHandler.kt[FakeCallableDescriptorForObject]

'BaseDeclarationInsertHandler' @ [83:21] ==> public constructor BaseDeclarationInsertHandler() defined in org.jetbrains.kotlin.idea.completion.handlers.BaseDeclarationInsertHandler[ClassConstructorDescriptorImpl]

'function' @ [88:13] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[ValueParameterDescriptorImpl]

'typeParameters' @ [88:22] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [88:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'function' @ [90:32] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[ValueParameterDescriptorImpl]

'original' @ [90:41] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'originalFunction' @ [91:30] ==> val originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'typeParameters' @ [91:47] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'HashSet' @ [93:35] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'type' @ [96:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[ValueParameterDescriptorImpl]

'constructor' @ [96:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [96:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptor' @ [97:17] ==> val descriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'descriptor' @ [97:39] ==> val descriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'typeParameters' @ [97:53] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'descriptor' @ [97:71] ==> val descriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'potentiallyInferred' @ [97:86] ==> val potentiallyInferred: HashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'potentiallyInferred' @ [98:17] ==> val potentiallyInferred: HashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'add' @ [98:37] ==> public open fun add(element: TypeParameterDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptor' @ [98:41] ==> val descriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'descriptor' @ [101:17] ==> val descriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'upperBounds' @ [101:28] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'filter' @ [101:40] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filter(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [101:49] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [101:52] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [101:62] ==> @InlineOnly public inline fun <T> Collection<TypeProjection>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'forEach' @ [101:77] ==> @HidesMembers public inline fun <T> Iterable<(KotlinType..KotlinType?)>.forEach(action: ((KotlinType..KotlinType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'type' @ [104:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[ValueParameterDescriptorImpl]

'isFunctionType' @ [104:22] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'getValueParametersCountFromFunctionType' @ [104:40] ==> public fun getValueParametersCountFromFunctionType(type: KotlinType): Int defined in org.jetbrains.kotlin.resolve.calls.util[DeserializedSimpleFunctionDescriptor]

'type' @ [104:80] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[ValueParameterDescriptorImpl]

'addPotentiallyInferred' @ [106:17] ==> local final fun addPotentiallyInferred(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[SimpleFunctionDescriptorImpl]

'type' @ [106:40] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[ValueParameterDescriptorImpl]

'getReturnTypeFromFunctionType' @ [106:45] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'type' @ [110:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[ValueParameterDescriptorImpl]

'arguments' @ [110:35] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [111:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argument' @ [111:22] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'isStarProjection' @ [111:31] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'addPotentiallyInferred' @ [112:21] ==> local final fun addPotentiallyInferred(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[SimpleFunctionDescriptorImpl]

'argument' @ [112:44] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.addPotentiallyInferred[LocalVariableDescriptor]

'type' @ [112:53] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'originalFunction' @ [117:9] ==> val originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'extensionReceiverParameter' @ [117:26] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [117:54] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'let' @ [117:60] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'originalFunction' @ [118:9] ==> val originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'valueParameters' @ [118:26] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [118:42] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'addPotentiallyInferred' @ [118:52] ==> local final fun addPotentiallyInferred(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[SimpleFunctionDescriptorImpl]

'it' @ [118:75] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [118:78] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'originalFunction' @ [120:54] ==> val originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'typeParameters' @ [120:71] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'all' @ [120:86] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.all(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'it' @ [120:92] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.allTypeParametersPotentiallyInferred.<anonymous>[ValueParameterDescriptorImpl]

'potentiallyInferred' @ [120:98] ==> val potentiallyInferred: HashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'allTypeParametersPotentiallyInferred' @ [122:13] ==> local final fun allTypeParametersPotentiallyInferred(): Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[SimpleFunctionDescriptorImpl]

'originalFunction' @ [124:26] ==> val originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'returnType' @ [124:43] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [126:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'addPotentiallyInferred' @ [127:13] ==> local final fun addPotentiallyInferred(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[SimpleFunctionDescriptorImpl]

'returnType' @ [127:36] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'allTypeParametersPotentiallyInferred' @ [129:17] ==> local final fun allTypeParametersPotentiallyInferred(): Boolean defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[SimpleFunctionDescriptorImpl]

'expectedInfos' @ [129:59] ==> private final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[PropertyDescriptorImpl]

'any' @ [129:73] ==> public inline fun <T> Iterable<ExpectedInfo>.any(predicate: (ExpectedInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'it' @ [129:79] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [129:82] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'checkIsSuperTypeOf' @ [129:93] ==> public final fun checkIsSuperTypeOf(otherType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedSimpleFunctionDescriptor]

'originalFunction' @ [129:112] ==> val originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider.needTypeArguments[LocalVariableDescriptor]

'fuzzyReturnType' @ [129:129] ==> public fun CallableDescriptor.fuzzyReturnType(): FuzzyType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

