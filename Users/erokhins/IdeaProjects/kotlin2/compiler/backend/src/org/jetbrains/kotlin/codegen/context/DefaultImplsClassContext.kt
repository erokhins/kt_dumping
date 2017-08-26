'ClassContext' @ [32:5] ==> public constructor ClassContext(@NotNull typeMapper: KotlinTypeMapper, @NotNull contextDescriptor: ClassDescriptor, @NotNull contextKind: OwnerKind, @Nullable parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>?..CodegenContext<*>?), @Nullable localLookup: ((descriptor: (DeclarationDescriptor..DeclarationDescriptor?)) -> Boolean)?) defined in org.jetbrains.kotlin.codegen.context.ClassContext[SamAdapterClassConstructorDescriptor]

'typeMapper' @ [32:18] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.<init>[ValueParameterDescriptorImpl]

'contextDescriptor' @ [32:30] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.<init>[ValueParameterDescriptorImpl]

'contextKind' @ [32:49] ==> value-parameter contextKind: OwnerKind defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.<init>[ValueParameterDescriptorImpl]

'parentContext' @ [32:62] ==> value-parameter parentContext: CodegenContext<*>? defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.<init>[ValueParameterDescriptorImpl]

'localLookup' @ [32:77] ==> value-parameter localLookup: ((DeclarationDescriptor) -> Boolean)? defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.<init>[ValueParameterDescriptorImpl]

'interfaceContext' @ [34:68] ==> private final val interfaceContext: ClassContext defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext[PropertyDescriptorImpl]

'companionObjectContext' @ [34:85] ==> public final val ClassContext.companionObjectContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>?..CodegenContext<*>?)[MyPropertyDescriptor]

'super' @ [37:25] ==> <this> defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext[LazyClassReceiverParameterDescriptor]

'getAccessors' @ [37:31] ==> @NotNull @ReadOnly public open fun getAccessors(): Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> defined in org.jetbrains.kotlin.codegen.context.ClassContext[JavaMethodDescriptor]

'accessors' @ [38:32] ==> val accessors: Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors[LocalVariableDescriptor]

'map' @ [38:42] ==> public inline fun <T, R> Iterable<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)>.map(transform: ((AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)) -> Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>): List<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>..org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>?)
    <R> -> Pair<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?), ClassDescriptor?>

'Pair' @ [38:49] ==> public constructor Pair<out A, out B>(first: (CallableMemberDescriptor..CallableMemberDescriptor?), second: ClassDescriptor?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <out B> -> ClassDescriptor?

'it' @ [38:54] ==> value-parameter it: (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?) defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors.<anonymous>[ValueParameterDescriptorImpl]

'calleeDescriptor' @ [38:57] ==> public final val <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> AccessorForCallableDescriptor<out (CallableMemberDescriptor..CallableMemberDescriptor?)>.calleeDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> Captured(*)

'it' @ [38:75] ==> value-parameter it: (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?) defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors.<anonymous>[ValueParameterDescriptorImpl]

'superCallTarget' @ [38:78] ==> public final val <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> AccessorForCallableDescriptor<out (CallableMemberDescriptor..CallableMemberDescriptor?)>.superCallTarget: ClassDescriptor?[MyPropertyDescriptor]
Inferred types:
    <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> Captured(*)

'interfaceContext' @ [39:24] ==> private final val interfaceContext: ClassContext defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext[PropertyDescriptorImpl]

'accessors' @ [39:41] ==> public final val ClassContext.accessors: Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)>[MyPropertyDescriptor]

'associateByTo' @ [39:51] ==> public inline fun <T, K, M : MutableMap<in Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, in (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)>> Iterable<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)>.associateByTo(destination: LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */, keySelector: ((AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)) -> Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>): LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>..org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>?)
    <K> -> Pair<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?), ClassDescriptor?>
    <M : MutableMap<in K, in T>> -> LinkedHashMap<Pair<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?), ClassDescriptor?>, (org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>..org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>?)>

'linkedMapOf' @ [39:65] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?), ClassDescriptor?>
    <V> -> (org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>..org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>?)

'Pair' @ [39:82] ==> public constructor Pair<out A, out B>(first: (CallableMemberDescriptor..CallableMemberDescriptor?), second: ClassDescriptor?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <out B> -> ClassDescriptor?

'it' @ [39:87] ==> value-parameter it: (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?) defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors.<anonymous>[ValueParameterDescriptorImpl]

'calleeDescriptor' @ [39:90] ==> public final val <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> AccessorForCallableDescriptor<out (CallableMemberDescriptor..CallableMemberDescriptor?)>.calleeDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> Captured(*)

'it' @ [39:108] ==> value-parameter it: (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?) defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors.<anonymous>[ValueParameterDescriptorImpl]

'superCallTarget' @ [39:111] ==> public final val <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> AccessorForCallableDescriptor<out (CallableMemberDescriptor..CallableMemberDescriptor?)>.superCallTarget: ClassDescriptor?[MyPropertyDescriptor]
Inferred types:
    <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> Captured(*)

'apply' @ [39:130] ==> @InlineOnly public inline fun <T> LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */.apply(block: LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */.() -> Unit): LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<Pair<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?), ClassDescriptor?>, (org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>..org.jetbrains.kotlin.codegen.AccessorForCallableDescriptor<*>?)>

'keys' @ [39:138] ==> public open val keys: MutableSet<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'alreadyExistKeys' @ [39:146] ==> val alreadyExistKeys: List<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>> defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors[LocalVariableDescriptor]

'accessors' @ [40:16] ==> val accessors: Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors[LocalVariableDescriptor]

'filtered' @ [40:28] ==> val filtered: LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> /* = LinkedHashMap<Pair<(CallableMemberDescriptor..CallableMemberDescriptor?), ClassDescriptor?>, (AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> */ defined in org.jetbrains.kotlin.codegen.context.DefaultImplsClassContext.getAccessors[LocalVariableDescriptor]

'values' @ [40:37] ==> public open val values: MutableCollection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

