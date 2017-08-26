'StringTableImpl' @ [26:31] ==> public constructor StringTableImpl() defined in org.jetbrains.kotlin.serialization.StringTableImpl[DeserializedClassConstructorDescriptor]

'if (descriptor.containingDeclaration is CallableMemberDescriptor) {
            val superClassifiers = descriptor.getAllSuperClassifiers()
                    .mapNotNull { it as ClassifierDescriptorWithTypeParameters }
                    .filter { it != descriptor }
                    .toList()
            if (superClassifiers.size == 1) {
                getFqNameIndex(superClassifiers[0])
            }
            else {
                val superClass = superClassifiers.find { !DescriptorUtils.isInterface(it) }
                getFqNameIndex(superClass ?: descriptor.module.builtIns.any)
            }
        }
        else {
            super.getFqNameIndexOfLocalAnonymousClass(descriptor)
        }' @ [28:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'descriptor' @ [28:20] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[ValueParameterDescriptorImpl]

'containingDeclaration' @ [28:31] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [29:36] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[ValueParameterDescriptorImpl]

'getAllSuperClassifiers' @ [29:47] ==> public fun ClassifierDescriptor.getAllSuperClassifiers(): Sequence<ClassifierDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [30:22] ==> public fun <T, R : Any> Sequence<ClassifierDescriptor>.mapNotNull(transform: (ClassifierDescriptor) -> ClassifierDescriptorWithTypeParameters?): Sequence<ClassifierDescriptorWithTypeParameters> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R : Any> -> ClassifierDescriptorWithTypeParameters

'it' @ [30:35] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [31:22] ==> public fun <T> Sequence<ClassifierDescriptorWithTypeParameters>.filter(predicate: (ClassifierDescriptorWithTypeParameters) -> Boolean): Sequence<ClassifierDescriptorWithTypeParameters> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'it' @ [31:31] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [31:37] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[ValueParameterDescriptorImpl]

'toList' @ [32:22] ==> public fun <T> Sequence<ClassifierDescriptorWithTypeParameters>.toList(): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'if (superClassifiers.size == 1) {
                getFqNameIndex(superClassifiers[0])
            }
            else {
                val superClass = superClassifiers.find { !DescriptorUtils.isInterface(it) }
                getFqNameIndex(superClass ?: descriptor.module.builtIns.any)
            }' @ [33:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'superClassifiers' @ [33:17] ==> val superClassifiers: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[LocalVariableDescriptor]

'size' @ [33:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getFqNameIndex' @ [34:17] ==> public open fun getFqNameIndex(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable[DeserializedSimpleFunctionDescriptor]

'superClassifiers' @ [34:32] ==> val superClassifiers: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[LocalVariableDescriptor]

'superClassifiers' @ [37:34] ==> val superClassifiers: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[LocalVariableDescriptor]

'find' @ [37:51] ==> @InlineOnly public inline fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.find(predicate: (ClassifierDescriptorWithTypeParameters) -> Boolean): ClassifierDescriptorWithTypeParameters? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'!' @ [37:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [37:75] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [37:87] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass.<anonymous>[ValueParameterDescriptorImpl]

'getFqNameIndex' @ [38:17] ==> public open fun getFqNameIndex(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable[DeserializedSimpleFunctionDescriptor]

'superClass' @ [38:32] ==> val superClass: ClassifierDescriptorWithTypeParameters? defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[LocalVariableDescriptor]

'descriptor' @ [38:46] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[ValueParameterDescriptorImpl]

'module' @ [38:57] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'builtIns' @ [38:64] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'any' @ [38:73] ==> public final val KotlinBuiltIns.any: ClassDescriptor[MyPropertyDescriptor]

'super' @ [42:13] ==> <this> defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable[LazyClassReceiverParameterDescriptor]

'getFqNameIndexOfLocalAnonymousClass' @ [42:19] ==> public open fun getFqNameIndexOfLocalAnonymousClass(descriptor: ClassifierDescriptorWithTypeParameters): Int defined in org.jetbrains.kotlin.serialization.StringTableImpl[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [42:55] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable.getFqNameIndexOfLocalAnonymousClass[ValueParameterDescriptorImpl]

