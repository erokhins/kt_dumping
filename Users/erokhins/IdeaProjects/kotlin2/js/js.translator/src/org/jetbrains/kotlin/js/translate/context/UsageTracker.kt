'linkedMapOf' @ [36:28] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<DeclarationDescriptor, JsName> /* = LinkedHashMap<DeclarationDescriptor, JsName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> JsName

'captured' @ [40:17] ==> private final val captured: LinkedHashMap<DeclarationDescriptor, JsName> /* = LinkedHashMap<DeclarationDescriptor, JsName> */ defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'captured' @ [43:17] ==> private final val captured: LinkedHashMap<DeclarationDescriptor, JsName> /* = LinkedHashMap<DeclarationDescriptor, JsName> */ defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'keys' @ [43:26] ==> public open val keys: MutableSet<DeclarationDescriptor> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'isCaptured' @ [46:13] ==> public fun UsageTracker.isCaptured(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [46:24] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'descriptor' @ [48:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'if (descriptor is FunctionDescriptor && descriptor.visibility == Visibilities.LOCAL) {
            captureIfNeed(descriptor)
        }
        // local variable
        else if (descriptor is VariableDescriptor && descriptor !is PropertyDescriptor) {
            captureIfNeed(descriptor)
        }
        // this or receiver
        else if (descriptor is ReceiverParameterDescriptor) {
            captureIfNeed(descriptor)
        }
        else if (descriptor is TypeParameterDescriptor && descriptor.isReified) {
            captureIfNeed(descriptor)
        }' @ [51:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [51:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'descriptor' @ [51:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'visibility' @ [51:60] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'LOCAL' @ [51:87] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'captureIfNeed' @ [52:13] ==> private final fun captureIfNeed(descriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [52:27] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'if (descriptor is VariableDescriptor && descriptor !is PropertyDescriptor) {
            captureIfNeed(descriptor)
        }
        // this or receiver
        else if (descriptor is ReceiverParameterDescriptor) {
            captureIfNeed(descriptor)
        }
        else if (descriptor is TypeParameterDescriptor && descriptor.isReified) {
            captureIfNeed(descriptor)
        }' @ [55:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [55:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'descriptor' @ [55:54] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'captureIfNeed' @ [56:13] ==> private final fun captureIfNeed(descriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [56:27] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'if (descriptor is ReceiverParameterDescriptor) {
            captureIfNeed(descriptor)
        }
        else if (descriptor is TypeParameterDescriptor && descriptor.isReified) {
            captureIfNeed(descriptor)
        }' @ [59:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [59:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'captureIfNeed' @ [60:13] ==> private final fun captureIfNeed(descriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [60:27] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'descriptor' @ [62:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'descriptor' @ [62:59] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'isReified' @ [62:70] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'captureIfNeed' @ [63:13] ==> private final fun captureIfNeed(descriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [63:27] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.used[ValueParameterDescriptorImpl]

'descriptor' @ [68:13] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'isCaptured' @ [68:35] ==> public fun UsageTracker.isCaptured(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [68:46] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'!' @ [68:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInLocalDeclaration' @ [68:62] ==> private final fun isInLocalDeclaration(): Boolean defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'isAncestor' @ [69:13] ==> public open fun isAncestor(@Nullable p0: DeclarationDescriptor?, @NotNull p1: DeclarationDescriptor, p2: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDescriptor' @ [69:24] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'descriptor' @ [69:46] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'isReceiverAncestor' @ [70:13] ==> private final fun isReceiverAncestor(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [70:32] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'isSingletonReceiver' @ [70:47] ==> private final fun isSingletonReceiver(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [70:67] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'descriptor' @ [75:13] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'isCoroutineLambda' @ [75:24] ==> public val DeclarationDescriptor.isCoroutineLambda: Boolean defined in org.jetbrains.kotlin.js.descriptorUtils[DeserializedPropertyDescriptor]

'descriptor' @ [75:45] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'containingDescriptor' @ [75:59] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'parent' @ [77:9] ==> private final val parent: UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'captureIfNeed' @ [77:17] ==> private final fun captureIfNeed(descriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'descriptor' @ [77:31] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'captured' @ [79:9] ==> private final val captured: LinkedHashMap<DeclarationDescriptor, JsName> /* = LinkedHashMap<DeclarationDescriptor, JsName> */ defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'descriptor' @ [79:18] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'descriptor' @ [79:32] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.captureIfNeed[ValueParameterDescriptorImpl]

'getJsNameForCapturedDescriptor' @ [79:43] ==> private final fun DeclarationDescriptor.getJsNameForCapturedDescriptor(): JsName defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'containingDescriptor' @ [83:25] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'isDescriptorWithLocalVisibility' @ [84:16] ==> public open fun isDescriptorWithLocalVisibility(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'if (container is ConstructorDescriptor) container.containingDeclaration else container' @ [84:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MemberDescriptor, elseBranch: MemberDescriptor): MemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MemberDescriptor

'container' @ [84:52] ==> val container: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isInLocalDeclaration[LocalVariableDescriptor]

'container' @ [84:88] ==> val container: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isInLocalDeclaration[LocalVariableDescriptor]

'containingDeclaration' @ [84:98] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'container' @ [84:125] ==> val container: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isInLocalDeclaration[LocalVariableDescriptor]

'descriptor' @ [106:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isReceiverAncestor[ValueParameterDescriptorImpl]

'containingDescriptor' @ [107:13] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'containingDescriptor' @ [107:57] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'getParentOfType' @ [110:31] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(ClassDescriptor..ClassDescriptor?)>, p2: Boolean): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'containingDescriptor' @ [110:47] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'java' @ [110:92] ==> public val <T> KClass<ClassDescriptor>.java: Class<ClassDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'descriptor' @ [113:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isReceiverAncestor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [113:39] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'generateSequence' @ [115:34] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassDescriptor?, nextFunction: (ClassDescriptor) -> ClassDescriptor?): Sequence<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'containingClass' @ [115:51] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isReceiverAncestor[LocalVariableDescriptor]

'it' @ [115:70] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isReceiverAncestor.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [115:73] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'outerDeclaration' @ [116:17] ==> val outerDeclaration: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isReceiverAncestor[LocalVariableDescriptor]

'currentClass' @ [116:37] ==> val currentClass: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isReceiverAncestor[LocalVariableDescriptor]

'descriptor' @ [140:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isSingletonReceiver[ValueParameterDescriptorImpl]

'descriptor' @ [142:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isSingletonReceiver[ValueParameterDescriptorImpl]

'containingDeclaration' @ [142:36] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [143:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isObject' @ [143:30] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [143:39] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isSingletonReceiver[LocalVariableDescriptor]

'containingDescriptor' @ [154:13] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'getParentOfType' @ [155:35] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(ClassDescriptor..ClassDescriptor?)>, p2: Boolean): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'containingDescriptor' @ [155:51] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'java' @ [155:96] ==> public val <T> KClass<ClassDescriptor>.java: Class<ClassDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'containingClass' @ [156:17] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isSingletonReceiver[LocalVariableDescriptor]

'container' @ [156:36] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.isSingletonReceiver[LocalVariableDescriptor]

'when (this) {
            is ReceiverParameterDescriptor -> getNameForCapturedReceiver()
            is TypeParameterDescriptor -> Namer.isInstanceSuggestedName(this)

            // Append 'closure$' prefix to avoid name clash between closure and member fields in case of local classes
            else -> {
                val mangled = NameSuggestion.sanitizeName(NameSuggestion().suggest(this)!!.names.last())
                "closure\$$mangled"
            }
        }' @ [163:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [163:35] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.getJsNameForCapturedDescriptor[ReceiverParameterDescriptorImpl]

'getNameForCapturedReceiver' @ [164:47] ==> private fun ReceiverParameterDescriptor.getNameForCapturedReceiver(): String defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'isInstanceSuggestedName' @ [165:49] ==> @NotNull public open fun isInstanceSuggestedName(@NotNull descriptor: TypeParameterDescriptor): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'this' @ [165:73] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.getJsNameForCapturedDescriptor[ReceiverParameterDescriptorImpl]

'NameSuggestion' @ [169:31] ==> public companion object defined in org.jetbrains.kotlin.js.naming.NameSuggestion[FakeCallableDescriptorForObject]

'sanitizeName' @ [169:46] ==> @JvmStatic public final fun sanitizeName(name: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[DeserializedSimpleFunctionDescriptor]

'NameSuggestion' @ [169:59] ==> public constructor NameSuggestion() defined in org.jetbrains.kotlin.js.naming.NameSuggestion[DeserializedClassConstructorDescriptor]

'suggest' @ [169:76] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[DeserializedSimpleFunctionDescriptor]

'this' @ [169:84] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.getJsNameForCapturedDescriptor[ReceiverParameterDescriptorImpl]

'names' @ [169:92] ==> public final val names: List<String> defined in org.jetbrains.kotlin.js.naming.SuggestedName[DeserializedPropertyDescriptor]

'last' @ [169:98] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mangled' @ [170:28] ==> val mangled: String defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.getJsNameForCapturedDescriptor[LocalVariableDescriptor]

'declareTemporaryName' @ [174:24] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'suggestedName' @ [174:45] ==> val suggestedName: String defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.getJsNameForCapturedDescriptor[LocalVariableDescriptor]

'apply' @ [174:60] ==> @InlineOnly public inline fun <T> JsName.apply(block: (JsName).() -> Unit): JsName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'descriptor' @ [174:68] ==> public var JsName.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'this@getJsNameForCapturedDescriptor' @ [174:81] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker.getJsNameForCapturedDescriptor[ReceiverParameterDescriptorImpl]

'capturedDescriptorToJsName' @ [178:93] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'descriptor' @ [178:120] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedDescriptor[ValueParameterDescriptorImpl]

'capturedDescriptorToJsName' @ [182:13] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'isEmpty' @ [182:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'capturedDescriptorToJsName' @ [183:14] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'size' @ [183:41] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'capturedDescriptorToJsName' @ [183:54] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'containsKey' @ [183:81] ==> public abstract fun containsKey(key: DeclarationDescriptor): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'containingDescriptor' @ [183:93] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'!' @ [185:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNotCaptured' @ [185:13] ==> val hasNotCaptured: Boolean defined in org.jetbrains.kotlin.js.translate.context.hasCapturedExceptContaining[LocalVariableDescriptor]

'capturedDescriptorToJsName' @ [188:75] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'containsKey' @ [188:102] ==> public abstract fun containsKey(key: DeclarationDescriptor): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [188:114] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.isCaptured[ValueParameterDescriptorImpl]

'this' @ [194:20] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver.getNameForCapturedDescriptor[ReceiverParameterDescriptorImpl]

'name' @ [194:25] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'if (name.isSpecial) "" else name.asString()' @ [195:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'name' @ [195:32] ==> val name: Name defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver.getNameForCapturedDescriptor[LocalVariableDescriptor]

'isSpecial' @ [195:37] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'name' @ [195:56] ==> val name: Name defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver.getNameForCapturedDescriptor[LocalVariableDescriptor]

'asString' @ [195:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'CAPTURED_RECEIVER_NAME_PREFIX' @ [197:16] ==> private val CAPTURED_RECEIVER_NAME_PREFIX: String defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[PropertyDescriptorImpl]

'nameAsString' @ [197:48] ==> val nameAsString: String defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver.getNameForCapturedDescriptor[LocalVariableDescriptor]

'namePostfix' @ [197:63] ==> value-parameter namePostfix: String = ... defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver.getNameForCapturedDescriptor[ValueParameterDescriptorImpl]

'this' @ [200:33] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [200:38] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'assert' @ [202:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [202:12] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[LocalVariableDescriptor]

'+' @ [203:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [203:41] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[LocalVariableDescriptor]

'java' @ [203:70] ==> public val <T> KClass<out DeclarationDescriptor>.java: Class<out DeclarationDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out DeclarationDescriptor)

'this' @ [204:32] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [204:68] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[LocalVariableDescriptor]

'isCompanionObject' @ [207:25] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [207:43] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[LocalVariableDescriptor]

'containingDeclaration' @ [208:16] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[LocalVariableDescriptor]

'containingDeclaration' @ [208:38] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'getNameForCapturedDescriptor' @ [208:62] ==> local final fun DeclarationDescriptor.getNameForCapturedDescriptor(namePostfix: String = ...): String defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [211:12] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[LocalVariableDescriptor]

'getNameForCapturedDescriptor' @ [211:34] ==> local final fun DeclarationDescriptor.getNameForCapturedDescriptor(namePostfix: String = ...): String defined in org.jetbrains.kotlin.js.translate.context.getNameForCapturedReceiver[SimpleFunctionDescriptorImpl]

