'when (descriptor) {
            is FileClassDescriptor, is PackageFragmentDescriptor -> OwnerKind.PACKAGE
            is ClassDescriptor -> OwnerKind.IMPLEMENTATION
            else -> throw AssertionError("Unexpected declaration container: $this")
        }' @ [30:80] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OwnerKind, entry1: OwnerKind, entry2: OwnerKind): OwnerKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> OwnerKind

'descriptor' @ [30:86] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.OwnerKind.Companion.getMemberOwnerKind[ValueParameterDescriptorImpl]

'OwnerKind' @ [31:69] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'PACKAGE' @ [31:79] ==> enum entry PACKAGE defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'OwnerKind' @ [32:35] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'IMPLEMENTATION' @ [32:45] ==> enum entry IMPLEMENTATION defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'AssertionError' @ [33:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'this' @ [33:78] ==> <this> defined in org.jetbrains.kotlin.codegen.OwnerKind.Companion[LazyClassReceiverParameterDescriptor]

