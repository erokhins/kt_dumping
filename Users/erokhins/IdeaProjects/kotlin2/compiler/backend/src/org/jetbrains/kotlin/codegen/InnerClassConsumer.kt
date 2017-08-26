'if (defaultImpls) {
                if (DescriptorUtils.isLocal(descriptor)) return null
                val classDescriptorImpl = ClassDescriptorImpl(
                        descriptor, Name.identifier(JvmAbi.DEFAULT_IMPLS_CLASS_NAME),
                        Modality.FINAL, ClassKind.CLASS, Collections.emptyList(), SourceElement.NO_SOURCE,
                        /* isExternal = */ false)

                classDescriptorImpl.initialize(MemberScope.Empty, emptySet(), null)
                return classDescriptorImpl
            }
            else {
                return if (DescriptorUtils.isTopLevelDeclaration(descriptor)) null else descriptor
            }' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'defaultImpls' @ [36:17] ==> value-parameter defaultImpls: Boolean defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[ValueParameterDescriptorImpl]

'isLocal' @ [37:37] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [37:45] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[ValueParameterDescriptorImpl]

'ClassDescriptorImpl' @ [38:43] ==> public constructor ClassDescriptorImpl(@NotNull p0: DeclarationDescriptor, @NotNull p1: Name, @NotNull p2: Modality, @NotNull p3: ClassKind, @NotNull p4: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>), @NotNull p5: SourceElement, p6: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaClassConstructorDescriptor]

'descriptor' @ [39:25] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[ValueParameterDescriptorImpl]

'identifier' @ [39:42] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'DEFAULT_IMPLS_CLASS_NAME' @ [39:60] ==> public const final val DEFAULT_IMPLS_CLASS_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'Modality' @ [40:25] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [40:34] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'CLASS' @ [40:51] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'emptyList' @ [40:70] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'NO_SOURCE' @ [40:97] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'classDescriptorImpl' @ [43:17] ==> val classDescriptorImpl: ClassDescriptorImpl defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[LocalVariableDescriptor]

'initialize' @ [43:37] ==> public final fun initialize(@NotNull p0: MemberScope, @NotNull p1: (MutableSet<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>..Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>), @Nullable p2: ClassConstructorDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaMethodDescriptor]

'MemberScope' @ [43:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'Empty' @ [43:60] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'emptySet' @ [43:67] ==> public fun <T> emptySet(): Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'classDescriptorImpl' @ [44:24] ==> val classDescriptorImpl: ClassDescriptorImpl defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[LocalVariableDescriptor]

'if (DescriptorUtils.isTopLevelDeclaration(descriptor)) null else descriptor' @ [47:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'isTopLevelDeclaration' @ [47:44] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [47:66] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[ValueParameterDescriptorImpl]

'descriptor' @ [47:89] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion.classForInnerClassRecord[ValueParameterDescriptorImpl]

