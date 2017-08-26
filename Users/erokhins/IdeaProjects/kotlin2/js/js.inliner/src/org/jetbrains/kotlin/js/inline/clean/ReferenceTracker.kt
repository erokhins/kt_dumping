'IdentityHashMap' @ [24:29] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Reference
    <V : (Any..Any?)> -> Boolean

'IdentityHashMap' @ [25:39] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Reference
    <V : (Any..Any?)> -> RemoveCandidate

'IdentityHashMap' @ [26:35] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Reference
    <V : (Any..Any?)> -> MutableSet<Reference>

'IdentitySet' @ [27:27] ==> public fun <T> IdentitySet(): MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Reference

'reachable' @ [31:20] ==> private/*private to this*/ final val reachable: IdentityHashMap<Reference, Boolean> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'filter' @ [32:26] ==> public inline fun <K, V> Map<out (Reference..Reference?), (Boolean..Boolean?)>.filter(predicate: (Map.Entry<(Reference..Reference?), (Boolean..Boolean?)>) -> Boolean): Map<(Reference..Reference?), (Boolean..Boolean?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (Reference..Reference?)
    <V> -> (kotlin.Boolean..kotlin.Boolean?)

'!' @ [32:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [32:36] ==> value-parameter it: Map.Entry<(Reference..Reference?), (Boolean..Boolean?)> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.<get-removable>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [32:39] ==> public abstract val value: (Boolean..Boolean?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [33:26] ==> public inline fun <K, V, R> Map<out (Reference..Reference?), (Boolean..Boolean?)>.map(transform: (Map.Entry<(Reference..Reference?), (Boolean..Boolean?)>) -> RemoveCandidate): List<RemoveCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (Reference..Reference?)
    <V> -> (kotlin.Boolean..kotlin.Boolean?)
    <R> -> RemoveCandidate

'removableCandidates' @ [33:32] ==> private/*private to this*/ final val removableCandidates: IdentityHashMap<Reference, RemoveCandidate> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'it' @ [33:52] ==> value-parameter it: Map.Entry<(Reference..Reference?), (Boolean..Boolean?)> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.<get-removable>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [33:55] ==> public abstract val key: (Reference..Reference?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assert' @ [37:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [37:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReferenceToRemovableCandidate' @ [37:17] ==> public final fun isReferenceToRemovableCandidate(ref: Reference): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'reference' @ [37:49] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addCandidateForRemoval[ValueParameterDescriptorImpl]

'candidate' @ [37:109] ==> value-parameter candidate: RemoveCandidate defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addCandidateForRemoval[ValueParameterDescriptorImpl]

'removableCandidates' @ [39:9] ==> private/*private to this*/ final val removableCandidates: IdentityHashMap<Reference, RemoveCandidate> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'put' @ [39:29] ==> public open fun put(key: (Reference..Reference?), value: (RemoveCandidate..RemoveCandidate?)): RemoveCandidate? defined in java.util.IdentityHashMap[JavaMethodDescriptor]

'reference' @ [39:33] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addCandidateForRemoval[ValueParameterDescriptorImpl]

'candidate' @ [39:44] ==> value-parameter candidate: RemoveCandidate defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addCandidateForRemoval[ValueParameterDescriptorImpl]

'reachable' @ [40:9] ==> private/*private to this*/ final val reachable: IdentityHashMap<Reference, Boolean> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'put' @ [40:19] ==> public open fun put(key: (Reference..Reference?), value: (Boolean..Boolean?)): Boolean? defined in java.util.IdentityHashMap[JavaMethodDescriptor]

'reference' @ [40:23] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addCandidateForRemoval[ValueParameterDescriptorImpl]

'!' @ [44:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReferenceToRemovableCandidate' @ [44:14] ==> public final fun isReferenceToRemovableCandidate(ref: Reference): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'referenced' @ [44:46] ==> value-parameter referenced: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addRemovableReference[ValueParameterDescriptorImpl]

'getReferencedBy' @ [46:9] ==> private/*private to this*/ final fun getReferencedBy(referrer: Reference): MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'referrer' @ [46:25] ==> value-parameter referrer: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addRemovableReference[ValueParameterDescriptorImpl]

'add' @ [46:35] ==> public abstract fun add(element: Reference): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'referenced' @ [46:39] ==> value-parameter referenced: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addRemovableReference[ValueParameterDescriptorImpl]

'isReachable' @ [48:13] ==> private final fun isReachable(ref: Reference): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'referrer' @ [48:25] ==> value-parameter referrer: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addRemovableReference[ValueParameterDescriptorImpl]

'markReachable' @ [49:13] ==> public final fun markReachable(reference: Reference): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'referenced' @ [49:27] ==> value-parameter referenced: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.addRemovableReference[ValueParameterDescriptorImpl]

'!' @ [54:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReferenceToRemovableCandidate' @ [54:14] ==> public final fun isReferenceToRemovableCandidate(ref: Reference): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'reference' @ [54:46] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable[ValueParameterDescriptorImpl]

'visited' @ [56:9] ==> private/*private to this*/ final val visited: MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'add' @ [56:17] ==> public abstract fun add(element: Reference): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'reference' @ [56:21] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable[ValueParameterDescriptorImpl]

'getReferencedBy' @ [57:9] ==> private/*private to this*/ final fun getReferencedBy(referrer: Reference): MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'reference' @ [57:25] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable[ValueParameterDescriptorImpl]

'filterNot' @ [58:18] ==> public inline fun <T> Iterable<Reference>.filterNot(predicate: (Reference) -> Boolean): List<Reference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Reference

'it' @ [58:30] ==> value-parameter it: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable.<anonymous>[ValueParameterDescriptorImpl]

'visited' @ [58:36] ==> private/*private to this*/ final val visited: MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'filter' @ [59:18] ==> public inline fun <T> Iterable<Reference>.filter(predicate: (Reference) -> Boolean): List<Reference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Reference

'isReferenceToRemovableCandidate' @ [59:27] ==> public final fun isReferenceToRemovableCandidate(ref: Reference): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'it' @ [59:59] ==> value-parameter it: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [59:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReachable' @ [59:67] ==> private final fun isReachable(ref: Reference): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'it' @ [59:79] ==> value-parameter it: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [60:18] ==> @HidesMembers public inline fun <T> Iterable<Reference>.forEach(action: (Reference) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Reference

'markReachable' @ [60:28] ==> public final fun markReachable(reference: Reference): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'it' @ [60:42] ==> value-parameter it: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable.<anonymous>[ValueParameterDescriptorImpl]

'visited' @ [62:9] ==> private/*private to this*/ final val visited: MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'remove' @ [62:17] ==> public abstract fun remove(element: Reference): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'reference' @ [62:24] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable[ValueParameterDescriptorImpl]

'reachable' @ [63:9] ==> private/*private to this*/ final val reachable: IdentityHashMap<Reference, Boolean> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'reference' @ [63:19] ==> value-parameter reference: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.markReachable[ValueParameterDescriptorImpl]

'referenceFromTo' @ [67:16] ==> private/*private to this*/ final val referenceFromTo: IdentityHashMap<Reference, MutableSet<Reference>> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'getOrPut' @ [67:32] ==> public inline fun <K, V> MutableMap<(Reference..Reference?), (MutableSet<Reference>..MutableSet<Reference>?)>.getOrPut(key: (Reference..Reference?), defaultValue: () -> (MutableSet<Reference>..MutableSet<Reference>?)): (MutableSet<Reference>..MutableSet<Reference>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (Reference..Reference?)
    <V> -> (kotlin.collections.MutableSet<Reference>..kotlin.collections.MutableSet<Reference>?)

'referrer' @ [67:41] ==> value-parameter referrer: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.getReferencedBy[ValueParameterDescriptorImpl]

'IdentitySet' @ [67:53] ==> public fun <T> IdentitySet(): MutableSet<Reference> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Reference

'removableCandidates' @ [71:16] ==> private/*private to this*/ final val removableCandidates: IdentityHashMap<Reference, RemoveCandidate> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'containsKey' @ [71:36] ==> public open fun containsKey(key: (Reference..Reference?)): Boolean defined in java.util.IdentityHashMap[JavaMethodDescriptor]

'ref' @ [71:48] ==> value-parameter ref: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.isReferenceToRemovableCandidate[ValueParameterDescriptorImpl]

'reachable' @ [75:16] ==> private/*private to this*/ final val reachable: IdentityHashMap<Reference, Boolean> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'ref' @ [75:26] ==> value-parameter ref: Reference defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker.isReachable[ValueParameterDescriptorImpl]

