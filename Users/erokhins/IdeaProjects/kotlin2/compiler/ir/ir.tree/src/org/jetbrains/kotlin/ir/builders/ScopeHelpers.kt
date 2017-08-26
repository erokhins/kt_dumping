'scopeOwner' @ [24:9] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

'AssertionError' @ [25:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'scopeOwner' @ [25:55] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

'assertCastOwner' @ [28:9] ==> public inline fun <reified T> Scope.assertCastOwner(): FunctionDescriptor defined in org.jetbrains.kotlin.ir.builders[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> FunctionDescriptor

'scopeOwner' @ [31:9] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

'let' @ [31:20] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> ClassDescriptor): ClassDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> ClassDescriptor

'when (it) {
                is ClassDescriptor -> it
                is MemberDescriptor -> it.containingDeclaration as ClassDescriptor
                else -> throw AssertionError("Unexpected scopeOwner: $scopeOwner")
            }' @ [32:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor, entry1: ClassDescriptor, entry2: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor

'it' @ [32:19] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.classOwner.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [33:39] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.classOwner.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [34:40] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.classOwner.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [34:43] ==> public final val MemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'AssertionError' @ [35:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'scopeOwner' @ [35:71] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

