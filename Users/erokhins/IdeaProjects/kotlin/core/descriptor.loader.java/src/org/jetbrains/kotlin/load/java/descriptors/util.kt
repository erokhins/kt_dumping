'assert' @ [36:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'newValueParametersTypes' @ [36:12] ==> value-parameter newValueParametersTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'size' @ [36:36] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'oldValueParameters' @ [36:44] ==> value-parameter oldValueParameters: Collection<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'size' @ [36:63] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'newValueParametersTypes' @ [37:57] ==> value-parameter newValueParametersTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'size' @ [37:81] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'oldValueParameters' @ [37:96] ==> value-parameter oldValueParameters: Collection<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'size' @ [37:115] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'newValueParametersTypes' @ [40:12] ==> value-parameter newValueParametersTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'zip' @ [40:36] ==> public infix fun <T, R> Iterable<KotlinType>.zip(other: Iterable<ValueParameterDescriptor>): List<Pair<KotlinType, ValueParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> ValueParameterDescriptor

'oldValueParameters' @ [40:40] ==> value-parameter oldValueParameters: Collection<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'map' @ [40:60] ==> public inline fun <T, R> Iterable<Pair<KotlinType, ValueParameterDescriptor>>.map(transform: (Pair<KotlinType, ValueParameterDescriptor>) -> ValueParameterDescriptorImpl): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KotlinType, ValueParameterDescriptor>
    <R> -> ValueParameterDescriptorImpl

'component1' @ [42:14] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [42:23] ==> public final operator fun component2(): ValueParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [42:39] ==> value-parameter pair: Pair<KotlinType, ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'ValueParameterDescriptorImpl' @ [43:9] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[ClassConstructorDescriptorImpl]

'newOwner' @ [44:17] ==> value-parameter newOwner: CallableDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'oldParameter' @ [45:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'oldParameter' @ [46:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'index' @ [46:30] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'oldParameter' @ [47:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'annotations' @ [47:30] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'oldParameter' @ [48:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'name' @ [48:30] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'newType' @ [49:17] ==> val newType: KotlinType defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'oldParameter' @ [50:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'declaresDefaultValue' @ [50:30] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[SimpleFunctionDescriptorImpl]

'oldParameter' @ [51:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'isCrossinline' @ [51:30] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'oldParameter' @ [52:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'isNoinline' @ [52:30] ==> public abstract val isNoinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'if (oldParameter.varargElementType != null) newOwner.module.builtIns.getArrayElementType(newType) else null' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'oldParameter' @ [53:21] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'varargElementType' @ [53:34] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'newOwner' @ [53:61] ==> value-parameter newOwner: CallableDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters[ValueParameterDescriptorImpl]

'module' @ [53:70] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'builtIns' @ [53:77] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getArrayElementType' @ [53:86] ==> @NotNull public open fun getArrayElementType(@NotNull arrayType: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'newType' @ [53:106] ==> val newType: KotlinType defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'oldParameter' @ [54:17] ==> val oldParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'source' @ [54:30] ==> public final val ValueParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'getSuperClassNotAny' @ [60:32] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'superClassDescriptor' @ [62:23] ==> val superClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.getParentJavaStaticClassScope[LocalVariableDescriptor]

'staticScope' @ [62:44] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'staticScope' @ [64:9] ==> val staticScope: MemberScope defined in org.jetbrains.kotlin.load.java.descriptors.getParentJavaStaticClassScope[LocalVariableDescriptor]

'superClassDescriptor' @ [64:58] ==> val superClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.getParentJavaStaticClassScope[LocalVariableDescriptor]

'getParentJavaStaticClassScope' @ [64:79] ==> public fun ClassDescriptor.getParentJavaStaticClassScope(): LazyJavaStaticClassScope? defined in org.jetbrains.kotlin.load.java.descriptors in file util.kt[SimpleFunctionDescriptorImpl]

'staticScope' @ [66:12] ==> val staticScope: MemberScope defined in org.jetbrains.kotlin.load.java.descriptors.getParentJavaStaticClassScope[LocalVariableDescriptor]

'containerSource' @ [70:13] ==> public abstract val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberDescriptor[PropertyDescriptorImpl]

'simpleName' @ [70:56] ==> public final val simpleName: Name defined in org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource[PropertyDescriptorImpl]

'containerSource' @ [74:9] ==> public abstract val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberDescriptor[PropertyDescriptorImpl]

