'firstOrNull' @ [29:65] ==> public inline fun <T> Iterable<AnnotationDescriptor>.firstOrNull(predicate: (AnnotationDescriptor) -> Boolean): AnnotationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'it' @ [29:79] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [29:82] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'fqName' @ [29:92] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.findAnnotation[ValueParameterDescriptorImpl]

'findAnnotation' @ [31:50] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [31:65] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.hasAnnotation[ValueParameterDescriptorImpl]

'emptyList' @ [46:60] ==> public fun <T> emptyList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'emptyList' @ [48:48] ==> public fun <T> emptyList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'emptyList' @ [50:39] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'iterator' @ [50:73] ==> public abstract fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'annotations' @ [56:20] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findAnyAnnotation[ValueParameterDescriptorImpl]

'getAllAnnotations' @ [56:32] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [56:52] ==> public inline fun <T> Iterable<AnnotationWithTarget>.firstOrNull(predicate: (AnnotationWithTarget) -> Boolean): AnnotationWithTarget? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'it' @ [56:66] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findAnyAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'annotation' @ [56:69] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[PropertyDescriptorImpl]

'fqName' @ [56:80] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'fqName' @ [56:90] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findAnyAnnotation[ValueParameterDescriptorImpl]

'getUseSiteTargetedAnnotations' @ [60:20] ==> private final fun getUseSiteTargetedAnnotations(annotations: Annotations, target: AnnotationUseSiteTarget): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[SimpleFunctionDescriptorImpl]

'annotations' @ [60:50] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findUseSiteTargetedAnnotation[ValueParameterDescriptorImpl]

'target' @ [60:63] ==> value-parameter target: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findUseSiteTargetedAnnotation[ValueParameterDescriptorImpl]

'firstOrNull' @ [60:71] ==> public inline fun <T> Iterable<AnnotationDescriptor>.firstOrNull(predicate: (AnnotationDescriptor) -> Boolean): AnnotationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'it' @ [60:85] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findUseSiteTargetedAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [60:88] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'fqName' @ [60:98] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.findUseSiteTargetedAnnotation[ValueParameterDescriptorImpl]

'annotations' @ [64:20] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.getUseSiteTargetedAnnotations[ValueParameterDescriptorImpl]

'getUseSiteTargetedAnnotations' @ [64:32] ==> public abstract fun getUseSiteTargetedAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [64:64] ==> public inline fun <T, R : Any> Iterable<AnnotationWithTarget>.mapNotNull(transform: (AnnotationWithTarget) -> AnnotationDescriptor?): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget
    <R : Any> -> AnnotationDescriptor

'component1' @ [64:78] ==> public final operator fun component1(): AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[SimpleFunctionDescriptorImpl]

'component2' @ [64:90] ==> public final operator fun component2(): AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[SimpleFunctionDescriptorImpl]

'annotation' @ [65:17] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.getUseSiteTargetedAnnotations.<anonymous>[LocalVariableDescriptor]

'takeIf' @ [65:28] ==> @InlineOnly @SinceKotlin public inline fun <T> AnnotationDescriptor.takeIf(predicate: (AnnotationDescriptor) -> Boolean): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'target' @ [65:37] ==> value-parameter target: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.getUseSiteTargetedAnnotations[ValueParameterDescriptorImpl]

'annotationTarget' @ [65:47] ==> val annotationTarget: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion.getUseSiteTargetedAnnotations.<anonymous>[LocalVariableDescriptor]

'if (fqNameFilter(fqName)) delegate.hasAnnotation(fqName)
            else false' @ [77:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'invoke' @ [77:17] ==> public abstract operator fun invoke(p1: FqName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'fqName' @ [77:30] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.hasAnnotation[ValueParameterDescriptorImpl]

'delegate' @ [77:39] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'hasAnnotation' @ [77:48] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [77:62] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.hasAnnotation[ValueParameterDescriptorImpl]

'if (fqNameFilter(fqName)) delegate.findAnnotation(fqName)
            else null' @ [81:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationDescriptor?, elseBranch: AnnotationDescriptor?): AnnotationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotationDescriptor?

'invoke' @ [81:17] ==> public abstract operator fun invoke(p1: FqName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'fqName' @ [81:30] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.findAnnotation[ValueParameterDescriptorImpl]

'delegate' @ [81:39] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'findAnnotation' @ [81:48] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [81:63] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.findAnnotation[ValueParameterDescriptorImpl]

'if (fqNameFilter(fqName)) delegate.findExternalAnnotation(fqName)
            else null' @ [85:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationDescriptor?, elseBranch: AnnotationDescriptor?): AnnotationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotationDescriptor?

'invoke' @ [85:17] ==> public abstract operator fun invoke(p1: FqName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'fqName' @ [85:30] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.findExternalAnnotation[ValueParameterDescriptorImpl]

'delegate' @ [85:39] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'findExternalAnnotation' @ [85:48] ==> public open fun findExternalAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [85:71] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.findExternalAnnotation[ValueParameterDescriptorImpl]

'delegate' @ [89:16] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'getUseSiteTargetedAnnotations' @ [89:25] ==> public abstract fun getUseSiteTargetedAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'filter' @ [89:57] ==> public inline fun <T> Iterable<AnnotationWithTarget>.filter(predicate: (AnnotationWithTarget) -> Boolean): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'shouldBeReturned' @ [89:66] ==> private final fun shouldBeReturned(annotation: AnnotationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[SimpleFunctionDescriptorImpl]

'it' @ [89:83] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.getUseSiteTargetedAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotation' @ [89:86] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[PropertyDescriptorImpl]

'delegate' @ [93:16] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'getAllAnnotations' @ [93:25] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'filter' @ [93:45] ==> public inline fun <T> Iterable<AnnotationWithTarget>.filter(predicate: (AnnotationWithTarget) -> Boolean): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'shouldBeReturned' @ [93:54] ==> private final fun shouldBeReturned(annotation: AnnotationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[SimpleFunctionDescriptorImpl]

'it' @ [93:71] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.getAllAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotation' @ [93:74] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[PropertyDescriptorImpl]

'delegate' @ [96:31] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'filter' @ [96:40] ==> public inline fun <T> Iterable<AnnotationDescriptor>.filter(predicate: (AnnotationDescriptor) -> Boolean): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'this' @ [96:47] ==> <this> defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[LazyClassReceiverParameterDescriptor]

'shouldBeReturned' @ [96:53] ==> private final fun shouldBeReturned(annotation: AnnotationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[SimpleFunctionDescriptorImpl]

'iterator' @ [96:71] ==> public abstract fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'delegate' @ [98:30] ==> private final val delegate: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[PropertyDescriptorImpl]

'any' @ [98:39] ==> public inline fun <T> Iterable<AnnotationDescriptor>.any(predicate: (AnnotationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'this' @ [98:43] ==> <this> defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[LazyClassReceiverParameterDescriptor]

'shouldBeReturned' @ [98:49] ==> private final fun shouldBeReturned(annotation: AnnotationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations[SimpleFunctionDescriptorImpl]

'annotation' @ [101:13] ==> value-parameter annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.shouldBeReturned[ValueParameterDescriptorImpl]

'fqName' @ [101:24] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'let' @ [101:31] ==> @InlineOnly public inline fun <T, R> FqName?.let(block: (FqName?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName?
    <R> -> Boolean

'fqName' @ [102:17] ==> value-parameter fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.shouldBeReturned.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [102:35] ==> public abstract operator fun invoke(p1: FqName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'fqName' @ [102:48] ==> value-parameter fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.FilteredAnnotations.shouldBeReturned.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [109:49] ==> public constructor CompositeAnnotations(delegates: List<Annotations>) defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[ClassConstructorDescriptorImpl]

'delegates' @ [109:54] ==> value-parameter vararg delegates: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.<init>[ValueParameterDescriptorImpl]

'toList' @ [109:64] ==> public fun <T> Array<out Annotations>.toList(): List<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'delegates' @ [111:30] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'all' @ [111:40] ==> public inline fun <T> Iterable<Annotations>.all(predicate: (Annotations) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'it' @ [111:46] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.isEmpty.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [111:49] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'delegates' @ [113:50] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'asSequence' @ [113:60] ==> public fun <T> Iterable<Annotations>.asSequence(): Sequence<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'any' @ [113:73] ==> public inline fun <T> Sequence<Annotations>.any(predicate: (Annotations) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'it' @ [113:79] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.hasAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'hasAnnotation' @ [113:82] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [113:96] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.hasAnnotation[ValueParameterDescriptorImpl]

'delegates' @ [115:51] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'asSequence' @ [115:61] ==> public fun <T> Iterable<Annotations>.asSequence(): Sequence<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'mapNotNull' @ [115:74] ==> public fun <T, R : Any> Sequence<Annotations>.mapNotNull(transform: (Annotations) -> AnnotationDescriptor?): Sequence<AnnotationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations
    <R : Any> -> AnnotationDescriptor

'it' @ [115:87] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'findAnnotation' @ [115:90] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [115:105] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.findAnnotation[ValueParameterDescriptorImpl]

'firstOrNull' @ [115:115] ==> public fun <T> Sequence<AnnotationDescriptor>.firstOrNull(): AnnotationDescriptor? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'delegates' @ [117:59] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'asSequence' @ [117:69] ==> public fun <T> Iterable<Annotations>.asSequence(): Sequence<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'mapNotNull' @ [117:82] ==> public fun <T, R : Any> Sequence<Annotations>.mapNotNull(transform: (Annotations) -> AnnotationDescriptor?): Sequence<AnnotationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations
    <R : Any> -> AnnotationDescriptor

'it' @ [117:95] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.findExternalAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'findExternalAnnotation' @ [117:98] ==> public open fun findExternalAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'fqName' @ [117:121] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.findExternalAnnotation[ValueParameterDescriptorImpl]

'firstOrNull' @ [117:131] ==> public fun <T> Sequence<AnnotationDescriptor>.firstOrNull(): AnnotationDescriptor? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'delegates' @ [119:52] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'flatMap' @ [119:62] ==> public inline fun <T, R> Iterable<Annotations>.flatMap(transform: (Annotations) -> Iterable<AnnotationWithTarget>): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations
    <R> -> AnnotationWithTarget

'it' @ [119:72] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.getUseSiteTargetedAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'getUseSiteTargetedAnnotations' @ [119:75] ==> public abstract fun getUseSiteTargetedAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'delegates' @ [121:40] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'flatMap' @ [121:50] ==> public inline fun <T, R> Iterable<Annotations>.flatMap(transform: (Annotations) -> Iterable<AnnotationWithTarget>): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations
    <R> -> AnnotationWithTarget

'it' @ [121:60] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.getAllAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'getAllAnnotations' @ [121:63] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'delegates' @ [123:31] ==> private final val delegates: List<Annotations> defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[PropertyDescriptorImpl]

'asSequence' @ [123:41] ==> public fun <T> Iterable<Annotations>.asSequence(): Sequence<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'flatMap' @ [123:54] ==> public fun <T, R> Sequence<Annotations>.flatMap(transform: (Annotations) -> Sequence<AnnotationDescriptor>): Sequence<AnnotationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations
    <R> -> AnnotationDescriptor

'it' @ [123:64] ==> value-parameter it: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations.iterator.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [123:67] ==> public fun <T> Iterable<AnnotationDescriptor>.asSequence(): Sequence<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'iterator' @ [123:82] ==> public abstract operator fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'when {
            first.isEmpty() -> second
            second.isEmpty() -> first
            else -> CompositeAnnotations(first, second)
        }' @ [127:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Annotations, entry1: Annotations, entry2: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Annotations

'first' @ [128:13] ==> value-parameter first: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.composeAnnotations[ValueParameterDescriptorImpl]

'isEmpty' @ [128:19] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'second' @ [128:32] ==> value-parameter second: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.composeAnnotations[ValueParameterDescriptorImpl]

'second' @ [129:13] ==> value-parameter second: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.composeAnnotations[ValueParameterDescriptorImpl]

'isEmpty' @ [129:20] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'first' @ [129:33] ==> value-parameter first: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.composeAnnotations[ValueParameterDescriptorImpl]

'CompositeAnnotations' @ [130:21] ==> public constructor CompositeAnnotations(vararg delegates: Annotations) defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[ClassConstructorDescriptorImpl]

'first' @ [130:42] ==> value-parameter first: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.composeAnnotations[ValueParameterDescriptorImpl]

'second' @ [130:49] ==> value-parameter second: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.composeAnnotations[ValueParameterDescriptorImpl]

