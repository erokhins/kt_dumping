'when (targetDescriptor) {
        is ClassDescriptor, is ConstructorDescriptor -> "<init>"
        is PropertyAccessorDescriptor -> JvmAbi.getterName(targetDescriptor.correspondingProperty.name.asString())
        else -> targetDescriptor.name.asString()
    }' @ [41:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'targetDescriptor' @ [41:44] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'getterName' @ [43:49] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'targetDescriptor' @ [43:60] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'correspondingProperty' @ [43:77] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'name' @ [43:99] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [43:104] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'targetDescriptor' @ [44:17] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'name' @ [44:34] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [44:39] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'myCallingExpressionLines' @ [47:48] ==> private final val myCallingExpressionLines: Range<Int> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'myTargetMethodName' @ [49:36] ==> private final val myTargetMethodName: String defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'location' @ [52:22] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[ValueParameterDescriptorImpl]

'method' @ [52:31] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'myTargetMethodName' @ [53:13] ==> private final val myTargetMethodName: String defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'method' @ [53:35] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'name' @ [53:42] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'process' @ [55:31] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[ValueParameterDescriptorImpl]

'positionManager' @ [55:39] ==> public final val DebugProcessImpl.positionManager: CompoundPositionManager[MyPropertyDescriptor]

'runReadAction' @ [57:33] ==> public fun <T> runReadAction(action: () -> DeclarationDescriptor?): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor?

'positionManager' @ [58:29] ==> val positionManager: CompoundPositionManager defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'getSourcePosition' @ [58:45] ==> @Nullable public open fun getSourcePosition(p0: Location?): SourcePosition? defined in com.intellij.debugger.engine.CompoundPositionManager[JavaMethodDescriptor]

'location' @ [58:63] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[ValueParameterDescriptorImpl]

'elementAt' @ [58:74] ==> public final val SourcePosition.elementAt: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'elementAt' @ [60:31] ==> val elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>[LocalVariableDescriptor]

'getParentOfTypesAndPredicate' @ [60:42] ==> public fun <T : PsiElement> PsiElement.getParentOfTypesAndPredicate(strict: Boolean = ..., vararg parentClasses: Class<KtDeclaration>, predicate: (KtDeclaration) -> Boolean): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtDeclaration

'java' @ [60:99] ==> public val <T> KClass<KtDeclaration>.java: Class<KtDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [61:17] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [61:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [61:39] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isLocal' @ [61:42] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'if (declaration is KtClass && method.name() == "<init>") {
                (declaration.resolveToDescriptor() as? ClassDescriptor)?.unsubstitutedPrimaryConstructor
            } else {
                declaration?.resolveToDescriptor()
            }' @ [64:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'declaration' @ [64:17] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>[LocalVariableDescriptor]

'method' @ [64:43] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'name' @ [64:50] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'declaration' @ [65:18] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [65:30] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'unsubstitutedPrimaryConstructor' @ [65:74] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'declaration' @ [67:17] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [67:30] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [71:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'currentDescriptor' @ [72:13] ==> val currentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'currentDescriptor' @ [73:13] ==> val currentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'kind' @ [73:31] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [73:39] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'targetDescriptor' @ [75:13] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'compareDescriptors' @ [81:13] ==> private fun compareDescriptors(d1: DeclarationDescriptor, d2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping in file KotlinBasicStepMethodFilter.kt[SimpleFunctionDescriptorImpl]

'currentDescriptor' @ [81:32] ==> val currentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'targetDescriptor' @ [81:51] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'when (targetDescriptor.kind) {
            DELEGATION, FAKE_OVERRIDE ->
                targetDescriptor.getDirectlyOverriddenDeclarations()
            DECLARATION, SYNTHESIZED ->
                listOf(targetDescriptor)
        }' @ [86:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<CallableMemberDescriptor>, entry1: Collection<CallableMemberDescriptor>): Collection<CallableMemberDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<CallableMemberDescriptor>

'targetDescriptor' @ [86:37] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'kind' @ [86:54] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [87:13] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'FAKE_OVERRIDE' @ [87:25] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'targetDescriptor' @ [88:17] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'getDirectlyOverriddenDeclarations' @ [88:34] ==> public fun <D : CallableMemberDescriptor> CallableMemberDescriptor.getDirectlyOverriddenDeclarations(): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableMemberDescriptor> -> CallableMemberDescriptor

'DECLARATION' @ [89:13] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'SYNTHESIZED' @ [89:26] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'listOf' @ [90:17] ==> public fun <T> listOf(element: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'targetDescriptor' @ [90:24] ==> private final val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter[PropertyDescriptorImpl]

'baseDescriptors' @ [93:13] ==> val baseDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'any' @ [93:29] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.any(predicate: (CallableMemberDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'compareDescriptors' @ [93:51] ==> private fun compareDescriptors(d1: DeclarationDescriptor, d2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping in file KotlinBasicStepMethodFilter.kt[SimpleFunctionDescriptorImpl]

'baseOfTarget' @ [93:70] ==> value-parameter baseOfTarget: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>[ValueParameterDescriptorImpl]

'currentDescriptor' @ [93:84] ==> val currentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'getAllOverriddenDescriptors' @ [97:32] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> getAllOverriddenDescriptors(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableMemberDescriptor

'currentDescriptor' @ [97:60] ==> val currentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'any' @ [97:79] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.any(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'baseDescriptors' @ [98:13] ==> val baseDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches[LocalVariableDescriptor]

'any' @ [98:29] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.any(predicate: (CallableMemberDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'compareDescriptors' @ [98:51] ==> private fun compareDescriptors(d1: DeclarationDescriptor, d2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping in file KotlinBasicStepMethodFilter.kt[SimpleFunctionDescriptorImpl]

'baseOfCurrent' @ [98:70] ==> value-parameter baseOfCurrent: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>[ValueParameterDescriptorImpl]

'baseOfTarget' @ [98:85] ==> value-parameter baseOfTarget: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinBasicStepMethodFilter.locationMatches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'd1' @ [104:12] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.compareDescriptors[ValueParameterDescriptorImpl]

'd2' @ [104:18] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.compareDescriptors[ValueParameterDescriptorImpl]

'd1' @ [104:24] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.compareDescriptors[ValueParameterDescriptorImpl]

'original' @ [104:27] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'd2' @ [104:39] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.stepping.compareDescriptors[ValueParameterDescriptorImpl]

'original' @ [104:42] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

