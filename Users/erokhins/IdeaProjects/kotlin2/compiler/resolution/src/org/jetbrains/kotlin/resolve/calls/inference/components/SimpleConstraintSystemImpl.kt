'NewConstraintSystemImpl' @ [34:46] ==> public constructor NewConstraintSystemImpl(constraintInjector: ConstraintInjector, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintSystemImpl[ClassConstructorDescriptorImpl]

'constraintInjector' @ [34:70] ==> value-parameter constraintInjector: ConstraintInjector defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [34:90] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.<init>[ValueParameterDescriptorImpl]

'getBuilder' @ [34:100] ==> public open fun getBuilder(): NewConstraintSystemImpl defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintSystemImpl[SimpleFunctionDescriptorImpl]

'typeParameters' @ [37:31] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'associate' @ [37:46] ==> public inline fun <T, K, V> Iterable<TypeParameterDescriptor>.associate(transform: (TypeParameterDescriptor) -> Pair<TypeConstructor, TypeProjection>): Map<TypeConstructor, TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <K> -> TypeConstructor
    <V> -> TypeProjection

'TypeVariableFromCallableDescriptor' @ [38:28] ==> public constructor TypeVariableFromCallableDescriptor(originalTypeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableFromCallableDescriptor[ClassConstructorDescriptorImpl]

'it' @ [38:63] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'csBuilder' @ [39:13] ==> public final val csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl[PropertyDescriptorImpl]

'registerVariable' @ [39:23] ==> public abstract fun registerVariable(variable: NewTypeVariable): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'variable' @ [39:40] ==> val variable: TypeVariableFromCallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables.<anonymous>[LocalVariableDescriptor]

'it' @ [41:13] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [41:16] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constructor' @ [41:28] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'variable' @ [41:43] ==> val variable: TypeVariableFromCallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [41:52] ==> public final val defaultType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableFromCallableDescriptor[PropertyDescriptorImpl]

'asTypeProjection' @ [41:64] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'TypeConstructorSubstitution' @ [43:27] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'createByConstructorsMap' @ [43:55] ==> @JvmStatic @JvmOverloads public final fun createByConstructorsMap(map: Map<TypeConstructor, TypeProjection>, approximateCapturedTypes: Boolean = ...): TypeConstructorSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'substitutionMap' @ [43:79] ==> val substitutionMap: Map<TypeConstructor, TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'buildSubstitutor' @ [43:96] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [44:31] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'typeParameter' @ [45:32] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'upperBounds' @ [45:46] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'addSubtypeConstraint' @ [46:17] ==> public open fun addSubtypeConstraint(subType: UnwrappedType, superType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl[SimpleFunctionDescriptorImpl]

'substitutor' @ [46:38] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'substitute' @ [46:50] ==> public fun TypeSubstitutor.substitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference in file InferenceUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameter' @ [46:61] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'defaultType' @ [46:75] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'substitutor' @ [46:89] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'substitute' @ [46:101] ==> public fun TypeSubstitutor.substitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference in file InferenceUtils.kt[SimpleFunctionDescriptorImpl]

'upperBound' @ [46:112] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'unwrap' @ [46:123] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [49:16] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.registerTypeVariables[LocalVariableDescriptor]

'csBuilder' @ [53:9] ==> public final val csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl[PropertyDescriptorImpl]

'addSubtypeConstraint' @ [53:19] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'subType' @ [53:40] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.addSubtypeConstraint[ValueParameterDescriptorImpl]

'superType' @ [53:49] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl.addSubtypeConstraint[ValueParameterDescriptorImpl]

'SimpleConstraintSystemConstraintPosition' @ [53:60] ==> @Deprecated public object SimpleConstraintSystemConstraintPosition : ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model in file ConstraintPositionAndErrors.kt[FakeCallableDescriptorForObject]

'csBuilder' @ [56:39] ==> public final val csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl[PropertyDescriptorImpl]

'hasContradiction' @ [56:49] ==> public abstract val hasContradiction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[PropertyDescriptorImpl]

