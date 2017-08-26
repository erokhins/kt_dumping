'runTransaction' @ [54:9] ==> public abstract fun runTransaction(runOperations: ConstraintSystemOperation.() -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'!' @ [55:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasContradiction' @ [55:18] ==> public abstract val hasContradiction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[PropertyDescriptorImpl]

'addSubtypeConstraint' @ [55:36] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[SimpleFunctionDescriptorImpl]

'lowerType' @ [55:57] ==> value-parameter lowerType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.addSubtypeConstraintIfCompatible[ValueParameterDescriptorImpl]

'upperType' @ [55:68] ==> value-parameter upperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.addSubtypeConstraintIfCompatible[ValueParameterDescriptorImpl]

'position' @ [55:79] ==> value-parameter position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.addSubtypeConstraintIfCompatible[ValueParameterDescriptorImpl]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasContradiction' @ [56:14] ==> public abstract val hasContradiction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[PropertyDescriptorImpl]

'when (argument) {
        is SubKotlinCallArgument -> addOtherSystem(argument.callResult.constraintSystem)
        is CallableReferenceKotlinCallArgument -> {
            addSubsystemForArgument(argument.lhsResult.safeAs<LHSResult.Expression>()?.lshCallArgument)
        }
    }' @ [61:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'argument' @ [61:11] ==> value-parameter argument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.inference.addSubsystemForArgument[ValueParameterDescriptorImpl]

'addOtherSystem' @ [62:37] ==> public abstract fun addOtherSystem(otherSystem: ConstraintStorage): Unit defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'argument' @ [62:52] ==> value-parameter argument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.inference.addSubsystemForArgument[ValueParameterDescriptorImpl]

'callResult' @ [62:61] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'constraintSystem' @ [62:72] ==> public final val constraintSystem: ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[PropertyDescriptorImpl]

'addSubsystemForArgument' @ [64:13] ==> public fun PostponedArgumentsAnalyzer.Context.addSubsystemForArgument(argument: KotlinCallArgument?): Unit defined in org.jetbrains.kotlin.resolve.calls.inference in file ConstraintSystemBuilder.kt[SimpleFunctionDescriptorImpl]

'argument' @ [64:37] ==> value-parameter argument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.inference.addSubsystemForArgument[ValueParameterDescriptorImpl]

'lhsResult' @ [64:46] ==> public abstract val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceKotlinCallArgument[PropertyDescriptorImpl]

'safeAs' @ [64:56] ==> public inline fun <reified T : Any> Any?.safeAs(): LHSResult.Expression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Expression

'lshCallArgument' @ [64:88] ==> public final val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Expression[PropertyDescriptorImpl]

