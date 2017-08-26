'ValidationVisitor' @ [31:44] ==> protected/*protected and package*/ constructor ValidationVisitor() defined in org.jetbrains.kotlin.test.util.DescriptorValidator.ValidationVisitor[JavaClassConstructorDescriptor]

'super' @ [33:9] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.DeserializedScopeValidationVisitor[LazyClassReceiverParameterDescriptor]

'validateScope' @ [33:15] ==> protected/*protected and package*/ open fun validateScope(scopeOwner: (DeclarationDescriptor..DeclarationDescriptor?), @NotNull scope: MemberScope, @NotNull collector: DescriptorValidator.DiagnosticCollector): Unit defined in org.jetbrains.kotlin.test.util.DescriptorValidator.ValidationVisitor[JavaMethodDescriptor]

'scopeOwner' @ [33:29] ==> value-parameter scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.DeserializedScopeValidationVisitor.validateScope[ValueParameterDescriptorImpl]

'scope' @ [33:41] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.jvm.compiler.DeserializedScopeValidationVisitor.validateScope[ValueParameterDescriptorImpl]

'collector' @ [33:48] ==> value-parameter collector: DescriptorValidator.DiagnosticCollector defined in org.jetbrains.kotlin.jvm.compiler.DeserializedScopeValidationVisitor.validateScope[ValueParameterDescriptorImpl]

'validateDeserializedScope' @ [34:9] ==> private fun validateDeserializedScope(scopeOwner: DeclarationDescriptor, scope: MemberScope): Unit defined in org.jetbrains.kotlin.jvm.compiler in file DeserializedScopeValidationVisitor.kt[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [34:35] ==> value-parameter scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.DeserializedScopeValidationVisitor.validateScope[ValueParameterDescriptorImpl]

'scope' @ [34:47] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.jvm.compiler.DeserializedScopeValidationVisitor.validateScope[ValueParameterDescriptorImpl]

'scopeOwner' @ [39:30] ==> value-parameter scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[ValueParameterDescriptorImpl]

'scope' @ [40:9] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[ValueParameterDescriptorImpl]

'isPackageViewScope' @ [40:45] ==> val isPackageViewScope: Boolean defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[LocalVariableDescriptor]

'scope' @ [41:35] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [41:41] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filter' @ [41:69] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'member' @ [42:13] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [42:51] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [42:58] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [42:63] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'!' @ [42:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPackageViewScope' @ [42:75] ==> val isPackageViewScope: Boolean defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[LocalVariableDescriptor]

'member' @ [42:97] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope.<anonymous>[ValueParameterDescriptorImpl]

'checkSorted' @ [44:9] ==> private fun checkSorted(descriptors: Collection<DeclarationDescriptor>, declaration: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler in file DeserializedScopeValidationVisitor.kt[SimpleFunctionDescriptorImpl]

'relevantDescriptors' @ [44:21] ==> val relevantDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[LocalVariableDescriptor]

'scopeOwner' @ [44:42] ==> value-parameter scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.validateDeserializedScope[ValueParameterDescriptorImpl]

'descriptors' @ [49:26] ==> value-parameter descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.checkSorted[ValueParameterDescriptorImpl]

'filterNot' @ [49:38] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filterNot(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [49:50] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.checkSorted.<anonymous>[ValueParameterDescriptorImpl]

'assertOrderedEquals' @ [50:22] ==> public open fun <T : (Any..Any?)> assertOrderedEquals(erroMsg: (String..String?), actual: (MutableIterable<(DeclarationDescriptor..DeclarationDescriptor?)>..Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>?), expected: (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'declaration' @ [51:26] ==> value-parameter declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.checkSorted[ValueParameterDescriptorImpl]

'serializedOnly' @ [52:13] ==> val serializedOnly: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.checkSorted[LocalVariableDescriptor]

'serializedOnly' @ [53:13] ==> val serializedOnly: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.checkSorted[LocalVariableDescriptor]

'sortedWith' @ [53:28] ==> public fun <T> Iterable<DeclarationDescriptor>.sortedWith(comparator: Comparator<in DeclarationDescriptor> /* = Comparator<in DeclarationDescriptor> */): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'INSTANCE' @ [53:56] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

