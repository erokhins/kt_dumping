'createFreeDescriptor' @ [32:12] ==> private fun <D : CallableMemberDescriptor> createFreeDescriptor(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> FunctionDescriptor

'descriptor' @ [32:33] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLambdaDescriptor[ValueParameterDescriptorImpl]

'Suppress' @ [36:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptor' @ [37:19] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[ValueParameterDescriptorImpl]

'newCopyBuilder' @ [37:30] ==> @NotNull public abstract fun newCopyBuilder(): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[JavaMethodDescriptor]

'ArrayList' @ [39:26] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'builder' @ [40:5] ==> val builder: CallableMemberDescriptor.CopyBuilder<D> defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'setTypeParameters' @ [40:13] ==> @NotNull public abstract fun setTypeParameters(@NotNull p0: (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): CallableMemberDescriptor.CopyBuilder<(D..D?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'typeParameters' @ [40:31] ==> val typeParameters: ArrayList<TypeParameterDescriptor> defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'descriptor' @ [42:45] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [42:56] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [43:12] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'if (container is ClassDescriptor) {
            typeParameters.addAll(container.declaredTypeParameters)
        }
        else if (container is CallableDescriptor && container !is ConstructorDescriptor) {
            typeParameters.addAll(container.typeParameters)
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'container' @ [44:13] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'typeParameters' @ [45:13] ==> val typeParameters: ArrayList<TypeParameterDescriptor> defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'addAll' @ [45:28] ==> public open fun addAll(elements: Collection<TypeParameterDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'container' @ [45:35] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'declaredTypeParameters' @ [45:45] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'container' @ [47:18] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'container' @ [47:53] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'typeParameters' @ [48:13] ==> val typeParameters: ArrayList<TypeParameterDescriptor> defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'addAll' @ [48:28] ==> public open fun addAll(elements: Collection<TypeParameterDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'container' @ [48:35] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'typeParameters' @ [48:45] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'container' @ [50:9] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'container' @ [50:21] ==> var container: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [50:31] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (typeParameters.isEmpty()) descriptor else builder.build()!!' @ [53:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: D, elseBranch: D): D[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> D

'typeParameters' @ [53:16] ==> val typeParameters: ArrayList<TypeParameterDescriptor> defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'isEmpty' @ [53:31] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [53:42] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[ValueParameterDescriptorImpl]

'builder' @ [53:58] ==> val builder: CallableMemberDescriptor.CopyBuilder<D> defined in org.jetbrains.kotlin.codegen.createFreeDescriptor[LocalVariableDescriptor]

'build' @ [53:66] ==> @Nullable public abstract fun build(): D? defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'create' @ [62:43] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, @NotNull p5: Name, @NotNull p6: CallableMemberDescriptor.Kind, @NotNull p7: SourceElement, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean, p13: Boolean): PropertyDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'descriptor' @ [63:13] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [63:24] ==> public final val LocalVariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [63:47] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [63:58] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'Modality' @ [63:71] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [63:80] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'descriptor' @ [63:87] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [63:98] ==> public final val LocalVariableDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [63:110] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'isVar' @ [63:121] ==> public final val LocalVariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptor' @ [64:13] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'name' @ [64:24] ==> public final val LocalVariableDescriptor.name: Name[MyPropertyDescriptor]

'DECLARATION' @ [64:60] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [64:73] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'source' @ [64:84] ==> public final val LocalVariableDescriptor.source: SourceElement[MyPropertyDescriptor]

'descriptor' @ [64:99] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'isConst' @ [64:110] ==> public final val LocalVariableDescriptor.isConst: Boolean[MyPropertyDescriptor]

'Suppress' @ [65:34] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptor' @ [65:59] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'isDelegated' @ [65:70] ==> public open val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'property' @ [67:5] ==> val property: PropertyDescriptorImpl defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[LocalVariableDescriptor]

'setType' @ [67:14] ==> public open fun setType(@NotNull p0: KotlinType, @ReadOnly @NotNull p1: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable p2: ReceiverParameterDescriptor?, @Nullable p3: ReceiverParameterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'descriptor' @ [67:22] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'type' @ [67:33] ==> public final val LocalVariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [67:39] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'typeParameters' @ [67:50] ==> public final val LocalVariableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'descriptor' @ [67:66] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [67:77] ==> public final val LocalVariableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [67:104] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [67:115] ==> public final val LocalVariableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'property' @ [69:5] ==> val property: PropertyDescriptorImpl defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[LocalVariableDescriptor]

'initialize' @ [69:14] ==> public open fun initialize(@Nullable p0: PropertyGetterDescriptorImpl?, @Nullable p1: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'descriptor' @ [70:13] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'getter' @ [70:24] ==> public open val getter: LocalVariableAccessorDescriptor.Getter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'run' @ [70:32] ==> @InlineOnly public inline fun <T, R> LocalVariableAccessorDescriptor.Getter.run(block: (LocalVariableAccessorDescriptor.Getter).() -> PropertyGetterDescriptorImpl): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Getter
    <R> -> PropertyGetterDescriptorImpl

'PropertyGetterDescriptorImpl' @ [71:17] ==> public constructor PropertyGetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertyGetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaClassConstructorDescriptor]

'property' @ [71:46] ==> val property: PropertyDescriptorImpl defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[LocalVariableDescriptor]

'annotations' @ [71:56] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableAccessorDescriptor.Getter[JavaPropertyDescriptor]

'modality' @ [71:69] ==> public final val LocalVariableAccessorDescriptor.Getter.modality: Modality[MyPropertyDescriptor]

'visibility' @ [71:79] ==> public final var LocalVariableAccessorDescriptor.Getter.visibility: Visibility[MyPropertyDescriptor]

'isExternal' @ [71:97] ==> public final var LocalVariableAccessorDescriptor.Getter.isExternal: Boolean[MyPropertyDescriptor]

'isInline' @ [71:109] ==> public final var LocalVariableAccessorDescriptor.Getter.isInline: Boolean[MyPropertyDescriptor]

'kind' @ [71:119] ==> public final val LocalVariableAccessorDescriptor.Getter.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'source' @ [71:131] ==> public final val LocalVariableAccessorDescriptor.Getter.source: SourceElement[MyPropertyDescriptor]

'apply' @ [71:139] ==> @InlineOnly public inline fun <T> PropertyGetterDescriptorImpl.apply(block: PropertyGetterDescriptorImpl.() -> Unit): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptorImpl

'initialize' @ [72:21] ==> public open fun initialize(p0: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'this@run' @ [72:32] ==> <this> defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'returnType' @ [72:41] ==> public final val LocalVariableAccessorDescriptor.Getter.returnType: KotlinType?[MyPropertyDescriptor]

'descriptor' @ [75:13] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[ValueParameterDescriptorImpl]

'setter' @ [75:24] ==> public open val setter: LocalVariableAccessorDescriptor.Setter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'run' @ [75:32] ==> @InlineOnly public inline fun <T, R> LocalVariableAccessorDescriptor.Setter.run(block: (LocalVariableAccessorDescriptor.Setter).() -> PropertySetterDescriptorImpl): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Setter
    <R> -> PropertySetterDescriptorImpl

'PropertySetterDescriptorImpl' @ [76:17] ==> public constructor PropertySetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertySetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaClassConstructorDescriptor]

'property' @ [76:46] ==> val property: PropertyDescriptorImpl defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[LocalVariableDescriptor]

'annotations' @ [76:56] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableAccessorDescriptor.Setter[JavaPropertyDescriptor]

'modality' @ [76:69] ==> public final val LocalVariableAccessorDescriptor.Setter.modality: Modality[MyPropertyDescriptor]

'visibility' @ [76:79] ==> public final var LocalVariableAccessorDescriptor.Setter.visibility: Visibility[MyPropertyDescriptor]

'isExternal' @ [76:97] ==> public final var LocalVariableAccessorDescriptor.Setter.isExternal: Boolean[MyPropertyDescriptor]

'isInline' @ [76:109] ==> public final var LocalVariableAccessorDescriptor.Setter.isInline: Boolean[MyPropertyDescriptor]

'kind' @ [76:119] ==> public final val LocalVariableAccessorDescriptor.Setter.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'source' @ [76:131] ==> public final val LocalVariableAccessorDescriptor.Setter.source: SourceElement[MyPropertyDescriptor]

'apply' @ [76:139] ==> @InlineOnly public inline fun <T> PropertySetterDescriptorImpl.apply(block: PropertySetterDescriptorImpl.() -> Unit): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptorImpl

'initialize' @ [77:21] ==> public open fun initialize(@NotNull p0: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaMethodDescriptor]

'this@run' @ [77:32] ==> <this> defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'valueParameters' @ [77:41] ==> public final val LocalVariableAccessorDescriptor.Setter.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'single' @ [77:57] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.single(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'createFreeDescriptor' @ [82:12] ==> private fun <D : CallableMemberDescriptor> createFreeDescriptor(descriptor: PropertyDescriptorImpl): PropertyDescriptorImpl defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> PropertyDescriptorImpl

'property' @ [82:33] ==> val property: PropertyDescriptorImpl defined in org.jetbrains.kotlin.codegen.createFreeFakeLocalPropertyDescriptor[LocalVariableDescriptor]

