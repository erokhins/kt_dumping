'WeakHashMap' @ [43:76] ==> public constructor WeakHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.WeakHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <V : (Any..Any?)> -> SuggestedName?

'cache' @ [64:54] ==> private final val cache: MutableMap<DeclarationDescriptor, SuggestedName?> defined in org.jetbrains.kotlin.js.naming.NameSuggestion[PropertyDescriptorImpl]

'getOrPut' @ [64:60] ==> public inline fun <K, V> MutableMap<DeclarationDescriptor, SuggestedName?>.getOrPut(key: DeclarationDescriptor, defaultValue: () -> SuggestedName?): SuggestedName? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> SuggestedName?

'descriptor' @ [64:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.suggest[ValueParameterDescriptorImpl]

'generate' @ [64:83] ==> private final fun generate(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [64:92] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.suggest[ValueParameterDescriptorImpl]

'original' @ [64:103] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'isNativeObject' @ [68:13] ==> public open fun isNativeObject(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [68:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'isCompanionObject' @ [68:43] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [68:61] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'suggest' @ [69:20] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [69:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'containingDeclaration' @ [69:39] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'descriptor' @ [72:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'descriptor' @ [72:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'isSuspend' @ [72:60] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'descriptor' @ [73:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'initialSignatureDescriptor' @ [73:24] ==> public final val FunctionDescriptor.initialSignatureDescriptor: FunctionDescriptor?[MyPropertyDescriptor]

'let' @ [73:52] ==> @InlineOnly public inline fun <T, R> FunctionDescriptor.let(block: (FunctionDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Nothing

'suggest' @ [74:24] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'it' @ [74:32] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [79:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'isDynamic' @ [79:24] ==> public fun DeclarationDescriptor.isDynamic(): Boolean defined in org.jetbrains.kotlin.resolve.calls.tasks[DeserializedSimpleFunctionDescriptor]

'SuggestedName' @ [80:20] ==> public constructor SuggestedName(names: List<String>, stable: Boolean, descriptor: DeclarationDescriptor, scope: DeclarationDescriptor) defined in org.jetbrains.kotlin.js.naming.SuggestedName[ClassConstructorDescriptorImpl]

'listOf' @ [80:34] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'descriptor' @ [80:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'name' @ [80:52] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [80:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [80:76] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'descriptor' @ [80:88] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'containingDeclaration' @ [80:99] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (descriptor) {
            // Modules are root declarations, we don't produce declarations for them, therefore they can't clash
            is ModuleDescriptor -> return null

            is PackageFragmentDescriptor -> {
                return if (!descriptor.fqName.isRoot) {
                    SuggestedName(descriptor.fqName.pathSegments().map(Name::asString), true, descriptor,
                                  descriptor.containingDeclaration)
                }
                else {
                    // Root packages are similar to modules
                    null
                }
            }

            // It's a special case when an object has `invoke` operator defined, in this case we simply generate object itself
            is FakeCallableDescriptorForObject -> return suggest(descriptor.getReferencedObject())

            // For type alias constructor descriptors we generate references to underlying constructors
            is TypeAliasConstructorDescriptor -> return suggest(descriptor.underlyingConstructorDescriptor)

            // For primary constructors and constructors of native classes we generate references to containing classes
            is ConstructorDescriptor -> {
                if (descriptor.isPrimary || isNativeObject(descriptor)) {
                    return suggest(descriptor.containingDeclaration)
                }
            }

            // Local functions and variables are always private with their own names as suggested names
            is CallableDescriptor ->
                if (DescriptorUtils.isDescriptorWithLocalVisibility(descriptor)) {
                    val ownName = getNameForAnnotatedObject(descriptor) ?: getSuggestedName(descriptor)
                    var name = ownName
                    var scope = descriptor.containingDeclaration

                    // Local functions always lifted to the closest class or package when they are contained inside public inline function
                    if (descriptor is FunctionDescriptor) {
                        var container = descriptor.containingDeclaration
                        var liftedName = ownName
                        var hasInline = false
                        while (container is FunctionDescriptor) {
                            if (container.isInline && container.ownEffectiveVisibility.isPublicAPI) {
                                hasInline = true
                            }
                            liftedName = getSuggestedName(container) + "$" + liftedName
                            container = container.containingDeclaration
                        }
                        if (hasInline) {
                            scope = container
                            name = liftedName
                        }
                    }

                    return SuggestedName(listOf(name), false, descriptor, scope)
                }
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [83:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'if (!descriptor.fqName.isRoot) {
                    SuggestedName(descriptor.fqName.pathSegments().map(Name::asString), true, descriptor,
                                  descriptor.containingDeclaration)
                }
                else {
                    // Root packages are similar to modules
                    null
                }' @ [88:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SuggestedName?, elseBranch: SuggestedName?): SuggestedName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SuggestedName?

'!' @ [88:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [88:29] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'fqName' @ [88:40] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'isRoot' @ [88:47] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'SuggestedName' @ [89:21] ==> public constructor SuggestedName(names: List<String>, stable: Boolean, descriptor: DeclarationDescriptor, scope: DeclarationDescriptor) defined in org.jetbrains.kotlin.js.naming.SuggestedName[ClassConstructorDescriptorImpl]

'descriptor' @ [89:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'fqName' @ [89:46] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'pathSegments' @ [89:53] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'map' @ [89:68] ==> public inline fun <T, R> Iterable<(Name..Name?)>.map(transform: ((Name..Name?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)
    <R> -> String

'Name' @ [89:72] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'asString' @ [89:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [89:95] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'descriptor' @ [90:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'containingDeclaration' @ [90:46] ==> public final val PackageFragmentDescriptor.containingDeclaration: ModuleDescriptor[MyPropertyDescriptor]

'suggest' @ [99:58] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [99:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'getReferencedObject' @ [99:77] ==> public final fun getReferencedObject(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedSimpleFunctionDescriptor]

'suggest' @ [102:57] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [102:65] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'underlyingConstructorDescriptor' @ [102:76] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [106:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'isPrimary' @ [106:32] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'isNativeObject' @ [106:45] ==> public open fun isNativeObject(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [106:60] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'suggest' @ [107:28] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [107:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'containingDeclaration' @ [107:47] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'isDescriptorWithLocalVisibility' @ [113:37] ==> public open fun isDescriptorWithLocalVisibility(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [113:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'getNameForAnnotatedObject' @ [114:35] ==> @Nullable public open fun getNameForAnnotatedObject(@NotNull descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [114:61] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'getSuggestedName' @ [114:76] ==> private final fun getSuggestedName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [114:93] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'ownName' @ [115:32] ==> val ownName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'descriptor' @ [116:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'containingDeclaration' @ [116:44] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [119:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'descriptor' @ [120:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'containingDeclaration' @ [120:52] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ownName' @ [121:42] ==> val ownName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'container' @ [123:32] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'container' @ [124:33] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'isInline' @ [124:43] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'container' @ [124:55] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'ownEffectiveVisibility' @ [124:65] ==> private final val DeclarationDescriptorWithVisibility.ownEffectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[PropertyDescriptorImpl]

'isPublicAPI' @ [124:88] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'hasInline' @ [125:33] ==> var hasInline: Boolean defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'liftedName' @ [127:29] ==> var liftedName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'getSuggestedName' @ [127:42] ==> private final fun getSuggestedName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'container' @ [127:59] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'liftedName' @ [127:78] ==> var liftedName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'container' @ [128:29] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'container' @ [128:41] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'containingDeclaration' @ [128:51] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'hasInline' @ [130:29] ==> var hasInline: Boolean defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'scope' @ [131:29] ==> var scope: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'container' @ [131:37] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'name' @ [132:29] ==> var name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'liftedName' @ [132:36] ==> var liftedName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'SuggestedName' @ [136:28] ==> public constructor SuggestedName(names: List<String>, stable: Boolean, descriptor: DeclarationDescriptor, scope: DeclarationDescriptor) defined in org.jetbrains.kotlin.js.naming.SuggestedName[ClassConstructorDescriptorImpl]

'listOf' @ [136:42] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'name' @ [136:49] ==> var name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'descriptor' @ [136:63] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'scope' @ [136:75] ==> var scope: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[LocalVariableDescriptor]

'generateDefault' @ [140:16] ==> private final fun generateDefault(descriptor: DeclarationDescriptor): SuggestedName defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [140:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generate[ValueParameterDescriptorImpl]

'mutableListOf' @ [161:21] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'descriptor' @ [164:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[ValueParameterDescriptorImpl]

'current' @ [165:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [165:52] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'kind' @ [165:60] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [165:98] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'getOverridden' @ [166:30] ==> private final fun getOverridden(descriptor: CallableDescriptor): CallableDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'current' @ [166:44] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'!' @ [167:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overridden' @ [167:18] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'isOverridableOrOverrides' @ [167:29] ==> public val CallableMemberDescriptor.isOverridableOrOverrides: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'current' @ [168:17] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'overridden' @ [168:27] ==> val overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [171:31] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'parts' @ [173:9] ==> val parts: MutableList<String> defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'if (fixedDescriptor is ConstructorDescriptor) {
            current = current.containingDeclaration!!
            getSuggestedName(current) + "_init"
        }
        else {
            getSuggestedName(fixedDescriptor)
        }' @ [173:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fixedDescriptor' @ [173:22] ==> val fixedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [174:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [174:23] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'containingDeclaration' @ [174:31] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'getSuggestedName' @ [175:13] ==> private final fun getSuggestedName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'current' @ [175:30] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'getSuggestedName' @ [178:13] ==> private final fun getSuggestedName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'fixedDescriptor' @ [178:30] ==> val fixedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'if (current.containingDeclaration is FunctionDescriptor && current !is TypeParameterDescriptor) {
            val outerFunctionName = suggest(current.containingDeclaration as FunctionDescriptor)!!
            parts += outerFunctionName.names.single()
            current = outerFunctionName.scope
        }
        else {
            current = current.containingDeclaration!!
        }' @ [180:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'current' @ [180:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'containingDeclaration' @ [180:21] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'current' @ [180:68] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'suggest' @ [181:37] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'current' @ [181:45] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'containingDeclaration' @ [181:53] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'parts' @ [182:13] ==> val parts: MutableList<String> defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'outerFunctionName' @ [182:22] ==> val outerFunctionName: SuggestedName defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'names' @ [182:40] ==> public final val names: List<String> defined in org.jetbrains.kotlin.js.naming.SuggestedName[PropertyDescriptorImpl]

'single' @ [182:46] ==> public fun <T> List<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'current' @ [183:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'outerFunctionName' @ [183:23] ==> val outerFunctionName: SuggestedName defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'scope' @ [183:41] ==> public final val scope: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.SuggestedName[PropertyDescriptorImpl]

'current' @ [186:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [186:23] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'containingDeclaration' @ [186:31] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'current' @ [191:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [192:13] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [192:23] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'containingDeclaration' @ [192:31] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'parts' @ [195:9] ==> val parts: MutableList<String> defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'reverse' @ [195:15] ==> public fun <T> MutableList<String>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'parts' @ [196:29] ==> val parts: MutableList<String> defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'joinToString' @ [196:35] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component1' @ [197:14] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[SimpleFunctionDescriptorImpl]

'component2' @ [197:18] ==> public final operator fun component2(): Boolean defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[SimpleFunctionDescriptorImpl]

'mangleNameIfNecessary' @ [197:28] ==> private final fun mangleNameIfNecessary(baseName: String, descriptor: DeclarationDescriptor): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'unmangledName' @ [197:50] ==> val unmangledName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'fixedDescriptor' @ [197:65] ==> val fixedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'SuggestedName' @ [198:16] ==> public constructor SuggestedName(names: List<String>, stable: Boolean, descriptor: DeclarationDescriptor, scope: DeclarationDescriptor) defined in org.jetbrains.kotlin.js.naming.SuggestedName[ClassConstructorDescriptorImpl]

'listOf' @ [198:30] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'id' @ [198:37] ==> val id: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'stable' @ [198:42] ==> val stable: Boolean defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'fixedDescriptor' @ [198:50] ==> val fixedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'current' @ [198:67] ==> var current: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.generateDefault[LocalVariableDescriptor]

'descriptor' @ [205:20] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.getSuggestedName[ValueParameterDescriptorImpl]

'name' @ [205:31] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'if (name.isSpecial) {
            when (descriptor) {
                is PropertyGetterDescriptor -> "get_" + getSuggestedName(descriptor.correspondingProperty)
                is PropertySetterDescriptor -> "set_" + getSuggestedName(descriptor.correspondingProperty)
                else -> "f"
            }
        }
        else {
            name.asString()
        }' @ [206:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'name' @ [206:20] ==> val name: Name defined in org.jetbrains.kotlin.js.naming.NameSuggestion.getSuggestedName[LocalVariableDescriptor]

'isSpecial' @ [206:25] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'when (descriptor) {
                is PropertyGetterDescriptor -> "get_" + getSuggestedName(descriptor.correspondingProperty)
                is PropertySetterDescriptor -> "set_" + getSuggestedName(descriptor.correspondingProperty)
                else -> "f"
            }' @ [207:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'descriptor' @ [207:19] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.getSuggestedName[ValueParameterDescriptorImpl]

'+' @ [208:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getSuggestedName' @ [208:57] ==> private final fun getSuggestedName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [208:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.getSuggestedName[ValueParameterDescriptorImpl]

'correspondingProperty' @ [208:85] ==> public final val PropertyGetterDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'+' @ [209:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getSuggestedName' @ [209:57] ==> private final fun getSuggestedName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion[SimpleFunctionDescriptorImpl]

'descriptor' @ [209:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.getSuggestedName[ValueParameterDescriptorImpl]

'correspondingProperty' @ [209:85] ==> public final val PropertySetterDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'name' @ [214:13] ==> val name: Name defined in org.jetbrains.kotlin.js.naming.NameSuggestion.getSuggestedName[LocalVariableDescriptor]

'asString' @ [214:18] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (descriptor is CallableDescriptor) {
                generateSequence(descriptor) { it.overriddenDescriptors.firstOrNull()?.original }.last()
            }
            else {
                descriptor
            }' @ [224:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'descriptor' @ [224:44] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[ValueParameterDescriptorImpl]

'generateSequence' @ [225:17] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: CallableDescriptor?, nextFunction: (CallableDescriptor) -> CallableDescriptor?): Sequence<CallableDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CallableDescriptor

'descriptor' @ [225:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[ValueParameterDescriptorImpl]

'it' @ [225:48] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [225:51] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [225:73] ==> public fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.firstOrNull(): CallableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [225:88] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'last' @ [225:99] ==> public fun <T> Sequence<CallableDescriptor>.last(): CallableDescriptor defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'descriptor' @ [228:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[ValueParameterDescriptorImpl]

'getNameForAnnotatedObject' @ [232:30] ==> @Nullable public open fun getNameForAnnotatedObject(@NotNull descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'overriddenDescriptor' @ [232:56] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'nativeName' @ [233:17] ==> val nativeName: String? defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'NameAndStability' @ [233:44] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'nativeName' @ [233:61] ==> val nativeName: String? defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'if (overriddenDescriptor is FunctionDescriptor) {
                when (overriddenDescriptor.fqNameUnsafe.asString()) {
                    "kotlin.CharSequence.get" -> return NameAndStability("charCodeAt", true)
                    "kotlin.Any.equals" -> return NameAndStability("equals", true)
                }
                val container = overriddenDescriptor.containingDeclaration
                if (container is ClassDescriptor && ReflectionTypes.isNumberedKPropertyOrKMutablePropertyType(container.defaultType)) {
                    val name = overriddenDescriptor.name.asString()
                    when (name) {
                        "get",
                        "set" -> return NameAndStability(name, true)
                    }
                }
            }
            else if (overriddenDescriptor is PropertyDescriptor) {
                when (overriddenDescriptor.fqNameUnsafe.asString()) {
                    "kotlin.reflect.KCallable.name" -> return NameAndStability("callableName", true)
                }
            }' @ [235:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'overriddenDescriptor' @ [235:17] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'when (overriddenDescriptor.fqNameUnsafe.asString()) {
                    "kotlin.CharSequence.get" -> return NameAndStability("charCodeAt", true)
                    "kotlin.Any.equals" -> return NameAndStability("equals", true)
                }' @ [236:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'overriddenDescriptor' @ [236:23] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'fqNameUnsafe' @ [236:44] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [236:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'NameAndStability' @ [237:57] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'NameAndStability' @ [238:51] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'overriddenDescriptor' @ [240:33] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'containingDeclaration' @ [240:54] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [241:21] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'ReflectionTypes' @ [241:53] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'isNumberedKPropertyOrKMutablePropertyType' @ [241:69] ==> @JvmStatic public final fun isNumberedKPropertyOrKMutablePropertyType(type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.ReflectionTypes.Companion[DeserializedSimpleFunctionDescriptor]

'container' @ [241:111] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'defaultType' @ [241:121] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'overriddenDescriptor' @ [242:32] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'name' @ [242:53] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [242:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'when (name) {
                        "get",
                        "set" -> return NameAndStability(name, true)
                    }' @ [243:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'name' @ [243:27] ==> val name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'NameAndStability' @ [245:41] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'name' @ [245:58] ==> val name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'overriddenDescriptor' @ [249:22] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'when (overriddenDescriptor.fqNameUnsafe.asString()) {
                    "kotlin.reflect.KCallable.name" -> return NameAndStability("callableName", true)
                }' @ [250:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'overriddenDescriptor' @ [250:23] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'fqNameUnsafe' @ [250:44] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [250:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'NameAndStability' @ [251:63] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'mangleRegularNameIfNecessary' @ [255:20] ==> private final fun mangleRegularNameIfNecessary(baseName: String, descriptor: DeclarationDescriptor): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'baseName' @ [255:49] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[ValueParameterDescriptorImpl]

'overriddenDescriptor' @ [255:59] ==> val overriddenDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleNameIfNecessary[LocalVariableDescriptor]

'generateSequence' @ [259:20] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: CallableDescriptor?, nextFunction: (CallableDescriptor) -> CallableDescriptor?): Sequence<CallableDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CallableDescriptor

'descriptor' @ [259:37] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getOverridden[ValueParameterDescriptorImpl]

'it' @ [259:51] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getOverridden.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [259:54] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [259:76] ==> public fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.firstOrNull(): CallableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [259:91] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'last' @ [259:102] ==> public fun <T> Sequence<CallableDescriptor>.last(): CallableDescriptor defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'descriptor' @ [263:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'NameAndStability' @ [264:24] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'baseName' @ [264:41] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'!' @ [264:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDescriptorWithLocalVisibility' @ [264:68] ==> public open fun isDescriptorWithLocalVisibility(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [264:100] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'NameAndStability' @ [267:40] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'baseName' @ [267:57] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'descriptor' @ [269:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'regularAndUnstable' @ [272:24] ==> local final fun regularAndUnstable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'NameAndStability' @ [275:38] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'getStableMangledName' @ [275:55] ==> @JvmStatic public final fun getStableMangledName(suggestedName: String, forCalculateId: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'baseName' @ [275:76] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'encodeSignature' @ [275:86] ==> public fun encodeSignature(descriptor: CallableDescriptor): String defined in org.jetbrains.kotlin.js.naming in file encodeSignature.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [275:102] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'NameAndStability' @ [276:37] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'getInternalMangledName' @ [276:54] ==> public final fun getInternalMangledName(suggestedName: String, forCalculateId: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'baseName' @ [276:77] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'encodeSignature' @ [276:87] ==> public fun encodeSignature(descriptor: CallableDescriptor): String defined in org.jetbrains.kotlin.js.naming in file encodeSignature.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [276:103] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'NameAndStability' @ [277:36] ==> public constructor NameAndStability(name: String, stable: Boolean) defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.NameAndStability[ClassConstructorDescriptorImpl]

'getPrivateMangledName' @ [277:53] ==> @JvmStatic public final fun getPrivateMangledName(baseName: String, descriptor: CallableDescriptor): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'baseName' @ [277:75] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'descriptor' @ [277:85] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'descriptor' @ [279:39] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'ownEffectiveVisibility' @ [279:50] ==> private final val DeclarationDescriptorWithVisibility.ownEffectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[PropertyDescriptorImpl]

'descriptor' @ [281:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'containingDeclaration' @ [281:52] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (containingDeclaration) {
                is PackageFragmentDescriptor -> when {
                    effectiveVisibility.isPublicAPI -> mangledAndStable()

                    effectiveVisibility == Visibilities.INTERNAL -> mangledInternal()

                    else -> regularAndUnstable()
                }
                is ClassDescriptor -> when {
                    // valueOf() is created in the library with a mangled name for every enum class
                    descriptor is FunctionDescriptor && descriptor.isEnumValueOfMethod() -> mangledAndStable()

                    // Make all public declarations stable
                    effectiveVisibility == Visibilities.PUBLIC -> mangledAndStable()

                    descriptor.isOverridableOrOverrides -> mangledAndStable()

                    // Make all protected declarations of non-final public classes stable
                    effectiveVisibility == Visibilities.PROTECTED &&
                        !containingDeclaration.isFinalClass &&
                        containingDeclaration.visibility.isPublicAPI -> mangledAndStable()

                    effectiveVisibility == Visibilities.INTERNAL -> mangledInternal()

                    // Mangle (but make unstable) all non-public API of public classes
                    containingDeclaration.visibility.isPublicAPI && !containingDeclaration.isFinalClass -> mangledPrivate()

                    else -> regularAndUnstable()
                }
                else -> {
                    assert(containingDeclaration is CallableMemberDescriptor) {
                        "containingDeclaration for descriptor have unsupported type for mangling, " +
                        "descriptor: " + descriptor + ", containingDeclaration: " + containingDeclaration
                    }
                    regularAndUnstable()
                }
            }' @ [282:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NameSuggestion.Companion.NameAndStability, entry1: NameSuggestion.Companion.NameAndStability, entry2: NameSuggestion.Companion.NameAndStability): NameSuggestion.Companion.NameAndStability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NameAndStability

'containingDeclaration' @ [282:26] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'when {
                    effectiveVisibility.isPublicAPI -> mangledAndStable()

                    effectiveVisibility == Visibilities.INTERNAL -> mangledInternal()

                    else -> regularAndUnstable()
                }' @ [283:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NameSuggestion.Companion.NameAndStability, entry1: NameSuggestion.Companion.NameAndStability, entry2: NameSuggestion.Companion.NameAndStability): NameSuggestion.Companion.NameAndStability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NameAndStability

'effectiveVisibility' @ [284:21] ==> val effectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'isPublicAPI' @ [284:41] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'mangledAndStable' @ [284:56] ==> local final fun mangledAndStable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'effectiveVisibility' @ [286:21] ==> val effectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'INTERNAL' @ [286:57] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'mangledInternal' @ [286:69] ==> local final fun mangledInternal(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'regularAndUnstable' @ [288:29] ==> local final fun regularAndUnstable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'when {
                    // valueOf() is created in the library with a mangled name for every enum class
                    descriptor is FunctionDescriptor && descriptor.isEnumValueOfMethod() -> mangledAndStable()

                    // Make all public declarations stable
                    effectiveVisibility == Visibilities.PUBLIC -> mangledAndStable()

                    descriptor.isOverridableOrOverrides -> mangledAndStable()

                    // Make all protected declarations of non-final public classes stable
                    effectiveVisibility == Visibilities.PROTECTED &&
                        !containingDeclaration.isFinalClass &&
                        containingDeclaration.visibility.isPublicAPI -> mangledAndStable()

                    effectiveVisibility == Visibilities.INTERNAL -> mangledInternal()

                    // Mangle (but make unstable) all non-public API of public classes
                    containingDeclaration.visibility.isPublicAPI && !containingDeclaration.isFinalClass -> mangledPrivate()

                    else -> regularAndUnstable()
                }' @ [290:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NameSuggestion.Companion.NameAndStability, entry1: NameSuggestion.Companion.NameAndStability, entry2: NameSuggestion.Companion.NameAndStability, entry3: NameSuggestion.Companion.NameAndStability, entry4: NameSuggestion.Companion.NameAndStability, entry5: NameSuggestion.Companion.NameAndStability, entry6: NameSuggestion.Companion.NameAndStability): NameSuggestion.Companion.NameAndStability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NameAndStability

'descriptor' @ [292:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'descriptor' @ [292:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'isEnumValueOfMethod' @ [292:68] ==> public fun FunctionDescriptor.isEnumValueOfMethod(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'mangledAndStable' @ [292:93] ==> local final fun mangledAndStable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'effectiveVisibility' @ [295:21] ==> val effectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'PUBLIC' @ [295:57] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'mangledAndStable' @ [295:67] ==> local final fun mangledAndStable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'descriptor' @ [297:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'isOverridableOrOverrides' @ [297:32] ==> public val CallableMemberDescriptor.isOverridableOrOverrides: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'mangledAndStable' @ [297:60] ==> local final fun mangledAndStable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'effectiveVisibility' @ [300:21] ==> val effectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'PROTECTED' @ [300:57] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'!' @ [301:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [301:26] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'isFinalClass' @ [301:48] ==> public val ClassDescriptor.isFinalClass: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'containingDeclaration' @ [302:25] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'visibility' @ [302:47] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isPublicAPI' @ [302:58] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'mangledAndStable' @ [302:73] ==> local final fun mangledAndStable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'effectiveVisibility' @ [304:21] ==> val effectiveVisibility: Visibility defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'INTERNAL' @ [304:57] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'mangledInternal' @ [304:69] ==> local final fun mangledInternal(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [307:21] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'visibility' @ [307:43] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isPublicAPI' @ [307:54] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'!' @ [307:69] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [307:70] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'isFinalClass' @ [307:92] ==> public val ClassDescriptor.isFinalClass: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'mangledPrivate' @ [307:108] ==> local final fun mangledPrivate(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'regularAndUnstable' @ [309:29] ==> local final fun regularAndUnstable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'assert' @ [312:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [312:28] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'+' @ [313:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [314:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[ValueParameterDescriptorImpl]

'containingDeclaration' @ [314:85] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[LocalVariableDescriptor]

'regularAndUnstable' @ [316:21] ==> local final fun regularAndUnstable(): NameSuggestion.Companion.NameAndStability defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangleRegularNameIfNecessary[SimpleFunctionDescriptorImpl]

'JvmStatic' @ [323:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'descriptor' @ [324:29] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getPrivateMangledName[ValueParameterDescriptorImpl]

'containingDeclaration' @ [324:40] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'fqNameUnsafe' @ [324:62] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [324:75] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'getStableMangledName' @ [325:20] ==> @JvmStatic public final fun getStableMangledName(suggestedName: String, forCalculateId: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'baseName' @ [325:41] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getPrivateMangledName[ValueParameterDescriptorImpl]

'ownerName' @ [325:51] ==> val ownerName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getPrivateMangledName[LocalVariableDescriptor]

'encodeSignature' @ [325:69] ==> public fun encodeSignature(descriptor: CallableDescriptor): String defined in org.jetbrains.kotlin.js.naming in file encodeSignature.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [325:85] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getPrivateMangledName[ValueParameterDescriptorImpl]

'mangledId' @ [329:30] ==> private final fun mangledId(forCalculateId: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'+' @ [329:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'forCalculateId' @ [329:54] ==> value-parameter forCalculateId: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getInternalMangledName[ValueParameterDescriptorImpl]

'suggestedName' @ [330:20] ==> value-parameter suggestedName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getInternalMangledName[ValueParameterDescriptorImpl]

'suffix' @ [330:36] ==> val suffix: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getInternalMangledName[LocalVariableDescriptor]

'JvmStatic' @ [333:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (forCalculateId.isEmpty()) "" else "_${mangledId(forCalculateId)}\$"' @ [334:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'forCalculateId' @ [334:30] ==> value-parameter forCalculateId: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getStableMangledName[ValueParameterDescriptorImpl]

'isEmpty' @ [334:45] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mangledId' @ [334:68] ==> private final fun mangledId(forCalculateId: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[SimpleFunctionDescriptorImpl]

'forCalculateId' @ [334:78] ==> value-parameter forCalculateId: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getStableMangledName[ValueParameterDescriptorImpl]

'suggestedName' @ [335:20] ==> value-parameter suggestedName: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getStableMangledName[ValueParameterDescriptorImpl]

'suffix' @ [335:36] ==> val suffix: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.getStableMangledName[LocalVariableDescriptor]

'abs' @ [339:36] ==> public open fun abs(p0: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'forCalculateId' @ [339:40] ==> value-parameter forCalculateId: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangledId[ValueParameterDescriptorImpl]

'hashCode' @ [339:55] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (absHashCode != 0) Integer.toString(absHashCode, Character.MAX_RADIX) else ""' @ [340:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'absHashCode' @ [340:24] ==> val absHashCode: Int defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangledId[LocalVariableDescriptor]

'toString' @ [340:50] ==> public open fun toString(p0: Int, p1: Int): (String..String?) defined in java.lang.Integer[JavaMethodDescriptor]

'absHashCode' @ [340:59] ==> val absHashCode: Int defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.mangledId[LocalVariableDescriptor]

'MAX_RADIX' @ [340:82] ==> public const final val MAX_RADIX: Int defined in java.lang.Character[JavaPropertyDescriptor]

'visibility' @ [344:21] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'effectiveVisibility' @ [344:32] ==> public open fun effectiveVisibility(descriptor: DeclarationDescriptor, checkPublishedApi: Boolean): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'this' @ [344:52] ==> <this> defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.ownEffectiveVisibility[ReceiverParameterDescriptorImpl]

'toVisibility' @ [344:84] ==> public abstract fun toVisibility(): Visibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [346:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'name' @ [347:17] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName[ValueParameterDescriptorImpl]

'isEmpty' @ [347:22] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [349:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName[ValueParameterDescriptorImpl]

'first' @ [349:30] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [349:38] ==> @InlineOnly public inline fun <T, R> Char.let(block: (Char) -> Char): Char defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char
    <R> -> Char

'if (it.isES5IdentifierStart()) it else '_'' @ [349:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'it' @ [349:48] ==> value-parameter it: Char defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName.<anonymous>[ValueParameterDescriptorImpl]

'isES5IdentifierStart' @ [349:51] ==> public fun Char.isES5IdentifierStart(): Boolean defined in org.jetbrains.kotlin.js.naming in file NameSuggestion.kt[SimpleFunctionDescriptorImpl]

'it' @ [349:75] ==> value-parameter it: Char defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [350:20] ==> val first: Char defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName[LocalVariableDescriptor]

'toString' @ [350:26] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'name' @ [350:39] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName[ValueParameterDescriptorImpl]

'drop' @ [350:44] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [350:52] ==> public inline fun <R> CharSequence.map(transform: (Char) -> Char): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Char

'if (it.isES5IdentifierPart()) it else '_'' @ [350:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'it' @ [350:62] ==> value-parameter it: Char defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName.<anonymous>[ValueParameterDescriptorImpl]

'isES5IdentifierPart' @ [350:65] ==> public fun Char.isES5IdentifierPart(): Boolean defined in org.jetbrains.kotlin.js.naming in file NameSuggestion.kt[SimpleFunctionDescriptorImpl]

'it' @ [350:88] ==> value-parameter it: Char defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion.sanitizeName.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [350:102] ==> public fun <T> Iterable<Char>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Char) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'isLetter' @ [357:19] ==> public open fun isLetter(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'this' @ [357:28] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierStart[ReceiverParameterDescriptorImpl]

'==' @ [358:9] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'getType' @ [358:19] ==> public open fun getType(p0: Char): Int defined in java.lang.Character[JavaMethodDescriptor]

'this' @ [358:27] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierStart[ReceiverParameterDescriptorImpl]

'toByte' @ [358:33] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'LETTER_NUMBER' @ [358:55] ==> public const final val LETTER_NUMBER: Byte defined in java.lang.Character[JavaPropertyDescriptor]

'this' @ [360:9] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierStart[ReceiverParameterDescriptorImpl]

'this' @ [361:9] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierStart[ReceiverParameterDescriptorImpl]

'isES5IdentifierStart' @ [364:9] ==> public fun Char.isES5IdentifierStart(): Boolean defined in org.jetbrains.kotlin.js.naming in file NameSuggestion.kt[SimpleFunctionDescriptorImpl]

'when (Character.getType(this).toByte()) {
            Character.NON_SPACING_MARK,
            Character.COMBINING_SPACING_MARK,
            Character.DECIMAL_DIGIT_NUMBER,
            Character.CONNECTOR_PUNCTUATION -> true
            else -> false
        }' @ [365:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'getType' @ [365:25] ==> public open fun getType(p0: Char): Int defined in java.lang.Character[JavaMethodDescriptor]

'this' @ [365:33] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierPart[ReceiverParameterDescriptorImpl]

'toByte' @ [365:39] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'NON_SPACING_MARK' @ [366:23] ==> public const final val NON_SPACING_MARK: Byte defined in java.lang.Character[JavaPropertyDescriptor]

'COMBINING_SPACING_MARK' @ [367:23] ==> public const final val COMBINING_SPACING_MARK: Byte defined in java.lang.Character[JavaPropertyDescriptor]

'DECIMAL_DIGIT_NUMBER' @ [368:23] ==> public const final val DECIMAL_DIGIT_NUMBER: Byte defined in java.lang.Character[JavaPropertyDescriptor]

'CONNECTOR_PUNCTUATION' @ [369:23] ==> public const final val CONNECTOR_PUNCTUATION: Byte defined in java.lang.Character[JavaPropertyDescriptor]

'this' @ [372:9] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierPart[ReceiverParameterDescriptorImpl]

'this' @ [373:9] ==> <this> defined in org.jetbrains.kotlin.js.naming.isES5IdentifierPart[ReceiverParameterDescriptorImpl]

'isNotEmpty' @ [376:9] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'first' @ [377:9] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isES5IdentifierStart' @ [377:17] ==> public fun Char.isES5IdentifierStart(): Boolean defined in org.jetbrains.kotlin.js.naming in file NameSuggestion.kt[SimpleFunctionDescriptorImpl]

'drop' @ [378:9] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'all' @ [378:17] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [378:23] ==> value-parameter it: Char defined in org.jetbrains.kotlin.js.naming.isValidES5Identifier.<anonymous>[ValueParameterDescriptorImpl]

'isES5IdentifierPart' @ [378:26] ==> public fun Char.isES5IdentifierPart(): Boolean defined in org.jetbrains.kotlin.js.naming in file NameSuggestion.kt[SimpleFunctionDescriptorImpl]

