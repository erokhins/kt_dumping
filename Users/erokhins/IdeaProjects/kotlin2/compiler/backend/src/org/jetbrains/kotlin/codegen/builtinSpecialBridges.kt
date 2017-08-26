'JvmStatic' @ [47:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DescriptorBasedFunctionHandle' @ [53:30] ==> public constructor DescriptorBasedFunctionHandle(descriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedClassConstructorDescriptor]

'function' @ [53:60] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'isBodyOwner' @ [53:70] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'!' @ [54:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionHandle' @ [54:21] ==> val functionHandle: DescriptorBasedFunctionHandle defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'isDeclaration' @ [54:36] ==> public open val isDeclaration: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedPropertyDescriptor]

'function' @ [55:33] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'getOverriddenBuiltinReflectingJvmDescriptor' @ [55:42] ==> public fun <T : CallableMemberDescriptor> FunctionDescriptor.getOverriddenBuiltinReflectingJvmDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CallableMemberDescriptor> -> FunctionDescriptor

'findAllReachableDeclarations' @ [57:37] ==> private fun findAllReachableDeclarations(functionDescriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean): MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen in file builtinSpecialBridges.kt[SimpleFunctionDescriptorImpl]

'function' @ [57:66] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'isBodyOwner' @ [57:76] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'invoke' @ [60:28] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'function' @ [60:50] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'invoke' @ [62:38] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'overriddenBuiltin' @ [62:60] ==> val overriddenBuiltin: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'function' @ [64:35] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'getSpecialBridgeSignatureIfExists' @ [64:44] ==> private fun <Signature> CallableMemberDescriptor.getSpecialBridgeSignatureIfExists(signatureByDescriptor: (FunctionDescriptor) -> Signature): Signature? defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]
Inferred types:
    <Signature> -> Signature

'signatureByDescriptor' @ [64:78] ==> value-parameter signatureByDescriptor: (FunctionDescriptor) -> Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'function' @ [65:52] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'overriddenTreeAsSequence' @ [65:61] ==> public fun CallableMemberDescriptor.overriddenTreeAsSequence(useOriginal: Boolean): Sequence<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [65:106] ==> public fun <T, R : Any> Sequence<CallableMemberDescriptor>.mapNotNull(transform: (CallableMemberDescriptor) -> Signature?): Sequence<Signature> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R : Any> -> Signature

'it' @ [66:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial.<anonymous>[ValueParameterDescriptorImpl]

'takeUnless' @ [66:16] ==> @InlineOnly @SinceKotlin public inline fun <T> CallableMemberDescriptor.takeUnless(predicate: (CallableMemberDescriptor) -> Boolean): CallableMemberDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [66:29] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'function' @ [66:36] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'getSpecialBridgeSignatureIfExists' @ [66:48] ==> private fun <Signature> CallableMemberDescriptor.getSpecialBridgeSignatureIfExists(signatureByDescriptor: (FunctionDescriptor) -> Signature): Signature? defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]
Inferred types:
    <Signature> -> Signature

'signatureByDescriptor' @ [66:82] ==> value-parameter signatureByDescriptor: (FunctionDescriptor) -> Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'specialBridgeSignature' @ [69:17] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'specialBridgesSignaturesInSuperClass' @ [69:43] ==> val specialBridgesSignaturesInSuperClass: Sequence<Signature> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'reachableDeclarations' @ [70:24] ==> val reachableDeclarations: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'any' @ [70:46] ==> public inline fun <T> Iterable<FunctionDescriptor>.any(predicate: (FunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [70:52] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [70:55] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [70:76] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'invoke' @ [70:85] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [70:107] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial.<anonymous>[ValueParameterDescriptorImpl]

'specialBridgeSignature' @ [70:114] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'if (specialBridgeExists && !isTherePossibleClashWithSpecialBridge)
            BridgeForBuiltinSpecial(specialBridgeSignature, methodItself, isSpecial = true)
        else null' @ [72:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BridgeForBuiltinSpecial<Signature>?, elseBranch: BridgeForBuiltinSpecial<Signature>?): BridgeForBuiltinSpecial<Signature>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BridgeForBuiltinSpecial<Signature>?

'specialBridgeExists' @ [72:33] ==> val specialBridgeExists: Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'!' @ [72:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTherePossibleClashWithSpecialBridge' @ [72:57] ==> val isTherePossibleClashWithSpecialBridge: Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'BridgeForBuiltinSpecial' @ [73:13] ==> public constructor BridgeForBuiltinSpecial<out Signature : Any>(from: Signature, to: Signature, isSpecial: Boolean = ..., isDelegateToSuper: Boolean = ...) defined in org.jetbrains.kotlin.codegen.BridgeForBuiltinSpecial[ClassConstructorDescriptorImpl]
Inferred types:
    <out Signature : Any> -> Signature

'specialBridgeSignature' @ [73:37] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'methodItself' @ [73:61] ==> val methodItself: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'reachableDeclarations' @ [76:29] ==> val reachableDeclarations: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'mapTo' @ [76:51] ==> public inline fun <T, R, C : MutableCollection<in Signature>> Iterable<FunctionDescriptor>.mapTo(destination: LinkedHashSet<Signature>, transform: (FunctionDescriptor) -> Signature): LinkedHashSet<Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Signature
    <C : MutableCollection<in R>> -> LinkedHashSet<Signature>

'LinkedHashSet' @ [76:57] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Signature

'signatureByDescriptor' @ [76:85] ==> value-parameter signatureByDescriptor: (FunctionDescriptor) -> Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'commonBridges' @ [77:9] ==> val commonBridges: LinkedHashSet<Signature> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'removeAll' @ [77:23] ==> public fun <T> MutableCollection<in Signature>.removeAll(elements: Sequence<Signature>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'specialBridgesSignaturesInSuperClass' @ [77:33] ==> val specialBridgesSignaturesInSuperClass: Sequence<Signature> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'listOfNotNull' @ [77:72] ==> public fun <T : Any> listOfNotNull(element: Signature?): List<Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Signature

'specialBridge' @ [77:86] ==> val specialBridge: BridgeForBuiltinSpecial<Signature>? defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'from' @ [77:101] ==> public final val from: Signature defined in org.jetbrains.kotlin.codegen.BridgeForBuiltinSpecial[PropertyDescriptorImpl]

'fake' @ [79:13] ==> val fake: Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'function' @ [80:32] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [80:41] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'map' @ [80:63] ==> public inline fun <T, R> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.map(transform: ((FunctionDescriptor..FunctionDescriptor?)) -> FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)
    <R> -> FunctionDescriptor

'it' @ [80:69] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [80:72] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'!' @ [81:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DescriptorBasedFunctionHandle' @ [81:22] ==> public constructor DescriptorBasedFunctionHandle(descriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedClassConstructorDescriptor]

'overridden' @ [81:52] ==> val overridden: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'isBodyOwner' @ [81:64] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'isAbstract' @ [81:77] ==> public open val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedPropertyDescriptor]

'commonBridges' @ [82:21] ==> val commonBridges: LinkedHashSet<Signature> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'removeAll' @ [82:35] ==> public open fun removeAll(elements: Collection<Signature>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'findAllReachableDeclarations' @ [82:45] ==> private fun findAllReachableDeclarations(functionDescriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean): MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen in file builtinSpecialBridges.kt[SimpleFunctionDescriptorImpl]

'overridden' @ [82:74] ==> val overridden: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'isBodyOwner' @ [82:86] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'map' @ [82:99] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.map(transform: (FunctionDescriptor) -> Signature): List<Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Signature

'signatureByDescriptor' @ [82:103] ==> value-parameter signatureByDescriptor: (FunctionDescriptor) -> Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'mutableSetOf' @ [87:71] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<BridgeForBuiltinSpecial<Signature>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BridgeForBuiltinSpecial<Signature>

'if (specialBridge != null && fake && !functionHandle.isAbstract)
                    findSuperImplementationForStubDelegation(function, isBodyOwner, signatureByDescriptor)
                else
                    null' @ [90:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor?, elseBranch: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor?

'specialBridge' @ [90:21] ==> val specialBridge: BridgeForBuiltinSpecial<Signature>? defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'fake' @ [90:46] ==> val fake: Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'!' @ [90:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionHandle' @ [90:55] ==> val functionHandle: DescriptorBasedFunctionHandle defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'isAbstract' @ [90:70] ==> public open val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedPropertyDescriptor]

'findSuperImplementationForStubDelegation' @ [91:21] ==> private fun <Signature> findSuperImplementationForStubDelegation(function: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean, signatureByDescriptor: (FunctionDescriptor) -> Signature): FunctionDescriptor? defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]
Inferred types:
    <Signature> -> Signature

'function' @ [91:62] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'isBodyOwner' @ [91:72] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'signatureByDescriptor' @ [91:85] ==> value-parameter signatureByDescriptor: (FunctionDescriptor) -> Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[ValueParameterDescriptorImpl]

'superImplementationDescriptor' @ [95:13] ==> val superImplementationDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'bridges' @ [96:13] ==> val bridges: MutableSet<BridgeForBuiltinSpecial<Signature>> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'add' @ [96:21] ==> public abstract fun add(element: BridgeForBuiltinSpecial<Signature>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'BridgeForBuiltinSpecial' @ [96:25] ==> public constructor BridgeForBuiltinSpecial<out Signature : Any>(from: Signature, to: Signature, isSpecial: Boolean = ..., isDelegateToSuper: Boolean = ...) defined in org.jetbrains.kotlin.codegen.BridgeForBuiltinSpecial[ClassConstructorDescriptorImpl]
Inferred types:
    <out Signature : Any> -> Signature

'methodItself' @ [96:49] ==> val methodItself: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'invoke' @ [96:63] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'superImplementationDescriptor' @ [96:85] ==> val superImplementationDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'commonBridges' @ [99:13] ==> val commonBridges: LinkedHashSet<Signature> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'remove' @ [99:27] ==> public open fun remove(element: Signature): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'methodItself' @ [99:34] ==> val methodItself: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'superImplementationDescriptor' @ [100:17] ==> val superImplementationDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'fake' @ [100:58] ==> val fake: Boolean defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'!' @ [100:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionHandle' @ [100:67] ==> val functionHandle: DescriptorBasedFunctionHandle defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'isAbstract' @ [100:82] ==> public open val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedPropertyDescriptor]

'methodItself' @ [100:96] ==> val methodItself: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'specialBridgeSignature' @ [100:112] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'bridges' @ [105:17] ==> val bridges: MutableSet<BridgeForBuiltinSpecial<Signature>> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'add' @ [105:25] ==> public abstract fun add(element: BridgeForBuiltinSpecial<Signature>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'BridgeForBuiltinSpecial' @ [105:29] ==> public constructor BridgeForBuiltinSpecial<out Signature : Any>(from: Signature, to: Signature, isSpecial: Boolean = ..., isDelegateToSuper: Boolean = ...) defined in org.jetbrains.kotlin.codegen.BridgeForBuiltinSpecial[ClassConstructorDescriptorImpl]
Inferred types:
    <out Signature : Any> -> Signature

'methodItself' @ [105:53] ==> val methodItself: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'specialBridgeSignature' @ [105:67] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'bridges' @ [109:9] ==> val bridges: MutableSet<BridgeForBuiltinSpecial<Signature>> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'addAll' @ [109:17] ==> public abstract fun addAll(elements: Collection<BridgeForBuiltinSpecial<Signature>>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'commonBridges' @ [109:24] ==> val commonBridges: LinkedHashSet<Signature> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'map' @ [109:38] ==> public inline fun <T, R> Iterable<Signature>.map(transform: (Signature) -> BridgeForBuiltinSpecial<Signature>): List<BridgeForBuiltinSpecial<Signature>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature
    <R> -> BridgeForBuiltinSpecial<Signature>

'BridgeForBuiltinSpecial' @ [109:44] ==> public constructor BridgeForBuiltinSpecial<out Signature : Any>(from: Signature, to: Signature, isSpecial: Boolean = ..., isDelegateToSuper: Boolean = ...) defined in org.jetbrains.kotlin.codegen.BridgeForBuiltinSpecial[ClassConstructorDescriptorImpl]
Inferred types:
    <out Signature : Any> -> Signature

'it' @ [109:68] ==> value-parameter it: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial.<anonymous>[ValueParameterDescriptorImpl]

'methodItself' @ [109:72] ==> val methodItself: Signature defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'bridges' @ [110:9] ==> val bridges: MutableSet<BridgeForBuiltinSpecial<Signature>> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'addIfNotNull' @ [110:17] ==> public fun <T : Any> MutableCollection<BridgeForBuiltinSpecial<Signature>>.addIfNotNull(t: BridgeForBuiltinSpecial<Signature>?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> BridgeForBuiltinSpecial<Signature>

'specialBridge' @ [110:30] ==> val specialBridge: BridgeForBuiltinSpecial<Signature>? defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'bridges' @ [112:16] ==> val bridges: MutableSet<BridgeForBuiltinSpecial<Signature>> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.generateBridgesForBuiltinSpecial[LocalVariableDescriptor]

'JvmStatic' @ [115:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'BuiltinMethodsWithSpecialGenericSignature' @ [118:13] ==> public object BuiltinMethodsWithSpecialGenericSignature defined in org.jetbrains.kotlin.load.java[FakeCallableDescriptorForObject]

'getDefaultValueForOverriddenBuiltinFunction' @ [118:55] ==> @JvmStatic public final fun getDefaultValueForOverriddenBuiltinFunction(functionDescriptor: FunctionDescriptor): BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription? defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[DeserializedSimpleFunctionDescriptor]

'this' @ [118:99] ==> <this> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.shouldHaveTypeSafeBarrier[ReceiverParameterDescriptorImpl]

'getOverriddenBuiltinReflectingJvmDescriptor' @ [120:23] ==> public fun <T : CallableMemberDescriptor> FunctionDescriptor.getOverriddenBuiltinReflectingJvmDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CallableMemberDescriptor> -> FunctionDescriptor

'error' @ [120:72] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [120:118] ==> <this> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.shouldHaveTypeSafeBarrier[ReceiverParameterDescriptorImpl]

'invoke' @ [121:16] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [121:38] ==> <this> defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.shouldHaveTypeSafeBarrier[ReceiverParameterDescriptorImpl]

'invoke' @ [121:47] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'builtin' @ [121:69] ==> val builtin: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.BuiltinSpecialBridgesUtil.shouldHaveTypeSafeBarrier[LocalVariableDescriptor]

'findConcreteSuperDeclaration' @ [144:26] ==> public fun <Function : FunctionHandle> findConcreteSuperDeclaration(function: DescriptorBasedFunctionHandle): DescriptorBasedFunctionHandle defined in org.jetbrains.kotlin.backend.common.bridges[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Function : FunctionHandle> -> DescriptorBasedFunctionHandle

'DescriptorBasedFunctionHandle' @ [144:55] ==> public constructor DescriptorBasedFunctionHandle(descriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedClassConstructorDescriptor]

'function' @ [144:85] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[ValueParameterDescriptorImpl]

'isBodyOwner' @ [144:95] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[ValueParameterDescriptorImpl]

'descriptor' @ [144:109] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedPropertyDescriptor]

'isInterface' @ [147:25] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'implementation' @ [147:37] ==> val implementation: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[LocalVariableDescriptor]

'containingDeclaration' @ [147:52] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'invoke' @ [150:9] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'function' @ [150:31] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[ValueParameterDescriptorImpl]

'invoke' @ [150:44] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'implementation' @ [150:66] ==> val implementation: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[LocalVariableDescriptor]

'assert' @ [152:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'function' @ [152:12] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[ValueParameterDescriptorImpl]

'modality' @ [152:21] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'OPEN' @ [152:42] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'function' @ [153:71] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[ValueParameterDescriptorImpl]

'name' @ [153:80] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'function' @ [153:91] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[ValueParameterDescriptorImpl]

'modality' @ [153:100] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'implementation' @ [156:12] ==> val implementation: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findSuperImplementationForStubDelegation[LocalVariableDescriptor]

'findAllReachableDeclarations' @ [163:9] ==> public fun <Function : FunctionHandle> findAllReachableDeclarations(function: DescriptorBasedFunctionHandle): MutableSet<DescriptorBasedFunctionHandle> defined in org.jetbrains.kotlin.backend.common.bridges[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Function : FunctionHandle> -> DescriptorBasedFunctionHandle

'DescriptorBasedFunctionHandle' @ [163:38] ==> public constructor DescriptorBasedFunctionHandle(descriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedClassConstructorDescriptor]

'functionDescriptor' @ [163:68] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.findAllReachableDeclarations[ValueParameterDescriptorImpl]

'isBodyOwner' @ [163:88] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.codegen.findAllReachableDeclarations[ValueParameterDescriptorImpl]

'map' @ [163:102] ==> public inline fun <T, R> Iterable<DescriptorBasedFunctionHandle>.map(transform: (DescriptorBasedFunctionHandle) -> FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorBasedFunctionHandle
    <R> -> FunctionDescriptor

'it' @ [163:108] ==> value-parameter it: DescriptorBasedFunctionHandle defined in org.jetbrains.kotlin.codegen.findAllReachableDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [163:111] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[DeserializedPropertyDescriptor]

'toMutableSet' @ [163:124] ==> public fun <T> Iterable<FunctionDescriptor>.toMutableSet(): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'this' @ [169:9] ==> <this> defined in org.jetbrains.kotlin.codegen.getSpecialBridgeSignatureIfExists[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [172:9] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isInterface' @ [172:73] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [172:85] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'original' @ [175:28] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'originalOverride' @ [176:29] ==> val originalOverride: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.getSpecialBridgeSignatureIfExists[LocalVariableDescriptor]

'getOverriddenBuiltinReflectingJvmDescriptor' @ [176:46] ==> public fun <T : CallableMemberDescriptor> FunctionDescriptor.getOverriddenBuiltinReflectingJvmDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CallableMemberDescriptor> -> FunctionDescriptor

'invoke' @ [177:34] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'overriddenSpecial' @ [177:56] ==> val overriddenSpecial: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.getSpecialBridgeSignatureIfExists[LocalVariableDescriptor]

'invoke' @ [180:9] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'originalOverride' @ [180:31] ==> val originalOverride: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.getSpecialBridgeSignatureIfExists[LocalVariableDescriptor]

'specialBridgeSignature' @ [180:52] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.getSpecialBridgeSignatureIfExists[LocalVariableDescriptor]

'specialBridgeSignature' @ [182:12] ==> val specialBridgeSignature: Signature defined in org.jetbrains.kotlin.codegen.getSpecialBridgeSignatureIfExists[LocalVariableDescriptor]

'element' @ [190:22] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[ValueParameterDescriptorImpl]

'getParentCall' @ [190:30] ==> public fun KtElement.getParentCall(context: BindingContext, strict: Boolean = ...): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [190:44] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[ValueParameterDescriptorImpl]

'parentCall' @ [191:30] ==> val parentCall: Call defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[LocalVariableDescriptor]

'valueArguments' @ [191:41] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'singleOrNull' @ [191:56] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.singleOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'getArgumentExpression' @ [191:72] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'deparenthesize' @ [192:19] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'argumentExpression' @ [192:34] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[LocalVariableDescriptor]

'element' @ [192:58] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[ValueParameterDescriptorImpl]

'parentCall' @ [194:31] ==> val parentCall: Call defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[LocalVariableDescriptor]

'getResolvedCall' @ [194:42] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [194:58] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [194:75] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'candidateDescriptor' @ [197:12] ==> val candidateDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.isValueArgumentForCallToMethodWithTypeCheckBarrier[LocalVariableDescriptor]

'getSpecialSignatureInfo' @ [197:32] ==> @JvmStatic public final fun CallableMemberDescriptor.getSpecialSignatureInfo(): BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo? defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[FunctionImportedFromObject]

'isObjectReplacedWithTypeParameter' @ [197:59] ==> public final val isObjectReplacedWithTypeParameter: Boolean defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo[DeserializedPropertyDescriptor]

