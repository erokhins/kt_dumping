'AbstractCollection<E>' @ [24:78] ==> protected constructor AbstractCollection<out E>() defined in kotlin.collections.AbstractCollection[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'iterator' @ [29:24] ==> public abstract fun iterator(): MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection[SimpleFunctionDescriptorImpl]

'iterator' @ [30:16] ==> val iterator: MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection.remove[LocalVariableDescriptor]

'hasNext' @ [30:25] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'iterator' @ [31:17] ==> val iterator: MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection.remove[LocalVariableDescriptor]

'next' @ [31:26] ==> public abstract fun next(): E defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'element' @ [31:36] ==> value-parameter element: E defined in kotlin.collections.AbstractMutableCollection.remove[ValueParameterDescriptorImpl]

'iterator' @ [32:17] ==> val iterator: MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection.remove[LocalVariableDescriptor]

'remove' @ [32:26] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'elements' @ [41:25] ==> value-parameter elements: Collection<E> defined in kotlin.collections.AbstractMutableCollection.addAll[ValueParameterDescriptorImpl]

'add' @ [42:17] ==> public abstract fun add(element: E): Boolean defined in kotlin.collections.AbstractMutableCollection[SimpleFunctionDescriptorImpl]

'element' @ [42:21] ==> val element: E defined in kotlin.collections.AbstractMutableCollection.addAll[LocalVariableDescriptor]

'modified' @ [42:31] ==> var modified: Boolean defined in kotlin.collections.AbstractMutableCollection.addAll[LocalVariableDescriptor]

'modified' @ [44:16] ==> var modified: Boolean defined in kotlin.collections.AbstractMutableCollection.addAll[LocalVariableDescriptor]

'this' @ [47:65] ==> <this> defined in kotlin.collections.AbstractMutableCollection[LazyClassReceiverParameterDescriptor]

'removeAll' @ [47:93] ==> public fun <T> MutableIterable<E>.removeAll(predicate: (E) -> Boolean): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> E

'it' @ [47:105] ==> value-parameter it: E defined in kotlin.collections.AbstractMutableCollection.removeAll.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [47:111] ==> value-parameter elements: Collection<E> defined in kotlin.collections.AbstractMutableCollection.removeAll[ValueParameterDescriptorImpl]

'this' @ [48:65] ==> <this> defined in kotlin.collections.AbstractMutableCollection[LazyClassReceiverParameterDescriptor]

'removeAll' @ [48:93] ==> public fun <T> MutableIterable<E>.removeAll(predicate: (E) -> Boolean): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> E

'it' @ [48:105] ==> value-parameter it: E defined in kotlin.collections.AbstractMutableCollection.retainAll.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [48:112] ==> value-parameter elements: Collection<E> defined in kotlin.collections.AbstractMutableCollection.retainAll[ValueParameterDescriptorImpl]

'this' @ [51:24] ==> <this> defined in kotlin.collections.AbstractMutableCollection[LazyClassReceiverParameterDescriptor]

'iterator' @ [51:29] ==> public abstract fun iterator(): MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection[SimpleFunctionDescriptorImpl]

'iterator' @ [52:16] ==> val iterator: MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection.clear[LocalVariableDescriptor]

'hasNext' @ [52:25] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'iterator' @ [53:13] ==> val iterator: MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection.clear[LocalVariableDescriptor]

'next' @ [53:22] ==> public abstract fun next(): E defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'iterator' @ [54:13] ==> val iterator: MutableIterator<E> defined in kotlin.collections.AbstractMutableCollection.clear[LocalVariableDescriptor]

'remove' @ [54:22] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'this' @ [58:30] ==> <this> defined in kotlin.collections.AbstractMutableCollection[LazyClassReceiverParameterDescriptor]

'toArray' @ [58:35] ==> protected open fun toArray(): Array<Any?> defined in kotlin.collections.AbstractMutableCollection[SimpleFunctionDescriptorImpl]

