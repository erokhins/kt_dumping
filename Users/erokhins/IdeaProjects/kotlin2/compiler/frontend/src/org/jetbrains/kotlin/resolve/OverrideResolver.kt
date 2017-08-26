'checkVisibility' @ [48:9] ==> private final fun checkVisibility(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'c' @ [48:25] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.OverrideResolver.check[ValueParameterDescriptorImpl]

'checkOverrides' @ [49:9] ==> private final fun checkOverrides(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'c' @ [49:24] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.OverrideResolver.check[ValueParameterDescriptorImpl]

'checkParameterOverridesForAllClasses' @ [50:9] ==> private final fun checkParameterOverridesForAllClasses(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'c' @ [50:46] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.OverrideResolver.check[ValueParameterDescriptorImpl]

'component1' @ [55:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>.component1(): (KtClassOrObject..KtClassOrObject?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <V> -> (org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes..org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes?)

'component2' @ [55:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>.component2(): (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <V> -> (org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes..org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes?)

'c' @ [55:30] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrides[ValueParameterDescriptorImpl]

'declaredClasses' @ [55:32] ==> public final val TopDownAnalysisContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'checkOverridesInAClass' @ [56:13] ==> private final fun checkOverridesInAClass(classDescriptor: ClassDescriptorWithResolutionScopes, klass: KtClassOrObject): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'value' @ [56:36] ==> val value: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrides[LocalVariableDescriptor]

'key' @ [56:43] ==> val key: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrides[LocalVariableDescriptor]

'classDescriptor' @ [62:24] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[ValueParameterDescriptorImpl]

'declaredCallableMembers' @ [62:40] ==> public final val ClassDescriptorWithResolutionScopes.declaredCallableMembers: Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>[MyPropertyDescriptor]

'checkOverrideForMember' @ [63:13] ==> private final fun checkOverrideForMember(declared: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'member' @ [63:36] ==> val member: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[LocalVariableDescriptor]

'CollectErrorInformationForInheritedMembersStrategy' @ [66:37] ==> public constructor CollectErrorInformationForInheritedMembersStrategy(klass: KtClassOrObject, classDescriptor: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[ClassConstructorDescriptorImpl]

'klass' @ [66:88] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[ValueParameterDescriptorImpl]

'classDescriptor' @ [66:95] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[ValueParameterDescriptorImpl]

'checkInheritedAndDelegatedSignatures' @ [68:9] ==> private final fun checkInheritedAndDelegatedSignatures(classDescriptor: ClassDescriptor, inheritedReportStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy, overrideReportStrategyForDelegates: OverrideResolver.CheckOverrideReportStrategy?): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [68:46] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[ValueParameterDescriptorImpl]

'inheritedMemberErrors' @ [68:63] ==> val inheritedMemberErrors: OverrideResolver.CollectErrorInformationForInheritedMembersStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[LocalVariableDescriptor]

'inheritedMemberErrors' @ [68:86] ==> val inheritedMemberErrors: OverrideResolver.CollectErrorInformationForInheritedMembersStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[LocalVariableDescriptor]

'inheritedMemberErrors' @ [69:9] ==> val inheritedMemberErrors: OverrideResolver.CollectErrorInformationForInheritedMembersStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesInAClass[LocalVariableDescriptor]

'doReportErrors' @ [69:31] ==> internal final fun doReportErrors(): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'LinkedHashSet' @ [82:31] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableMemberDescriptor

'shouldImplement' @ [85:13] ==> public final val shouldImplement: LinkedHashSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy[PropertyDescriptorImpl]

'add' @ [85:29] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [85:33] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy.abstractMemberNotImplemented[ValueParameterDescriptorImpl]

'shouldImplement' @ [93:13] ==> public final val shouldImplement: LinkedHashSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy[PropertyDescriptorImpl]

'add' @ [93:29] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [93:33] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy.multipleImplementationsMemberNotImplemented[ValueParameterDescriptorImpl]

'descriptor' @ [97:17] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy.conflictingInterfaceMemberNotImplemented[ValueParameterDescriptorImpl]

'modality' @ [97:28] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [97:41] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [97:50] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'shouldImplement' @ [98:17] ==> public final val shouldImplement: LinkedHashSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy[PropertyDescriptorImpl]

'add' @ [98:33] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [98:37] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy.conflictingInterfaceMemberNotImplemented[ValueParameterDescriptorImpl]

'shouldImplement' @ [107:13] ==> public final val shouldImplement: LinkedHashSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy[PropertyDescriptorImpl]

'add' @ [107:29] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'abstractMember' @ [107:33] ==> value-parameter abstractMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy.abstractMemberWithMoreSpecificType[ValueParameterDescriptorImpl]

'linkedSetOf' @ [116:38] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'linkedSetOf' @ [117:49] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'linkedSetOf' @ [118:47] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'linkedSetOf' @ [119:51] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'linkedSetOf' @ [120:46] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'SmartHashSet' @ [122:42] ==> public constructor SmartHashSet<T : (Any..Any?)>() defined in com.intellij.util.containers.SmartHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DiagnosticFactoryWithPsiElement<*, *>

'abstractNoImpl' @ [125:13] ==> private final val abstractNoImpl: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [125:28] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [125:32] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.abstractMemberNotImplemented[ValueParameterDescriptorImpl]

'abstractInBaseClassNoImpl' @ [129:13] ==> private final val abstractInBaseClassNoImpl: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [129:39] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [129:43] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.abstractBaseClassMemberNotImplemented[ValueParameterDescriptorImpl]

'multipleImplementations' @ [133:13] ==> private final val multipleImplementations: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [133:37] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [133:41] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.multipleImplementationsMemberNotImplemented[ValueParameterDescriptorImpl]

'conflictingInterfaceMembers' @ [137:13] ==> private final val conflictingInterfaceMembers: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [137:41] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [137:45] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.conflictingInterfaceMemberNotImplemented[ValueParameterDescriptorImpl]

'conflictingReturnTypes' @ [141:13] ==> private final val conflictingReturnTypes: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [141:36] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor1' @ [141:40] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'conflictingReturnTypes' @ [142:13] ==> private final val conflictingReturnTypes: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [142:36] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor2' @ [142:40] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'if (descriptor1 is PropertyDescriptor && descriptor2 is PropertyDescriptor) {
                if (descriptor1.isVar || descriptor2.isVar) {
                    reportInheritanceConflictIfRequired(VAR_TYPE_MISMATCH_ON_INHERITANCE, descriptor1, descriptor2)
                }
                else {
                    reportInheritanceConflictIfRequired(PROPERTY_TYPE_MISMATCH_ON_INHERITANCE, descriptor1, descriptor2)
                }
            }
            else {
                reportInheritanceConflictIfRequired(RETURN_TYPE_MISMATCH_ON_INHERITANCE, descriptor1, descriptor2)
            }' @ [144:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor1' @ [144:17] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'descriptor2' @ [144:54] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'if (descriptor1.isVar || descriptor2.isVar) {
                    reportInheritanceConflictIfRequired(VAR_TYPE_MISMATCH_ON_INHERITANCE, descriptor1, descriptor2)
                }
                else {
                    reportInheritanceConflictIfRequired(PROPERTY_TYPE_MISMATCH_ON_INHERITANCE, descriptor1, descriptor2)
                }' @ [145:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor1' @ [145:21] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'isVar' @ [145:33] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptor2' @ [145:42] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'isVar' @ [145:54] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'reportInheritanceConflictIfRequired' @ [146:21] ==> private final fun reportInheritanceConflictIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, descriptor1: CallableMemberDescriptor, descriptor2: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'VAR_TYPE_MISMATCH_ON_INHERITANCE' @ [146:57] ==> public final val VAR_TYPE_MISMATCH_ON_INHERITANCE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'descriptor1' @ [146:91] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'descriptor2' @ [146:104] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'reportInheritanceConflictIfRequired' @ [149:21] ==> private final fun reportInheritanceConflictIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, descriptor1: CallableMemberDescriptor, descriptor2: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'PROPERTY_TYPE_MISMATCH_ON_INHERITANCE' @ [149:57] ==> public final val PROPERTY_TYPE_MISMATCH_ON_INHERITANCE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'descriptor1' @ [149:96] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'descriptor2' @ [149:109] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'reportInheritanceConflictIfRequired' @ [153:17] ==> private final fun reportInheritanceConflictIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, descriptor1: CallableMemberDescriptor, descriptor2: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'RETURN_TYPE_MISMATCH_ON_INHERITANCE' @ [153:53] ==> public final val RETURN_TYPE_MISMATCH_ON_INHERITANCE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'descriptor1' @ [153:90] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'descriptor2' @ [153:103] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.typeMismatchOnInheritance[ValueParameterDescriptorImpl]

'typeMismatchOnInheritance' @ [158:13] ==> public open fun typeMismatchOnInheritance(descriptor1: CallableMemberDescriptor, descriptor2: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'abstractMember' @ [158:39] ==> value-parameter abstractMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.abstractMemberWithMoreSpecificType[ValueParameterDescriptorImpl]

'concreteMember' @ [158:55] ==> value-parameter concreteMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.abstractMemberWithMoreSpecificType[ValueParameterDescriptorImpl]

'!' @ [166:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'onceErrorsReported' @ [166:18] ==> private final val onceErrorsReported: SmartHashSet<DiagnosticFactoryWithPsiElement<*, *>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'contains' @ [166:37] ==> public open fun contains(@NotNull element: DiagnosticFactoryWithPsiElement<*, *>): Boolean defined in com.intellij.util.containers.SmartHashSet[JavaMethodDescriptor]

'diagnosticFactory' @ [166:46] ==> value-parameter diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportInheritanceConflictIfRequired[ValueParameterDescriptorImpl]

'onceErrorsReported' @ [167:17] ==> private final val onceErrorsReported: SmartHashSet<DiagnosticFactoryWithPsiElement<*, *>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [167:36] ==> public open fun add(@NotNull element: DiagnosticFactoryWithPsiElement<*, *>): Boolean defined in com.intellij.util.containers.SmartHashSet[JavaMethodDescriptor]

'diagnosticFactory' @ [167:40] ==> value-parameter diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportInheritanceConflictIfRequired[ValueParameterDescriptorImpl]

'trace' @ [168:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [168:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnosticFactory' @ [168:30] ==> value-parameter diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportInheritanceConflictIfRequired[ValueParameterDescriptorImpl]

'on' @ [168:48] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [168:51] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'descriptor1' @ [168:58] ==> value-parameter descriptor1: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportInheritanceConflictIfRequired[ValueParameterDescriptorImpl]

'descriptor2' @ [168:71] ==> value-parameter descriptor2: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportInheritanceConflictIfRequired[ValueParameterDescriptorImpl]

'reportDelegationProblemIfRequired' @ [173:13] ==> private final fun reportDelegationProblemIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, relevantDiagnosticFromInheritance: DiagnosticFactoryWithPsiElement<*, *>?, delegate: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'OVERRIDING_FINAL_MEMBER_BY_DELEGATION' @ [173:47] ==> public final val OVERRIDING_FINAL_MEMBER_BY_DELEGATION: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'overriding' @ [173:92] ==> value-parameter overriding: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.overridingFinalMember[ValueParameterDescriptorImpl]

'overridden' @ [173:104] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.overridingFinalMember[ValueParameterDescriptorImpl]

'reportDelegationProblemIfRequired' @ [180:13] ==> private final fun reportDelegationProblemIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, relevantDiagnosticFromInheritance: DiagnosticFactoryWithPsiElement<*, *>?, delegate: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'RETURN_TYPE_MISMATCH_BY_DELEGATION' @ [181:21] ==> public final val RETURN_TYPE_MISMATCH_BY_DELEGATION: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'RETURN_TYPE_MISMATCH_ON_INHERITANCE' @ [181:57] ==> public final val RETURN_TYPE_MISMATCH_ON_INHERITANCE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'overriding' @ [181:94] ==> value-parameter overriding: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.returnTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'overridden' @ [181:106] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.returnTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'reportDelegationProblemIfRequired' @ [188:13] ==> private final fun reportDelegationProblemIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, relevantDiagnosticFromInheritance: DiagnosticFactoryWithPsiElement<*, *>?, delegate: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'PROPERTY_TYPE_MISMATCH_BY_DELEGATION' @ [189:21] ==> public final val PROPERTY_TYPE_MISMATCH_BY_DELEGATION: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'PROPERTY_TYPE_MISMATCH_ON_INHERITANCE' @ [189:59] ==> public final val PROPERTY_TYPE_MISMATCH_ON_INHERITANCE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'overriding' @ [189:98] ==> value-parameter overriding: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.propertyTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'overridden' @ [189:110] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.propertyTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'reportDelegationProblemIfRequired' @ [193:13] ==> private final fun reportDelegationProblemIfRequired(diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor>, relevantDiagnosticFromInheritance: DiagnosticFactoryWithPsiElement<*, *>?, delegate: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[SimpleFunctionDescriptorImpl]

'VAR_OVERRIDDEN_BY_VAL_BY_DELEGATION' @ [193:47] ==> public final val VAR_OVERRIDDEN_BY_VAL_BY_DELEGATION: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'overriding' @ [193:90] ==> value-parameter overriding: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.varOverriddenByVal[ValueParameterDescriptorImpl]

'overridden' @ [193:102] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.varOverriddenByVal[ValueParameterDescriptorImpl]

'assert' @ [202:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'delegate' @ [202:20] ==> value-parameter delegate: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'kind' @ [202:29] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [202:37] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'+' @ [202:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'delegate' @ [202:79] ==> value-parameter delegate: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'delegate' @ [202:104] ==> value-parameter delegate: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'kind' @ [202:113] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'!' @ [204:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'onceErrorsReported' @ [204:18] ==> private final val onceErrorsReported: SmartHashSet<DiagnosticFactoryWithPsiElement<*, *>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'contains' @ [204:37] ==> public open fun contains(@NotNull element: DiagnosticFactoryWithPsiElement<*, *>): Boolean defined in com.intellij.util.containers.SmartHashSet[JavaMethodDescriptor]

'diagnosticFactory' @ [204:46] ==> value-parameter diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'relevantDiagnosticFromInheritance' @ [204:69] ==> value-parameter relevantDiagnosticFromInheritance: DiagnosticFactoryWithPsiElement<*, *>? defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'!' @ [204:114] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'onceErrorsReported' @ [204:115] ==> private final val onceErrorsReported: SmartHashSet<DiagnosticFactoryWithPsiElement<*, *>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'contains' @ [204:134] ==> public open fun contains(@NotNull element: DiagnosticFactoryWithPsiElement<*, *>): Boolean defined in com.intellij.util.containers.SmartHashSet[JavaMethodDescriptor]

'relevantDiagnosticFromInheritance' @ [204:143] ==> value-parameter relevantDiagnosticFromInheritance: DiagnosticFactoryWithPsiElement<*, *>? defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'onceErrorsReported' @ [205:17] ==> private final val onceErrorsReported: SmartHashSet<DiagnosticFactoryWithPsiElement<*, *>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'add' @ [205:36] ==> public open fun add(@NotNull element: DiagnosticFactoryWithPsiElement<*, *>): Boolean defined in com.intellij.util.containers.SmartHashSet[JavaMethodDescriptor]

'diagnosticFactory' @ [205:40] ==> value-parameter diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'trace' @ [206:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [206:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnosticFactory' @ [206:30] ==> value-parameter diagnosticFactory: DiagnosticFactory2<KtClassOrObject, CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'on' @ [206:48] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [206:51] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'delegate' @ [206:58] ==> value-parameter delegate: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'overridden' @ [206:68] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.reportDelegationProblemIfRequired[ValueParameterDescriptorImpl]

'classCanHaveAbstractMembers' @ [211:42] ==> public open fun classCanHaveAbstractMembers(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [211:70] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'if (abstractInBaseClassNoImpl.isNotEmpty() && !canHaveAbstractMembers) {
                trace.report(ABSTRACT_CLASS_MEMBER_NOT_IMPLEMENTED.on(klass, klass, abstractInBaseClassNoImpl.first()))
            }
            else if (abstractNoImpl.isNotEmpty() && !canHaveAbstractMembers) {
                trace.report(ABSTRACT_MEMBER_NOT_IMPLEMENTED.on(klass, klass, abstractNoImpl.first()))
            }' @ [212:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'abstractInBaseClassNoImpl' @ [212:17] ==> private final val abstractInBaseClassNoImpl: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'isNotEmpty' @ [212:43] ==> @InlineOnly public inline fun <T> Collection<CallableMemberDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'!' @ [212:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canHaveAbstractMembers' @ [212:60] ==> val canHaveAbstractMembers: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.doReportErrors[LocalVariableDescriptor]

'trace' @ [213:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [213:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_CLASS_MEMBER_NOT_IMPLEMENTED' @ [213:30] ==> public final val ABSTRACT_CLASS_MEMBER_NOT_IMPLEMENTED: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [213:68] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: KtClassOrObject, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [213:71] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'klass' @ [213:78] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'abstractInBaseClassNoImpl' @ [213:85] ==> private final val abstractInBaseClassNoImpl: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'first' @ [213:111] ==> public fun <T> Iterable<CallableMemberDescriptor>.first(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'abstractNoImpl' @ [215:22] ==> private final val abstractNoImpl: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'isNotEmpty' @ [215:37] ==> @InlineOnly public inline fun <T> Collection<CallableMemberDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'!' @ [215:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canHaveAbstractMembers' @ [215:54] ==> val canHaveAbstractMembers: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy.doReportErrors[LocalVariableDescriptor]

'trace' @ [216:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [216:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_MEMBER_NOT_IMPLEMENTED' @ [216:30] ==> public final val ABSTRACT_MEMBER_NOT_IMPLEMENTED: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [216:62] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: KtClassOrObject, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [216:65] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'klass' @ [216:72] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'abstractNoImpl' @ [216:79] ==> private final val abstractNoImpl: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'first' @ [216:94] ==> public fun <T> Iterable<CallableMemberDescriptor>.first(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'conflictingInterfaceMembers' @ [219:13] ==> private final val conflictingInterfaceMembers: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'removeAll' @ [219:41] ==> public open fun removeAll(elements: Collection<CallableMemberDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'conflictingReturnTypes' @ [219:51] ==> private final val conflictingReturnTypes: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'multipleImplementations' @ [220:13] ==> private final val multipleImplementations: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'removeAll' @ [220:37] ==> public open fun removeAll(elements: Collection<CallableMemberDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'conflictingReturnTypes' @ [220:47] ==> private final val conflictingReturnTypes: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'if (!conflictingInterfaceMembers.isEmpty()) {
                trace.report(MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED.on(klass, klass, conflictingInterfaceMembers.iterator().next()))
            }
            else if (!multipleImplementations.isEmpty()) {
                trace.report(MANY_IMPL_MEMBER_NOT_IMPLEMENTED.on(klass, klass, multipleImplementations.iterator().next()))
            }' @ [221:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [221:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conflictingInterfaceMembers' @ [221:18] ==> private final val conflictingInterfaceMembers: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'isEmpty' @ [221:46] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'trace' @ [222:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [222:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED' @ [222:30] ==> public final val MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [222:69] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: KtClassOrObject, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [222:72] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'klass' @ [222:79] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'conflictingInterfaceMembers' @ [222:86] ==> private final val conflictingInterfaceMembers: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'iterator' @ [222:114] ==> public open fun iterator(): MutableIterator<CallableMemberDescriptor> defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'next' @ [222:125] ==> public abstract fun next(): CallableMemberDescriptor defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'!' @ [224:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'multipleImplementations' @ [224:23] ==> private final val multipleImplementations: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'isEmpty' @ [224:47] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'trace' @ [225:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [225:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MANY_IMPL_MEMBER_NOT_IMPLEMENTED' @ [225:30] ==> public final val MANY_IMPL_MEMBER_NOT_IMPLEMENTED: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [225:63] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: KtClassOrObject, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [225:66] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'klass' @ [225:73] ==> private final val klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'multipleImplementations' @ [225:80] ==> private final val multipleImplementations: LinkedHashSet<CallableMemberDescriptor> /* = LinkedHashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectErrorInformationForInheritedMembersStrategy[PropertyDescriptorImpl]

'iterator' @ [225:104] ==> public open fun iterator(): MutableIterator<CallableMemberDescriptor> defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'next' @ [225:115] ==> public abstract fun next(): CallableMemberDescriptor defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'declared' @ [243:13] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'kind' @ [243:22] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'SYNTHESIZED' @ [243:60] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DataClassDescriptorResolver' @ [244:17] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'isComponentLike' @ [244:45] ==> public final fun isComponentLike(name: Name): Boolean defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'declared' @ [244:61] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'name' @ [244:70] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'checkOverrideForComponentFunction' @ [245:17] ==> private final fun checkOverrideForComponentFunction(componentFunction: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'declared' @ [245:51] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'declared' @ [250:13] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'kind' @ [250:22] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [250:60] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DescriptorToSourceUtils' @ [254:22] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [254:46] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'declared' @ [254:70] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'IllegalStateException' @ [254:112] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [254:134] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declared' @ [254:191] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'member' @ [256:28] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'modifierList' @ [256:35] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [257:31] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'modifierList' @ [257:55] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'hasModifier' @ [257:68] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [257:89] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declared' @ [258:37] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [258:46] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'if (hasOverrideNode) {
            checkOverridesForMemberMarkedOverride(declared, object : CheckOverrideReportForDeclaredMemberStrategy {
                private var finalOverriddenError = false
                private var typeMismatchError = false
                private var kindMismatchError = false

                override fun overridingFinalMember(overriding: CallableMemberDescriptor, overridden: CallableMemberDescriptor) {
                    if (!finalOverriddenError) {
                        finalOverriddenError = true
                        trace.report(OVERRIDING_FINAL_MEMBER.on(member, overridden, overridden.containingDeclaration))
                    }
                }

                override fun returnTypeMismatchOnOverride(overriding: CallableMemberDescriptor, overridden: CallableMemberDescriptor) {
                    if (!typeMismatchError) {
                        typeMismatchError = true
                        trace.report(RETURN_TYPE_MISMATCH_ON_OVERRIDE.on(member, declared, overridden))
                    }
                }

                override fun propertyTypeMismatchOnOverride(overriding: PropertyDescriptor, overridden: PropertyDescriptor) {
                    if (!typeMismatchError) {
                        typeMismatchError = true
                        if (overridden.isVar) {
                            trace.report(VAR_TYPE_MISMATCH_ON_OVERRIDE.on(member, declared, overridden))
                        }
                        else {
                            trace.report(PROPERTY_TYPE_MISMATCH_ON_OVERRIDE.on(member, declared, overridden))
                        }
                    }
                }

                override fun varOverriddenByVal(overriding: CallableMemberDescriptor, overridden: CallableMemberDescriptor) {
                    if (!kindMismatchError) {
                        kindMismatchError = true
                        trace.report(VAR_OVERRIDDEN_BY_VAL.on(member, declared as PropertyDescriptor, overridden as PropertyDescriptor))
                    }
                }

                override fun cannotOverrideInvisibleMember(overriding: CallableMemberDescriptor, invisibleOverridden: CallableMemberDescriptor) {
                    trace.report(CANNOT_OVERRIDE_INVISIBLE_MEMBER.on(member, declared, invisibleOverridden))
                }

                override fun nothingToOverride(overriding: CallableMemberDescriptor) {
                    trace.report(NOTHING_TO_OVERRIDE.on(member, declared))
                }
            })
        }
        else if (!overriddenDescriptors.isEmpty() && !overridesBackwardCompatibilityHelper.overrideCanBeOmitted(declared)) {
            val overridden = overriddenDescriptors.iterator().next()
            trace.report(VIRTUAL_MEMBER_HIDDEN.on(member, declared, overridden, overridden.containingDeclaration))
        }' @ [260:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'hasOverrideNode' @ [260:13] ==> val hasOverrideNode: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'checkOverridesForMemberMarkedOverride' @ [261:13] ==> private final fun checkOverridesForMemberMarkedOverride(declared: CallableMemberDescriptor, reportError: OverrideResolver.CheckOverrideReportForDeclaredMemberStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'declared' @ [261:51] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'!' @ [267:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'finalOverriddenError' @ [267:26] ==> private final var finalOverriddenError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'finalOverriddenError' @ [268:25] ==> private final var finalOverriddenError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'trace' @ [269:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [269:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'OVERRIDING_FINAL_MEMBER' @ [269:38] ==> public final val OVERRIDING_FINAL_MEMBER: (DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [269:62] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull a: CallableMemberDescriptor, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'member' @ [269:65] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'overridden' @ [269:73] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.overridingFinalMember[ValueParameterDescriptorImpl]

'overridden' @ [269:85] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.overridingFinalMember[ValueParameterDescriptorImpl]

'containingDeclaration' @ [269:96] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [274:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeMismatchError' @ [274:26] ==> private final var typeMismatchError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'typeMismatchError' @ [275:25] ==> private final var typeMismatchError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'trace' @ [276:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [276:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RETURN_TYPE_MISMATCH_ON_OVERRIDE' @ [276:38] ==> public final val RETURN_TYPE_MISMATCH_ON_OVERRIDE: (DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [276:71] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'member' @ [276:74] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [276:82] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overridden' @ [276:92] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.returnTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'!' @ [281:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeMismatchError' @ [281:26] ==> private final var typeMismatchError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'typeMismatchError' @ [282:25] ==> private final var typeMismatchError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'if (overridden.isVar) {
                            trace.report(VAR_TYPE_MISMATCH_ON_OVERRIDE.on(member, declared, overridden))
                        }
                        else {
                            trace.report(PROPERTY_TYPE_MISMATCH_ON_OVERRIDE.on(member, declared, overridden))
                        }' @ [283:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'overridden' @ [283:29] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.propertyTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'isVar' @ [283:40] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'trace' @ [284:29] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [284:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'VAR_TYPE_MISMATCH_ON_OVERRIDE' @ [284:42] ==> public final val VAR_TYPE_MISMATCH_ON_OVERRIDE: (DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [284:72] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'member' @ [284:75] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [284:83] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overridden' @ [284:93] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.propertyTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'trace' @ [287:29] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [287:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PROPERTY_TYPE_MISMATCH_ON_OVERRIDE' @ [287:42] ==> public final val PROPERTY_TYPE_MISMATCH_ON_OVERRIDE: (DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [287:77] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'member' @ [287:80] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [287:88] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overridden' @ [287:98] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.propertyTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'!' @ [293:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kindMismatchError' @ [293:26] ==> private final var kindMismatchError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'kindMismatchError' @ [294:25] ==> private final var kindMismatchError: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>[PropertyDescriptorImpl]

'trace' @ [295:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [295:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'VAR_OVERRIDDEN_BY_VAL' @ [295:38] ==> public final val VAR_OVERRIDDEN_BY_VAL: (DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (PropertyDescriptor..PropertyDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>..DiagnosticFactory2<(KtNamedDeclaration..KtNamedDeclaration?), (PropertyDescriptor..PropertyDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [295:60] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull a: PropertyDescriptor, @NotNull b: PropertyDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'member' @ [295:63] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [295:71] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overridden' @ [295:103] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.varOverriddenByVal[ValueParameterDescriptorImpl]

'trace' @ [300:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [300:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CANNOT_OVERRIDE_INVISIBLE_MEMBER' @ [300:34] ==> public final val CANNOT_OVERRIDE_INVISIBLE_MEMBER: (DiagnosticFactory2<(KtModifierListOwner..KtModifierListOwner?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory2<(KtModifierListOwner..KtModifierListOwner?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [300:67] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableDescriptor): ParametrizedDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'member' @ [300:70] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [300:78] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'invisibleOverridden' @ [300:88] ==> value-parameter invisibleOverridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember.<no name provided>.cannotOverrideInvisibleMember[ValueParameterDescriptorImpl]

'trace' @ [304:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [304:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NOTHING_TO_OVERRIDE' @ [304:34] ==> public final val NOTHING_TO_OVERRIDE: (DiagnosticFactory1<(KtModifierListOwner..KtModifierListOwner?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory1<(KtModifierListOwner..KtModifierListOwner?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [304:54] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner, @NotNull argument: CallableMemberDescriptor): ParametrizedDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'member' @ [304:57] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [304:65] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'!' @ [308:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overriddenDescriptors' @ [308:19] ==> val overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'isEmpty' @ [308:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'!' @ [308:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overridesBackwardCompatibilityHelper' @ [308:55] ==> private final val overridesBackwardCompatibilityHelper: OverridesBackwardCompatibilityHelper defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'overrideCanBeOmitted' @ [308:92] ==> public abstract fun overrideCanBeOmitted(overridingDescriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverridesBackwardCompatibilityHelper[SimpleFunctionDescriptorImpl]

'declared' @ [308:113] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [309:30] ==> val overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'iterator' @ [309:52] ==> public abstract fun iterator(): MutableIterator<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'next' @ [309:63] ==> public abstract fun next(): (CallableMemberDescriptor..CallableMemberDescriptor?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'trace' @ [310:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [310:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'VIRTUAL_MEMBER_HIDDEN' @ [310:26] ==> public final val VIRTUAL_MEMBER_HIDDEN: (DiagnosticFactory3<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtNamedDeclaration..KtNamedDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [310:48] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull a: CallableMemberDescriptor, @NotNull b: CallableMemberDescriptor, @NotNull c: DeclarationDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'member' @ [310:51] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'declared' @ [310:59] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[ValueParameterDescriptorImpl]

'overridden' @ [310:69] ==> val overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'overridden' @ [310:81] ==> val overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForMember[LocalVariableDescriptor]

'containingDeclaration' @ [310:92] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'findDataModifierForDataClass' @ [315:28] ==> private final fun findDataModifierForDataClass(dataClass: DeclarationDescriptor): PsiElement defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'componentFunction' @ [315:57] ==> value-parameter componentFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[ValueParameterDescriptorImpl]

'containingDeclaration' @ [315:75] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'checkOverridesForMember' @ [317:9] ==> private final fun checkOverridesForMember(memberDescriptor: CallableMemberDescriptor, overriddenDescriptors: Collection<CallableMemberDescriptor>, reportError: OverrideResolver.CheckOverrideReportStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'componentFunction' @ [317:33] ==> value-parameter componentFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[ValueParameterDescriptorImpl]

'componentFunction' @ [317:52] ==> value-parameter componentFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [317:70] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'!' @ [321:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overrideConflict' @ [321:22] ==> private final var overrideConflict: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction.<no name provided>[PropertyDescriptorImpl]

'overrideConflict' @ [322:21] ==> private final var overrideConflict: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction.<no name provided>[PropertyDescriptorImpl]

'trace' @ [323:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [323:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DATA_CLASS_OVERRIDE_CONFLICT' @ [323:34] ==> public final val DATA_CLASS_OVERRIDE_CONFLICT: (DiagnosticFactory2<(PsiElement..PsiElement?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [323:63] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: CallableMemberDescriptor, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'dataModifier' @ [323:66] ==> val dataModifier: PsiElement defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[LocalVariableDescriptor]

'componentFunction' @ [323:80] ==> value-parameter componentFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[ValueParameterDescriptorImpl]

'overridden' @ [323:99] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction.<no name provided>.overridingFinalMember[ValueParameterDescriptorImpl]

'containingDeclaration' @ [323:110] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [328:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overrideConflict' @ [328:22] ==> private final var overrideConflict: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction.<no name provided>[PropertyDescriptorImpl]

'overrideConflict' @ [329:21] ==> private final var overrideConflict: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction.<no name provided>[PropertyDescriptorImpl]

'trace' @ [330:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [330:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DATA_CLASS_OVERRIDE_CONFLICT' @ [330:34] ==> public final val DATA_CLASS_OVERRIDE_CONFLICT: (DiagnosticFactory2<(PsiElement..PsiElement?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [330:63] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: CallableMemberDescriptor, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'dataModifier' @ [330:66] ==> val dataModifier: PsiElement defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[LocalVariableDescriptor]

'componentFunction' @ [330:80] ==> value-parameter componentFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction[ValueParameterDescriptorImpl]

'overridden' @ [330:99] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverrideForComponentFunction.<no name provided>.returnTypeMismatchOnOverride[ValueParameterDescriptorImpl]

'containingDeclaration' @ [330:110] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'IllegalStateException' @ [335:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [339:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'c' @ [345:33] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkParameterOverridesForAllClasses[ValueParameterDescriptorImpl]

'declaredClasses' @ [345:35] ==> public final val TopDownAnalysisContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'values' @ [345:51] ==> public abstract val values: MutableCollection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'iterator' @ [346:28] ==> public abstract fun iterator(): MutableIterator<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'getAllDescriptors' @ [346:44] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [346:62] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkParameterOverridesForAllClasses[LocalVariableDescriptor]

'defaultType' @ [346:78] ==> public final val ClassDescriptorWithResolutionScopes.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [346:90] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'member' @ [347:21] ==> val member: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkParameterOverridesForAllClasses[LocalVariableDescriptor]

'checkOverridesForParameters' @ [348:21] ==> private final fun checkOverridesForParameters(declared: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'member' @ [348:49] ==> val member: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkParameterOverridesForAllClasses[LocalVariableDescriptor]

'declared' @ [355:29] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[ValueParameterDescriptorImpl]

'kind' @ [355:38] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [355:76] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'isDeclaration' @ [356:13] ==> val isDeclaration: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [358:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [358:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'declared' @ [358:79] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[ValueParameterDescriptorImpl]

'declaration' @ [359:17] ==> val declaration: KtModifierListOwner? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'!' @ [359:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [359:41] ==> val declaration: KtModifierListOwner? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'hasModifier' @ [359:53] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [359:74] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declared' @ [369:39] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [369:48] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameterFromSubclass' @ [371:45] ==> val parameterFromSubclass: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'overriddenDescriptors' @ [371:67] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'parameterFromSuperclass' @ [372:21] ==> val parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'declaresDefaultValue' @ [372:45] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'defaultsInSuper' @ [373:21] ==> var defaultsInSuper: Int defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'defaultsInSuper' @ [376:43] ==> var defaultsInSuper: Int defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'if (isDeclaration) {
                checkNameAndDefaultForDeclaredParameter(parameterFromSubclass, multipleDefaultsInSuper)
            }
            else {
                checkNameAndDefaultForFakeOverrideParameter(declared, parameterFromSubclass, multipleDefaultsInSuper)
            }' @ [378:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDeclaration' @ [378:17] ==> val isDeclaration: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'checkNameAndDefaultForDeclaredParameter' @ [379:17] ==> private final fun checkNameAndDefaultForDeclaredParameter(descriptor: ValueParameterDescriptor, multipleDefaultsInSuper: Boolean): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'parameterFromSubclass' @ [379:57] ==> val parameterFromSubclass: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'multipleDefaultsInSuper' @ [379:80] ==> val multipleDefaultsInSuper: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'checkNameAndDefaultForFakeOverrideParameter' @ [382:17] ==> private final fun checkNameAndDefaultForFakeOverrideParameter(containingFunction: CallableMemberDescriptor, descriptor: ValueParameterDescriptor, multipleDefaultsInSuper: Boolean): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'declared' @ [382:61] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[ValueParameterDescriptorImpl]

'parameterFromSubclass' @ [382:71] ==> val parameterFromSubclass: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'multipleDefaultsInSuper' @ [382:94] ==> val multipleDefaultsInSuper: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkOverridesForParameters[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [388:25] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [388:49] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [388:73] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'error' @ [388:104] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [388:110] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [388:152] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'descriptor' @ [390:13] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [390:24] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'trace' @ [391:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [391:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DEFAULT_VALUE_NOT_ALLOWED_IN_OVERRIDE' @ [391:26] ==> public final val DEFAULT_VALUE_NOT_ALLOWED_IN_OVERRIDE: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [391:64] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'parameter' @ [391:67] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[LocalVariableDescriptor]

'multipleDefaultsInSuper' @ [394:13] ==> value-parameter multipleDefaultsInSuper: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'trace' @ [395:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [395:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MULTIPLE_DEFAULTS_INHERITED_FROM_SUPERTYPES' @ [395:26] ==> public final val MULTIPLE_DEFAULTS_INHERITED_FROM_SUPERTYPES: (DiagnosticFactory1<(KtParameter..KtParameter?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [395:70] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull argument: ValueParameterDescriptor): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'parameter' @ [395:73] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[LocalVariableDescriptor]

'descriptor' @ [395:84] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'descriptor' @ [398:41] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [398:52] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'shouldReportParameterNameOverrideWarning' @ [399:17] ==> public final fun shouldReportParameterNameOverrideWarning(parameterFromSubclass: ValueParameterDescriptor, parameterFromSuperclass: ValueParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [399:58] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[ValueParameterDescriptorImpl]

'parameterFromSuperclass' @ [399:70] ==> val parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[LocalVariableDescriptor]

'trace' @ [401:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [401:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PARAMETER_NAME_CHANGED_ON_OVERRIDE' @ [401:30] ==> public final val PARAMETER_NAME_CHANGED_ON_OVERRIDE: (DiagnosticFactory2<(KtParameter..KtParameter?), (ClassDescriptor..ClassDescriptor?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..DiagnosticFactory2<(KtParameter..KtParameter?), (ClassDescriptor..ClassDescriptor?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [401:65] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull a: ClassDescriptor, @NotNull b: ValueParameterDescriptor): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'parameter' @ [402:25] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[LocalVariableDescriptor]

'parameterFromSuperclass' @ [403:25] ==> val parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[LocalVariableDescriptor]

'containingDeclaration' @ [403:49] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [403:71] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'parameterFromSuperclass' @ [404:25] ==> val parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForDeclaredParameter[LocalVariableDescriptor]

'containingFunction' @ [415:31] ==> value-parameter containingFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[ValueParameterDescriptorImpl]

'containingDeclaration' @ [415:50] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'DescriptorToSourceUtils' @ [416:28] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [416:52] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'containingClass' @ [416:76] ==> val containingClass: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[LocalVariableDescriptor]

'error' @ [416:116] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [416:122] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [416:160] ==> val containingClass: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[LocalVariableDescriptor]

'multipleDefaultsInSuper' @ [418:13] ==> value-parameter multipleDefaultsInSuper: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[ValueParameterDescriptorImpl]

'trace' @ [419:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [419:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MULTIPLE_DEFAULTS_INHERITED_FROM_SUPERTYPES_WHEN_NO_EXPLICIT_OVERRIDE' @ [419:26] ==> public final val MULTIPLE_DEFAULTS_INHERITED_FROM_SUPERTYPES_WHEN_NO_EXPLICIT_OVERRIDE: (DiagnosticFactory1<(KtClassOrObject..KtClassOrObject?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..DiagnosticFactory1<(KtClassOrObject..KtClassOrObject?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [419:96] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull argument: ValueParameterDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'classElement' @ [419:99] ==> val classElement: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[LocalVariableDescriptor]

'descriptor' @ [419:113] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[ValueParameterDescriptorImpl]

'descriptor' @ [422:41] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [422:52] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'shouldReportParameterNameOverrideWarning' @ [423:17] ==> public final fun shouldReportParameterNameOverrideWarning(parameterFromSubclass: ValueParameterDescriptor, parameterFromSuperclass: ValueParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [423:58] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[ValueParameterDescriptorImpl]

'parameterFromSuperclass' @ [423:70] ==> val parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[LocalVariableDescriptor]

'trace' @ [424:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [424:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES' @ [424:30] ==> public final val DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?), (Int..Int?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?), (Int..Int?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [424:83] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull b: Int): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'classElement' @ [425:25] ==> val classElement: KtClassOrObject defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[LocalVariableDescriptor]

'containingFunction' @ [426:25] ==> value-parameter containingFunction: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [426:44] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'parameterFromSuperclass' @ [427:25] ==> val parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkNameAndDefaultForFakeOverrideParameter[LocalVariableDescriptor]

'index' @ [427:49] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'component1' @ [434:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>.component1(): (KtCallableDeclaration..KtCallableDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)
    <V> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'component2' @ [434:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>.component2(): (CallableMemberDescriptor..CallableMemberDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)
    <V> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'c' @ [434:30] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[ValueParameterDescriptorImpl]

'members' @ [434:32] ==> public final val TopDownAnalysisContext.members: (MutableMap<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..Map<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'checkVisibilityForMember' @ [435:13] ==> private final fun checkVisibilityForMember(declaration: KtDeclaration, memberDescriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'key' @ [435:38] ==> val key: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'value' @ [435:43] ==> val value: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'key' @ [436:17] ==> val key: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'value' @ [436:38] ==> val value: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'key' @ [437:30] ==> val key: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'setter' @ [437:34] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'value' @ [438:40] ==> val value: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'setter' @ [438:46] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [439:21] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'setterDescriptor' @ [439:39] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'checkVisibilityForMember' @ [440:21] ==> private final fun checkVisibilityForMember(declaration: KtDeclaration, memberDescriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'setter' @ [440:46] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'setterDescriptor' @ [440:54] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibility[LocalVariableDescriptor]

'memberDescriptor' @ [447:26] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[ValueParameterDescriptorImpl]

'visibility' @ [447:43] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'memberDescriptor' @ [448:28] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [448:45] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'compare' @ [449:40] ==> @Nullable public open fun compare(@NotNull p0: Visibility, @NotNull p1: Visibility): Int? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'visibility' @ [449:48] ==> val visibility: Visibility defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'descriptor' @ [449:60] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'visibility' @ [449:71] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'if (compare == null) {
                trace.report(CANNOT_CHANGE_ACCESS_PRIVILEGE.on(declaration, descriptor.visibility, descriptor, descriptor.containingDeclaration))
                return
            }
            else if (compare < 0) {
                trace.report(CANNOT_WEAKEN_ACCESS_PRIVILEGE.on(declaration, descriptor.visibility, descriptor, descriptor.containingDeclaration))
                return
            }' @ [450:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'compare' @ [450:17] ==> val compare: Int? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'trace' @ [451:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [451:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CANNOT_CHANGE_ACCESS_PRIVILEGE' @ [451:30] ==> public final val CANNOT_CHANGE_ACCESS_PRIVILEGE: (DiagnosticFactory3<(KtModifierListOwner..KtModifierListOwner?), (Visibility..Visibility?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtModifierListOwner..KtModifierListOwner?), (Visibility..Visibility?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [451:61] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner, @NotNull a: Visibility, @NotNull b: CallableMemberDescriptor, @NotNull c: DeclarationDescriptor): ParametrizedDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'declaration' @ [451:64] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[ValueParameterDescriptorImpl]

'descriptor' @ [451:77] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'visibility' @ [451:88] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [451:100] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'descriptor' @ [451:112] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'containingDeclaration' @ [451:123] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'compare' @ [454:22] ==> val compare: Int? defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'trace' @ [455:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver[PropertyDescriptorImpl]

'report' @ [455:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CANNOT_WEAKEN_ACCESS_PRIVILEGE' @ [455:30] ==> public final val CANNOT_WEAKEN_ACCESS_PRIVILEGE: (DiagnosticFactory3<(KtModifierListOwner..KtModifierListOwner?), (Visibility..Visibility?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtModifierListOwner..KtModifierListOwner?), (Visibility..Visibility?), (CallableMemberDescriptor..CallableMemberDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [455:61] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner, @NotNull a: Visibility, @NotNull b: CallableMemberDescriptor, @NotNull c: DeclarationDescriptor): ParametrizedDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'declaration' @ [455:64] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[ValueParameterDescriptorImpl]

'descriptor' @ [455:77] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'visibility' @ [455:88] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [455:100] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'descriptor' @ [455:112] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.checkVisibilityForMember[LocalVariableDescriptor]

'containingDeclaration' @ [455:123] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptors' @ [467:32] ==> value-parameter descriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.resolveUnknownVisibilities[ValueParameterDescriptorImpl]

'resolveUnknownVisibilityForMember' @ [468:32] ==> public open fun resolveUnknownVisibilityForMember(@NotNull p0: CallableMemberDescriptor, @Nullable p1: (((CallableMemberDescriptor..CallableMemberDescriptor?)) -> (Unit..Unit?))?): Unit defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'descriptor' @ [468:66] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.resolveUnknownVisibilities[LocalVariableDescriptor]

'createCannotInferVisibilityReporter' @ [468:78] ==> public final fun createCannotInferVisibilityReporter(trace: BindingTrace): (CallableMemberDescriptor) -> Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'trace' @ [468:114] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.resolveUnknownVisibilities[ValueParameterDescriptorImpl]

'when {
                    descriptor.kind == FAKE_OVERRIDE || descriptor.kind == DELEGATION ->
                        DescriptorUtils.getContainingClass(descriptor) ?: throw AssertionError("Class member expected: $descriptor")
                    descriptor is PropertyAccessorDescriptor && descriptor.isDefault ->
                        descriptor.correspondingProperty
                    else ->
                        descriptor
                }' @ [474:55] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor, entry2: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'descriptor' @ [475:21] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'kind' @ [475:32] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [475:40] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [475:57] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'kind' @ [475:68] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [475:76] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'?:' @ [476:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'getContainingClass' @ [476:41] ==> @Nullable public open fun getContainingClass(@NotNull p0: DeclarationDescriptor): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [476:60] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'AssertionError' @ [476:81] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [476:121] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'descriptor' @ [477:21] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'descriptor' @ [477:65] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'isDefault' @ [477:76] ==> public final val PropertyAccessorDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'descriptor' @ [478:25] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'correspondingProperty' @ [478:36] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'descriptor' @ [480:25] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [483:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [483:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'reportOn' @ [483:79] ==> val reportOn: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[LocalVariableDescriptor]

'element' @ [484:21] ==> val element: PsiElement? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[LocalVariableDescriptor]

'trace' @ [485:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter[ValueParameterDescriptorImpl]

'report' @ [485:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CANNOT_INFER_VISIBILITY' @ [485:34] ==> public final val CANNOT_INFER_VISIBILITY: (DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [485:58] ==> @NotNull public open fun on(@NotNull element: KtDeclaration, @NotNull argument: CallableMemberDescriptor): ParametrizedDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [485:61] ==> val element: PsiElement? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[LocalVariableDescriptor]

'descriptor' @ [485:70] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.createCannotInferVisibilityReporter.<no name provided>[ValueParameterDescriptorImpl]

'Unit' @ [487:24] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'CollectMissingImplementationsStrategy' @ [492:29] ==> public constructor CollectMissingImplementationsStrategy() defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy[ClassConstructorDescriptorImpl]

'checkInheritedAndDelegatedSignatures' @ [493:13] ==> private final fun checkInheritedAndDelegatedSignatures(classDescriptor: ClassDescriptor, inheritedReportStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy, overrideReportStrategyForDelegates: OverrideResolver.CheckOverrideReportStrategy?): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [493:50] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getMissingImplementations[ValueParameterDescriptorImpl]

'collector' @ [493:67] ==> val collector: OverrideResolver.CollectMissingImplementationsStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getMissingImplementations[LocalVariableDescriptor]

'collector' @ [494:20] ==> val collector: OverrideResolver.CollectMissingImplementationsStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getMissingImplementations[LocalVariableDescriptor]

'shouldImplement' @ [494:30] ==> public final val shouldImplement: LinkedHashSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.CollectMissingImplementationsStrategy[PropertyDescriptorImpl]

'iterator' @ [502:28] ==> public abstract fun iterator(): MutableIterator<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'getAllDescriptors' @ [502:44] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [502:62] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'defaultType' @ [502:78] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [502:90] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'member' @ [503:21] ==> val member: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'checkInheritedAndDelegatedSignatures' @ [504:21] ==> private final fun checkInheritedAndDelegatedSignatures(descriptor: CallableMemberDescriptor, reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy, overrideReportStrategyForDelegates: OverrideResolver.CheckOverrideReportStrategy?): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'member' @ [504:58] ==> val member: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'inheritedReportStrategy' @ [504:66] ==> value-parameter inheritedReportStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'overrideReportStrategyForDelegates' @ [504:91] ==> value-parameter overrideReportStrategyForDelegates: OverrideResolver.CheckOverrideReportStrategy? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'descriptor' @ [514:24] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'kind' @ [514:35] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'kind' @ [515:17] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'FAKE_OVERRIDE' @ [515:25] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'kind' @ [515:42] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'DELEGATION' @ [515:50] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [516:17] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'visibility' @ [516:28] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INVISIBLE_FAKE' @ [516:56] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'descriptor' @ [518:36] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [518:47] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'assert' @ [519:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [519:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'directOverridden' @ [519:21] ==> val directOverridden: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'isEmpty' @ [519:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'kind' @ [519:51] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'toString' @ [519:56] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [519:75] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'name' @ [519:86] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [519:91] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'collectOverriddenDeclarations' @ [524:56] ==> private final fun collectOverriddenDeclarations(directOverriddenDescriptors: Collection<CallableMemberDescriptor>): MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'directOverridden' @ [524:86] ==> val directOverridden: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'flatten' @ [526:59] ==> @NotNull @Contract public open fun <E : (Any..Any?)> flatten(@NotNull p0: (MutableIterable<(MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..Iterable<(MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>)): (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overriddenDeclarationsByDirectParent' @ [526:67] ==> val overriddenDeclarationsByDirectParent: MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'values' @ [526:104] ==> public abstract val values: MutableCollection<Set<CallableMemberDescriptor>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'filterOutOverridden' @ [527:68] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> filterOutOverridden(@NotNull p0: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'newLinkedHashSet' @ [528:26] ==> public open fun <E : (Any..Any?)> newLinkedHashSet(p0: (MutableIterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)): (LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'allOverriddenDeclarations' @ [528:43] ==> val allOverriddenDeclarations: (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'getRelevantDirectlyOverridden' @ [530:46] ==> private final fun getRelevantDirectlyOverridden(overriddenByParent: MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>>, allFilteredOverriddenDeclarations: Set<CallableMemberDescriptor>): Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'overriddenDeclarationsByDirectParent' @ [530:76] ==> val overriddenDeclarationsByDirectParent: MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'allFilteredOverriddenDeclarations' @ [530:114] ==> val allFilteredOverriddenDeclarations: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'checkInheritedDescriptorsGroup' @ [532:13] ==> private final fun checkInheritedDescriptorsGroup(descriptor: CallableMemberDescriptor, overriddenDescriptors: Collection<CallableMemberDescriptor>, reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [532:44] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'relevantDirectlyOverridden' @ [532:56] ==> val relevantDirectlyOverridden: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'reportingStrategy' @ [532:84] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'kind' @ [534:17] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'DELEGATION' @ [534:25] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'overrideReportStrategyForDelegates' @ [534:39] ==> value-parameter overrideReportStrategyForDelegates: OverrideResolver.CheckOverrideReportStrategy? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'checkOverridesForMember' @ [535:17] ==> private final fun checkOverridesForMember(memberDescriptor: CallableMemberDescriptor, overriddenDescriptors: Collection<CallableMemberDescriptor>, reportError: OverrideResolver.CheckOverrideReportStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [535:41] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'relevantDirectlyOverridden' @ [535:53] ==> val relevantDirectlyOverridden: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'overrideReportStrategyForDelegates' @ [535:81] ==> value-parameter overrideReportStrategyForDelegates: OverrideResolver.CheckOverrideReportStrategy? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'kind' @ [538:17] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'DELEGATION' @ [538:25] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'checkMissingOverridesByJava8Restrictions' @ [539:17] ==> private final fun checkMissingOverridesByJava8Restrictions(relevantDirectlyOverridden: Set<CallableMemberDescriptor>, reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'relevantDirectlyOverridden' @ [539:58] ==> val relevantDirectlyOverridden: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'reportingStrategy' @ [539:86] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'component1' @ [542:18] ==> public final operator fun component1(): List<CallableMemberDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [542:38] ==> public final operator fun component2(): List<CallableMemberDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'relevantDirectlyOverridden' @ [542:60] ==> val relevantDirectlyOverridden: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'filter' @ [543:22] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'!' @ [543:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOrOverridesSynthesized' @ [543:32] ==> public fun isOrOverridesSynthesized(descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [543:57] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures.<anonymous>[ValueParameterDescriptorImpl]

'partition' @ [544:22] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.partition(predicate: (CallableMemberDescriptor) -> Boolean): Pair<List<CallableMemberDescriptor>, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [544:34] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [544:37] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [544:58] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'concreteOverridden' @ [546:38] ==> val concreteOverridden: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'size' @ [546:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when (numImplementations) {
                0 ->
                    if (kind != DELEGATION) {
                        abstractOverridden.forEach {
                            reportingStrategy.abstractMemberNotImplemented(it)
                        }
                    }
                1 ->
                    if (kind != DELEGATION) {
                        val implementation = concreteOverridden.first()
                        collectAbstractMethodsWithMoreSpecificReturnType(abstractOverridden, implementation).forEach {
                            reportingStrategy.abstractMemberWithMoreSpecificType(it, implementation)
                        }
                    }
                else ->
                    concreteOverridden.forEach {
                        reportingStrategy.multipleImplementationsMemberNotImplemented(it)
                    }
            }' @ [548:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'numImplementations' @ [548:19] ==> val numImplementations: Int defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'kind' @ [550:25] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'DELEGATION' @ [550:33] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'abstractOverridden' @ [551:25] ==> val abstractOverridden: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'forEach' @ [551:44] ==> @HidesMembers public inline fun <T> Iterable<CallableMemberDescriptor>.forEach(action: (CallableMemberDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'reportingStrategy' @ [552:29] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'abstractMemberNotImplemented' @ [552:47] ==> public abstract fun abstractMemberNotImplemented(descriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'it' @ [552:76] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [556:25] ==> val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'DELEGATION' @ [556:33] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'concreteOverridden' @ [557:46] ==> val concreteOverridden: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'first' @ [557:65] ==> public fun <T> List<CallableMemberDescriptor>.first(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'collectAbstractMethodsWithMoreSpecificReturnType' @ [558:25] ==> private final fun collectAbstractMethodsWithMoreSpecificReturnType(abstractOverridden: List<CallableMemberDescriptor>, implementation: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'abstractOverridden' @ [558:74] ==> val abstractOverridden: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'implementation' @ [558:94] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'forEach' @ [558:110] ==> @HidesMembers public inline fun <T> Iterable<CallableMemberDescriptor>.forEach(action: (CallableMemberDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'reportingStrategy' @ [559:29] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'abstractMemberWithMoreSpecificType' @ [559:47] ==> public abstract fun abstractMemberWithMoreSpecificType(abstractMember: CallableMemberDescriptor, concreteMember: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'it' @ [559:82] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures.<anonymous>[ValueParameterDescriptorImpl]

'implementation' @ [559:86] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'concreteOverridden' @ [563:21] ==> val concreteOverridden: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[LocalVariableDescriptor]

'forEach' @ [563:40] ==> @HidesMembers public inline fun <T> Iterable<CallableMemberDescriptor>.forEach(action: (CallableMemberDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'reportingStrategy' @ [564:25] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures[ValueParameterDescriptorImpl]

'multipleImplementationsMemberNotImplemented' @ [564:43] ==> public abstract fun multipleImplementationsMemberNotImplemented(descriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'it' @ [564:87] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedAndDelegatedSignatures.<anonymous>[ValueParameterDescriptorImpl]

'SmartList' @ [582:46] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableMemberDescriptor

'relevantDirectlyOverridden' @ [583:32] ==> value-parameter relevantDirectlyOverridden: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[ValueParameterDescriptorImpl]

'overridden' @ [584:45] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'containingDeclaration' @ [584:56] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [585:21] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'if (containingDeclaration.kind == ClassKind.CLASS) {
                        overridesClassMember = true
                        if (overridden.modality === Modality.ABSTRACT) {
                            overridesAbstractInBaseClass = overridden
                        }
                    }
                    else if (containingDeclaration.kind == ClassKind.INTERFACE) {
                        overriddenInterfaceMembers.add(overridden)
                        if (overridden.modality !== Modality.ABSTRACT) {
                            overridesNonAbstractInterfaceMember = true
                        }
                    }' @ [586:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containingDeclaration' @ [586:25] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'kind' @ [586:47] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [586:65] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'overridesClassMember' @ [587:25] ==> var overridesClassMember: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'overridden' @ [588:29] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'modality' @ [588:40] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [588:53] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [588:62] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'overridesAbstractInBaseClass' @ [589:29] ==> var overridesAbstractInBaseClass: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'overridden' @ [589:60] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'containingDeclaration' @ [592:30] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'kind' @ [592:52] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [592:70] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'overriddenInterfaceMembers' @ [593:25] ==> val overriddenInterfaceMembers: SmartList<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'add' @ [593:52] ==> public open fun add(element: (CallableMemberDescriptor..CallableMemberDescriptor?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'overridden' @ [593:56] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'overridden' @ [594:29] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'modality' @ [594:40] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [594:53] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [594:62] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'overridesNonAbstractInterfaceMember' @ [595:29] ==> var overridesNonAbstractInterfaceMember: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'overridesAbstractInBaseClass' @ [601:17] ==> var overridesAbstractInBaseClass: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'reportingStrategy' @ [602:17] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[ValueParameterDescriptorImpl]

'abstractBaseClassMemberNotImplemented' @ [602:35] ==> public abstract fun abstractBaseClassMemberNotImplemented(descriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'overridesAbstractInBaseClass' @ [602:73] ==> var overridesAbstractInBaseClass: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'!' @ [604:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overridesClassMember' @ [604:18] ==> var overridesClassMember: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'overridesNonAbstractInterfaceMember' @ [604:42] ==> var overridesNonAbstractInterfaceMember: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'overriddenInterfaceMembers' @ [604:81] ==> val overriddenInterfaceMembers: SmartList<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'size' @ [604:108] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'overriddenInterfaceMembers' @ [605:32] ==> val overriddenInterfaceMembers: SmartList<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'reportingStrategy' @ [606:21] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[ValueParameterDescriptorImpl]

'conflictingInterfaceMemberNotImplemented' @ [606:39] ==> public abstract fun conflictingInterfaceMemberNotImplemented(descriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'member' @ [606:80] ==> val member: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkMissingOverridesByJava8Restrictions[LocalVariableDescriptor]

'abstractOverridden' @ [615:17] ==> value-parameter abstractOverridden: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectAbstractMethodsWithMoreSpecificReturnType[ValueParameterDescriptorImpl]

'filter' @ [615:36] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'!' @ [615:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReturnTypeOkForOverride' @ [615:64] ==> private final fun isReturnTypeOkForOverride(superDescriptor: CallableDescriptor, subDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'abstractMember' @ [615:90] ==> value-parameter abstractMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectAbstractMethodsWithMoreSpecificReturnType.<anonymous>[ValueParameterDescriptorImpl]

'implementation' @ [615:106] ==> value-parameter implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectAbstractMethodsWithMoreSpecificReturnType[ValueParameterDescriptorImpl]

'overriddenByParent' @ [651:28] ==> value-parameter overriddenByParent: MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[ValueParameterDescriptorImpl]

'entries' @ [651:47] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<CallableMemberDescriptor, Set<CallableMemberDescriptor>>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'iterator' @ [651:55] ==> public abstract fun iterator(): MutableIterator<MutableMap.MutableEntry<CallableMemberDescriptor, Set<CallableMemberDescriptor>>> defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'iterator' @ [652:20] ==> val iterator: MutableIterator<MutableMap.MutableEntry<CallableMemberDescriptor, Set<CallableMemberDescriptor>>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[LocalVariableDescriptor]

'hasNext' @ [652:29] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'!' @ [653:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRelevant' @ [653:22] ==> private final fun isRelevant(declarationSet: Set<CallableMemberDescriptor>, allDeclarationSets: Collection<Set<CallableMemberDescriptor>>, allFilteredOverriddenDeclarations: Set<CallableMemberDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'iterator' @ [653:33] ==> val iterator: MutableIterator<MutableMap.MutableEntry<CallableMemberDescriptor, Set<CallableMemberDescriptor>>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[LocalVariableDescriptor]

'next' @ [653:42] ==> public abstract fun next(): MutableMap.MutableEntry<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'value' @ [653:49] ==> public abstract val value: Set<CallableMemberDescriptor> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'overriddenByParent' @ [653:56] ==> value-parameter overriddenByParent: MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[ValueParameterDescriptorImpl]

'values' @ [653:75] ==> public abstract val values: MutableCollection<Set<CallableMemberDescriptor>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'allFilteredOverriddenDeclarations' @ [653:83] ==> value-parameter allFilteredOverriddenDeclarations: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[ValueParameterDescriptorImpl]

'iterator' @ [654:21] ==> val iterator: MutableIterator<MutableMap.MutableEntry<CallableMemberDescriptor, Set<CallableMemberDescriptor>>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[LocalVariableDescriptor]

'remove' @ [654:30] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'overriddenByParent' @ [657:20] ==> value-parameter overriddenByParent: MutableMap<CallableMemberDescriptor, Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.getRelevantDirectlyOverridden[ValueParameterDescriptorImpl]

'keys' @ [657:39] ==> public abstract val keys: MutableSet<CallableMemberDescriptor> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'allDeclarationSets' @ [665:30] ==> value-parameter allDeclarationSets: Collection<Set<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[ValueParameterDescriptorImpl]

'otherSet' @ [666:21] ==> val otherSet: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[LocalVariableDescriptor]

'declarationSet' @ [666:34] ==> value-parameter declarationSet: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[ValueParameterDescriptorImpl]

'otherSet' @ [667:21] ==> val otherSet: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[LocalVariableDescriptor]

'containsAll' @ [667:30] ==> public abstract fun containsAll(elements: Collection<CallableMemberDescriptor>): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'declarationSet' @ [667:42] ==> value-parameter declarationSet: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[ValueParameterDescriptorImpl]

'disjoint' @ [668:33] ==> public open fun disjoint(p0: (MutableCollection<*>..Collection<*>?), p1: (MutableCollection<*>..Collection<*>?)): Boolean defined in java.util.Collections[JavaMethodDescriptor]

'allFilteredOverriddenDeclarations' @ [668:42] ==> value-parameter allFilteredOverriddenDeclarations: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[ValueParameterDescriptorImpl]

'declarationSet' @ [668:77] ==> value-parameter declarationSet: Set<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isRelevant[ValueParameterDescriptorImpl]

'newLinkedHashMap' @ [676:61] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> newLinkedHashMap(): (LinkedHashMap<(CallableMemberDescriptor..CallableMemberDescriptor?), (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)>..LinkedHashMap<(CallableMemberDescriptor..CallableMemberDescriptor?), (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)>?) defined in com.google.common.collect.Maps[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> CallableMemberDescriptor
    <V : (Any..Any?)> -> Set<CallableMemberDescriptor>

'directOverriddenDescriptors' @ [677:32] ==> value-parameter directOverriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[ValueParameterDescriptorImpl]

'getOverriddenDeclarations' @ [678:61] ==> @NotNull public open fun getOverriddenDeclarations(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'descriptor' @ [678:87] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[LocalVariableDescriptor]

'filterOutOverridden' @ [679:56] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> filterOutOverridden(@NotNull p0: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overriddenDeclarations' @ [679:76] ==> val overriddenDeclarations: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[LocalVariableDescriptor]

'overriddenDeclarationsByDirectParent' @ [680:17] ==> val overriddenDeclarationsByDirectParent: (LinkedHashMap<(CallableMemberDescriptor..CallableMemberDescriptor?), (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)>..LinkedHashMap<(CallableMemberDescriptor..CallableMemberDescriptor?), (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)>?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[LocalVariableDescriptor]

'put' @ [680:54] ==> public open fun put(key: (CallableMemberDescriptor..CallableMemberDescriptor?), value: (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)): Set<CallableMemberDescriptor>? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'descriptor' @ [680:58] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[LocalVariableDescriptor]

'LinkedHashSet' @ [680:70] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'filteredOverrides' @ [680:84] ==> val filteredOverrides: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[LocalVariableDescriptor]

'overriddenDeclarationsByDirectParent' @ [682:20] ==> val overriddenDeclarationsByDirectParent: (LinkedHashMap<(CallableMemberDescriptor..CallableMemberDescriptor?), (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)>..LinkedHashMap<(CallableMemberDescriptor..CallableMemberDescriptor?), (Set<CallableMemberDescriptor>..Set<CallableMemberDescriptor>?)>?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.collectOverriddenDeclarations[LocalVariableDescriptor]

'overriddenDescriptors' @ [690:17] ==> value-parameter overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'size' @ [690:39] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'descriptor' @ [692:38] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [694:42] ==> value-parameter overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'if (propertyDescriptor != null) {
                    val overriddenPropertyDescriptor = overriddenDescriptor.assertedCast<PropertyDescriptor> { "$overriddenDescriptor is not a property" }
                    if (!isPropertyTypeOkForOverride(overriddenPropertyDescriptor, propertyDescriptor)) {
                        reportingStrategy.typeMismatchOnInheritance(propertyDescriptor, overriddenPropertyDescriptor)
                    }
                }
                else {
                    if (!isReturnTypeOkForOverride(overriddenDescriptor, descriptor)) {
                        reportingStrategy.typeMismatchOnInheritance(descriptor, overriddenDescriptor)
                    }
                }' @ [695:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'propertyDescriptor' @ [695:21] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'overriddenDescriptor' @ [696:56] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'assertedCast' @ [696:77] ==> public inline fun <reified T : Any> Any?.assertedCast(message: () -> String): PropertyDescriptor defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PropertyDescriptor

'overriddenDescriptor' @ [696:114] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'!' @ [697:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPropertyTypeOkForOverride' @ [697:26] ==> private final fun isPropertyTypeOkForOverride(superDescriptor: PropertyDescriptor, subDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'overriddenPropertyDescriptor' @ [697:54] ==> val overriddenPropertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'propertyDescriptor' @ [697:84] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'reportingStrategy' @ [698:25] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'typeMismatchOnInheritance' @ [698:43] ==> public abstract fun typeMismatchOnInheritance(descriptor1: CallableMemberDescriptor, descriptor2: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [698:69] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'overriddenPropertyDescriptor' @ [698:89] ==> val overriddenPropertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'!' @ [702:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReturnTypeOkForOverride' @ [702:26] ==> private final fun isReturnTypeOkForOverride(superDescriptor: CallableDescriptor, subDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'overriddenDescriptor' @ [702:52] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'descriptor' @ [702:74] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'reportingStrategy' @ [703:25] ==> value-parameter reportingStrategy: OverrideResolver.CheckInheritedSignaturesReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'typeMismatchOnInheritance' @ [703:43] ==> public abstract fun typeMismatchOnInheritance(descriptor1: CallableMemberDescriptor, descriptor2: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckInheritedSignaturesReportStrategy[SimpleFunctionDescriptorImpl]

'descriptor' @ [703:69] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[ValueParameterDescriptorImpl]

'overriddenDescriptor' @ [703:81] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkInheritedDescriptorsGroup[LocalVariableDescriptor]

'declared' @ [713:41] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [713:50] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'checkOverridesForMember' @ [715:13] ==> private final fun checkOverridesForMember(memberDescriptor: CallableMemberDescriptor, overriddenDescriptors: Collection<CallableMemberDescriptor>, reportError: OverrideResolver.CheckOverrideReportStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'declared' @ [715:37] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [715:47] ==> val overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'reportError' @ [715:70] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportForDeclaredMemberStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [717:17] ==> val overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'isEmpty' @ [717:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'declared' @ [718:45] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'containingDeclaration' @ [718:54] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [719:38] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'assertedCast' @ [719:60] ==> public inline fun <reified T : Any> Any?.assertedCast(message: () -> String): ClassDescriptor defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ClassDescriptor

'declared' @ [720:70] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'containingDeclaration' @ [720:91] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'findInvisibleOverriddenDescriptor' @ [723:53] ==> private final fun findInvisibleOverriddenDescriptor(declared: CallableMemberDescriptor, declaringClass: ClassDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'declared' @ [723:87] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'declaringClass' @ [723:97] ==> val declaringClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'if (invisibleOverriddenDescriptor != null) {
                    reportError.cannotOverrideInvisibleMember(declared, invisibleOverriddenDescriptor)
                }
                else {
                    reportError.nothingToOverride(declared)
                }' @ [724:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'invisibleOverriddenDescriptor' @ [724:21] ==> val invisibleOverriddenDescriptor: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'reportError' @ [725:21] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportForDeclaredMemberStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'cannotOverrideInvisibleMember' @ [725:33] ==> public abstract fun cannotOverrideInvisibleMember(overriding: CallableMemberDescriptor, invisibleOverridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckOverrideReportForDeclaredMemberStrategy[SimpleFunctionDescriptorImpl]

'declared' @ [725:63] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'invisibleOverriddenDescriptor' @ [725:73] ==> val invisibleOverriddenDescriptor: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[LocalVariableDescriptor]

'reportError' @ [728:21] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportForDeclaredMemberStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'nothingToOverride' @ [728:33] ==> public abstract fun nothingToOverride(overriding: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckOverrideReportForDeclaredMemberStrategy[SimpleFunctionDescriptorImpl]

'declared' @ [728:51] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMemberMarkedOverride[ValueParameterDescriptorImpl]

'if (memberDescriptor is PropertyDescriptor) memberDescriptor else null' @ [738:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyDescriptor?, elseBranch: PropertyDescriptor?): PropertyDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyDescriptor?

'memberDescriptor' @ [738:48] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'memberDescriptor' @ [738:88] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [740:32] ==> value-parameter overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'overridden' @ [741:21] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'modality' @ [741:32] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [741:53] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'reportError' @ [742:21] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'overridingFinalMember' @ [742:33] ==> public abstract fun overridingFinalMember(overriding: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckOverrideReportStrategy[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [742:55] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'overridden' @ [742:73] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'if (propertyMemberDescriptor != null) {
                    val overriddenProperty = overridden.assertedCast<PropertyDescriptor> {
                        "$overridden is overridden by property $propertyMemberDescriptor"
                    }
                    if (!isPropertyTypeOkForOverride(overriddenProperty, propertyMemberDescriptor)) {
                        reportError.propertyTypeMismatchOnOverride(propertyMemberDescriptor, overriddenProperty)
                    }
                }
                else if (!isReturnTypeOkForOverride(overridden, memberDescriptor)) {
                    reportError.returnTypeMismatchOnOverride(memberDescriptor, overridden)
                }' @ [745:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'propertyMemberDescriptor' @ [745:21] ==> val propertyMemberDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'overridden' @ [746:46] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'assertedCast' @ [746:57] ==> public inline fun <reified T : Any> Any?.assertedCast(message: () -> String): PropertyDescriptor defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PropertyDescriptor

'overridden' @ [747:27] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'propertyMemberDescriptor' @ [747:65] ==> val propertyMemberDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'!' @ [749:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPropertyTypeOkForOverride' @ [749:26] ==> private final fun isPropertyTypeOkForOverride(superDescriptor: PropertyDescriptor, subDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'overriddenProperty' @ [749:54] ==> val overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'propertyMemberDescriptor' @ [749:74] ==> val propertyMemberDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'reportError' @ [750:25] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'propertyTypeMismatchOnOverride' @ [750:37] ==> public abstract fun propertyTypeMismatchOnOverride(overriding: PropertyDescriptor, overridden: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckOverrideReportStrategy[SimpleFunctionDescriptorImpl]

'propertyMemberDescriptor' @ [750:68] ==> val propertyMemberDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'overriddenProperty' @ [750:94] ==> val overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'!' @ [753:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReturnTypeOkForOverride' @ [753:27] ==> private final fun isReturnTypeOkForOverride(superDescriptor: CallableDescriptor, subDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'overridden' @ [753:53] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'memberDescriptor' @ [753:65] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'reportError' @ [754:21] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'returnTypeMismatchOnOverride' @ [754:33] ==> public abstract fun returnTypeMismatchOnOverride(overriding: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckOverrideReportStrategy[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [754:62] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'overridden' @ [754:80] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'checkPropertyKind' @ [757:21] ==> private final fun checkPropertyKind(descriptor: CallableMemberDescriptor, isVar: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'overridden' @ [757:39] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'checkPropertyKind' @ [757:60] ==> private final fun checkPropertyKind(descriptor: CallableMemberDescriptor, isVar: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [757:78] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'reportError' @ [758:21] ==> value-parameter reportError: OverrideResolver.CheckOverrideReportStrategy defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'varOverriddenByVal' @ [758:33] ==> public abstract fun varOverriddenByVal(overriding: CallableMemberDescriptor, overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.CheckOverrideReportStrategy[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [758:52] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[ValueParameterDescriptorImpl]

'overridden' @ [758:70] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkOverridesForMember[LocalVariableDescriptor]

'prepareTypeSubstitutor' @ [767:35] ==> private final fun prepareTypeSubstitutor(superDescriptor: CallableDescriptor, subDescriptor: CallableDescriptor): TypeSubstitutor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'superDescriptor' @ [767:58] ==> value-parameter superDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[ValueParameterDescriptorImpl]

'subDescriptor' @ [767:75] ==> value-parameter subDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[ValueParameterDescriptorImpl]

'superDescriptor' @ [769:35] ==> value-parameter superDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[ValueParameterDescriptorImpl]

'returnType' @ [769:51] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'subDescriptor' @ [771:33] ==> value-parameter subDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[ValueParameterDescriptorImpl]

'returnType' @ [771:47] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'typeSubstitutor' @ [773:46] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[LocalVariableDescriptor]

'substitute' @ [773:62] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'superReturnType' @ [773:73] ==> val superReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[LocalVariableDescriptor]

'OUT_VARIANCE' @ [773:99] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'DEFAULT' @ [775:38] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [775:46] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'subReturnType' @ [775:58] ==> val subReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[LocalVariableDescriptor]

'substitutedSuperReturnType' @ [775:73] ==> val substitutedSuperReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isReturnTypeOkForOverride[LocalVariableDescriptor]

'superDescriptor' @ [782:39] ==> value-parameter superDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[ValueParameterDescriptorImpl]

'typeParameters' @ [782:55] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'subDescriptor' @ [783:37] ==> value-parameter subDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[ValueParameterDescriptorImpl]

'typeParameters' @ [783:51] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'subTypeParameters' @ [784:17] ==> val subTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'size' @ [784:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'superTypeParameters' @ [784:43] ==> val superTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'size' @ [784:63] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ArrayList' @ [786:29] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeProjection

'subTypeParameters' @ [786:55] ==> val subTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'size' @ [786:73] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'superTypeParameters' @ [787:23] ==> val superTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'indices' @ [787:43] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'arguments' @ [788:17] ==> val arguments: ArrayList<TypeProjection> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'add' @ [788:27] ==> public open fun add(element: TypeProjection): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'TypeProjectionImpl' @ [788:31] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'subTypeParameters' @ [788:50] ==> val subTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'i' @ [788:68] ==> val i: Int defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'defaultType' @ [788:71] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'IndexedParametersSubstitution' @ [791:20] ==> public constructor IndexedParametersSubstitution(parameters: List<TypeParameterDescriptor>, argumentsList: List<TypeProjection>) defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[DeserializedClassConstructorDescriptor]

'superTypeParameters' @ [791:50] ==> val superTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'arguments' @ [791:71] ==> val arguments: ArrayList<TypeProjection> defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.prepareTypeSubstitutor[LocalVariableDescriptor]

'buildSubstitutor' @ [791:82] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[DeserializedSimpleFunctionDescriptor]

'prepareTypeSubstitutor' @ [798:35] ==> private final fun prepareTypeSubstitutor(superDescriptor: CallableDescriptor, subDescriptor: CallableDescriptor): TypeSubstitutor? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'superDescriptor' @ [798:58] ==> value-parameter superDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[ValueParameterDescriptorImpl]

'subDescriptor' @ [798:75] ==> value-parameter subDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[ValueParameterDescriptorImpl]

'typeSubstitutor' @ [800:46] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[LocalVariableDescriptor]

'substitute' @ [800:62] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'superDescriptor' @ [800:73] ==> value-parameter superDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[ValueParameterDescriptorImpl]

'type' @ [800:89] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'OUT_VARIANCE' @ [800:104] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'if (superDescriptor.isVar) {
                KotlinTypeChecker.DEFAULT.equalTypes(subDescriptor.type, substitutedSuperReturnType)
            }
            else {
                KotlinTypeChecker.DEFAULT.isSubtypeOf(subDescriptor.type, substitutedSuperReturnType)
            }' @ [802:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'superDescriptor' @ [802:24] ==> value-parameter superDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[ValueParameterDescriptorImpl]

'isVar' @ [802:40] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'DEFAULT' @ [803:35] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [803:43] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'subDescriptor' @ [803:54] ==> value-parameter subDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[ValueParameterDescriptorImpl]

'type' @ [803:68] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'substitutedSuperReturnType' @ [803:74] ==> val substitutedSuperReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[LocalVariableDescriptor]

'DEFAULT' @ [806:35] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [806:43] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'subDescriptor' @ [806:55] ==> value-parameter subDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[ValueParameterDescriptorImpl]

'type' @ [806:69] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'substitutedSuperReturnType' @ [806:75] ==> val substitutedSuperReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.isPropertyTypeOkForOverride[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [811:36] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [811:60] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'dataClass' @ [811:84] ==> value-parameter dataClass: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findDataModifierForDataClass[ValueParameterDescriptorImpl]

'classDeclaration' @ [812:17] ==> val classDeclaration: KtClassOrObject? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findDataModifierForDataClass[LocalVariableDescriptor]

'modifierList' @ [812:35] ==> public final val KtClassOrObject.modifierList: KtModifierList?[MyPropertyDescriptor]

'classDeclaration' @ [813:32] ==> val classDeclaration: KtClassOrObject? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findDataModifierForDataClass[LocalVariableDescriptor]

'modifierList' @ [813:49] ==> public final val KtClassOrObject.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [813:64] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'DATA_KEYWORD' @ [813:85] ==> public final val DATA_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifier' @ [814:21] ==> val modifier: PsiElement? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findDataModifierForDataClass[LocalVariableDescriptor]

'modifier' @ [815:28] ==> val modifier: PsiElement? defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findDataModifierForDataClass[LocalVariableDescriptor]

'IllegalStateException' @ [819:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [819:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'dataClass' @ [819:87] ==> value-parameter dataClass: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findDataModifierForDataClass[ValueParameterDescriptorImpl]

'declaringClass' @ [826:31] ==> value-parameter declaringClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[ValueParameterDescriptorImpl]

'typeConstructor' @ [826:46] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [826:62] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'newLinkedHashSet' @ [827:32] ==> public open fun <E : (Any..Any?)> newLinkedHashSet(): (LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableMemberDescriptor

'all' @ [828:17] ==> val all: (LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'addAll' @ [828:21] ==> public open fun addAll(elements: Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'supertype' @ [828:28] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'memberScope' @ [828:38] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [828:50] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'declared' @ [828:74] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[ValueParameterDescriptorImpl]

'name' @ [828:83] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_OVERRIDES' @ [828:106] ==> enum entry WHEN_CHECK_OVERRIDES defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'all' @ [829:17] ==> val all: (LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'addAll' @ [829:21] ==> public open fun addAll(elements: Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'supertype' @ [829:28] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'memberScope' @ [829:38] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedVariables' @ [829:50] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'declared' @ [829:74] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[ValueParameterDescriptorImpl]

'name' @ [829:83] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_OVERRIDES' @ [829:106] ==> enum entry WHEN_CHECK_OVERRIDES defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'all' @ [830:35] ==> val all: (LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..LinkedHashSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'==' @ [831:25] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [831:40] ==> public final val DEFAULT: (OverridingUtil..OverridingUtil?) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaPropertyDescriptor]

'isOverridableBy' @ [831:48] ==> @NotNull public open fun isOverridableBy(@NotNull p0: CallableDescriptor, @NotNull p1: CallableDescriptor, @Nullable p2: ClassDescriptor?): OverridingUtil.OverrideCompatibilityInfo defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'fromSuper' @ [831:64] ==> val fromSuper: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'declared' @ [831:75] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[ValueParameterDescriptorImpl]

'result' @ [831:91] ==> public final val OverridingUtil.OverrideCompatibilityInfo.result: OverridingUtil.OverrideCompatibilityInfo.Result[MyPropertyDescriptor]

'OVERRIDABLE' @ [831:101] ==> enum entry OVERRIDABLE defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'isVisibleForOverride' @ [832:44] ==> public open fun isVisibleForOverride(@NotNull p0: MemberDescriptor, @NotNull p1: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'declared' @ [832:65] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[ValueParameterDescriptorImpl]

'fromSuper' @ [832:75] ==> val fromSuper: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'IllegalStateException' @ [833:35] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [833:57] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fromSuper' @ [833:73] ==> val fromSuper: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'declared' @ [833:109] ==> value-parameter declared: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[ValueParameterDescriptorImpl]

'fromSuper' @ [836:32] ==> val fromSuper: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.findInvisibleOverriddenDescriptor[LocalVariableDescriptor]

'parameterFromSubclass' @ [847:20] ==> value-parameter parameterFromSubclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.shouldReportParameterNameOverrideWarning[ValueParameterDescriptorImpl]

'containingDeclaration' @ [847:42] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'hasStableParameterNames' @ [847:64] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'parameterFromSuperclass' @ [848:20] ==> value-parameter parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.shouldReportParameterNameOverrideWarning[ValueParameterDescriptorImpl]

'containingDeclaration' @ [848:44] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'hasStableParameterNames' @ [848:66] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'parameterFromSuperclass' @ [849:20] ==> value-parameter parameterFromSuperclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.shouldReportParameterNameOverrideWarning[ValueParameterDescriptorImpl]

'name' @ [849:44] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'parameterFromSubclass' @ [849:52] ==> value-parameter parameterFromSubclass: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.shouldReportParameterNameOverrideWarning[ValueParameterDescriptorImpl]

'name' @ [849:74] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [853:20] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkPropertyKind[ValueParameterDescriptorImpl]

'descriptor' @ [853:56] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkPropertyKind[ValueParameterDescriptorImpl]

'isVar' @ [853:67] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'isVar' @ [853:76] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion.checkPropertyKind[ValueParameterDescriptorImpl]

