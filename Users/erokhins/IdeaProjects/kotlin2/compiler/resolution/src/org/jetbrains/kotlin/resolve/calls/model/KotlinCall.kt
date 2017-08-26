'assert' @ [41:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [41:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSpread' @ [41:13] ==> public abstract val isSpread: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[PropertyDescriptorImpl]

'this' @ [42:40] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.model.checkReceiverInvariants[ReceiverParameterDescriptorImpl]

'assert' @ [44:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'argumentName' @ [44:12] ==> public abstract val argumentName: Name? defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[PropertyDescriptorImpl]

'this' @ [45:54] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.model.checkReceiverInvariants[ReceiverParameterDescriptorImpl]

'argumentName' @ [45:71] ==> public abstract val argumentName: Name? defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[PropertyDescriptorImpl]

'checkArgumentInvariants' @ [47:5] ==> private fun KotlinCallArgument.checkArgumentInvariants(): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCall.kt[SimpleFunctionDescriptorImpl]

'this' @ [51:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.model.checkArgumentInvariants[ReceiverParameterDescriptorImpl]

'assert' @ [52:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callResult' @ [52:16] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'type' @ [52:27] ==> public final val type: CallResolutionResult.Type defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[PropertyDescriptorImpl]

'PARTIAL' @ [52:61] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'callResult' @ [53:48] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'assert' @ [55:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callResult' @ [55:16] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'resultCallAtom' @ [55:27] ==> public final val resultCallAtom: ResolvedCallAtom? defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[PropertyDescriptorImpl]

'callResult' @ [56:50] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'assert' @ [62:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'explicitReceiver' @ [62:12] ==> public abstract val explicitReceiver: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'explicitReceiver' @ [62:61] ==> public abstract val explicitReceiver: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'explicitReceiver' @ [63:86] ==> public abstract val explicitReceiver: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'explicitReceiver' @ [66:5] ==> public abstract val explicitReceiver: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'safeAs' @ [66:22] ==> public inline fun <reified T : Any> Any?.safeAs(): SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SimpleKotlinCallArgument

'checkReceiverInvariants' @ [66:58] ==> private fun SimpleKotlinCallArgument.checkReceiverInvariants(): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCall.kt[SimpleFunctionDescriptorImpl]

'dispatchReceiverForInvokeExtension' @ [67:5] ==> public open val dispatchReceiverForInvokeExtension: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'safeAs' @ [67:40] ==> public inline fun <reified T : Any> Any?.safeAs(): SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SimpleKotlinCallArgument

'checkReceiverInvariants' @ [67:76] ==> private fun SimpleKotlinCallArgument.checkReceiverInvariants(): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCall.kt[SimpleFunctionDescriptorImpl]

'argumentsInParenthesis' @ [68:5] ==> public abstract val argumentsInParenthesis: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'forEach' @ [68:28] ==> @HidesMembers public inline fun <T> Iterable<KotlinCallArgument>.forEach(action: (KotlinCallArgument) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument

'externalArgument' @ [69:5] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'checkArgumentInvariants' @ [69:23] ==> private fun KotlinCallArgument.checkArgumentInvariants(): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCall.kt[SimpleFunctionDescriptorImpl]

'if (callKind != KotlinCallKind.FUNCTION) {
        assert(externalArgument == null) {
            "External argument is not allowed not for function call: $externalArgument."
        }
        assert(argumentsInParenthesis.isEmpty()) {
            "Arguments in parenthesis should be empty for not function call: $this "
        }
        assert(dispatchReceiverForInvokeExtension == null) {
            "Dispatch receiver for invoke should be null for not function call: $dispatchReceiverForInvokeExtension"
        }
    }
    else {
        assert(externalArgument == null || !externalArgument!!.isSpread) {
            "External argument cannot nave spread element: $externalArgument"
        }

        assert(externalArgument?.argumentName == null) {
            "Illegal external argument with name: $externalArgument"
        }

        assert(dispatchReceiverForInvokeExtension == null || !dispatchReceiverForInvokeExtension!!.isSafeCall) {
            "Dispatch receiver for invoke cannot be safe: $dispatchReceiverForInvokeExtension"
        }
    }' @ [71:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'callKind' @ [71:9] ==> public abstract val callKind: KotlinCallKind defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'FUNCTION' @ [71:36] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'assert' @ [72:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'externalArgument' @ [72:16] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'externalArgument' @ [73:71] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'assert' @ [75:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'argumentsInParenthesis' @ [75:16] ==> public abstract val argumentsInParenthesis: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'isEmpty' @ [75:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'this' @ [76:79] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.model.checkCallInvariants[ReceiverParameterDescriptorImpl]

'assert' @ [78:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dispatchReceiverForInvokeExtension' @ [78:16] ==> public open val dispatchReceiverForInvokeExtension: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'dispatchReceiverForInvokeExtension' @ [79:82] ==> public open val dispatchReceiverForInvokeExtension: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'assert' @ [83:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'externalArgument' @ [83:16] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'!' @ [83:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'externalArgument' @ [83:45] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'isSpread' @ [83:64] ==> public abstract val isSpread: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallArgument[PropertyDescriptorImpl]

'externalArgument' @ [84:61] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'assert' @ [87:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'externalArgument' @ [87:16] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'argumentName' @ [87:34] ==> public abstract val argumentName: Name? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallArgument[PropertyDescriptorImpl]

'externalArgument' @ [88:52] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'assert' @ [91:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dispatchReceiverForInvokeExtension' @ [91:16] ==> public open val dispatchReceiverForInvokeExtension: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'!' @ [91:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dispatchReceiverForInvokeExtension' @ [91:63] ==> public open val dispatchReceiverForInvokeExtension: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'isSafeCall' @ [91:100] ==> public abstract val isSafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ReceiverKotlinCallArgument[PropertyDescriptorImpl]

'dispatchReceiverForInvokeExtension' @ [92:60] ==> public open val dispatchReceiverForInvokeExtension: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

