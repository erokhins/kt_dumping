'JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'JvmMultifileClass' @ [2:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[DeserializedClassConstructorDescriptor]

'JvmName' @ [3:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'TOP_DOWN' @ [34:70] ==> enum entry TOP_DOWN defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

'Int' @ [38:37] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [38:41] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'TOP_DOWN' @ [41:88] ==> enum entry TOP_DOWN defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

'this' @ [41:99] ==> private constructor FileTreeWalk(start: File, direction: FileWalkDirection = ..., onEnter: ((File) -> Boolean)?, onLeave: ((File) -> Unit)?, onFail: ((f: File, e: IOException) -> Unit)?, maxDepth: Int = ...) defined in kotlin.io.FileTreeWalk[ClassConstructorDescriptorImpl]

'start' @ [41:104] ==> value-parameter start: File defined in kotlin.io.FileTreeWalk.<init>[ValueParameterDescriptorImpl]

'direction' @ [41:111] ==> value-parameter direction: FileWalkDirection = ... defined in kotlin.io.FileTreeWalk.<init>[ValueParameterDescriptorImpl]

'FileTreeWalkIterator' @ [45:54] ==> public constructor FileTreeWalkIterator() defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[ClassConstructorDescriptorImpl]

'WalkState' @ [54:59] ==> public constructor WalkState(root: File) defined in kotlin.io.FileTreeWalk.WalkState[ClassConstructorDescriptorImpl]

'rootDir' @ [54:69] ==> value-parameter rootDir: File defined in kotlin.io.FileTreeWalk.DirectoryState.<init>[ValueParameterDescriptorImpl]

'_Assertions' @ [56:17] ==> @PublishedApi internal object _Assertions defined in kotlin in file AssertionsJVM.kt[FakeCallableDescriptorForObject]

'ENABLED' @ [56:29] ==> @PublishedApi @JvmField internal final val ENABLED: Boolean defined in kotlin._Assertions[PropertyDescriptorImpl]

'assert' @ [57:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file AssertionsJVM.kt[SimpleFunctionDescriptorImpl]

'rootDir' @ [57:24] ==> value-parameter rootDir: File defined in kotlin.io.FileTreeWalk.DirectoryState.<init>[ValueParameterDescriptorImpl]

'isDirectory' @ [57:32] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'AbstractIterator<File>' @ [61:48] ==> public constructor AbstractIterator<T>() defined in kotlin.collections.AbstractIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> File

'Stack' @ [64:29] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> WalkState

'if (start.isDirectory) {
                state.push(directoryState(start))
            } else if (start.isFile) {
                state.push(SingleFileState(start))
            } else {
                done()
            }' @ [67:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'start' @ [67:17] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'isDirectory' @ [67:23] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'state' @ [68:17] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'push' @ [68:23] ==> public open fun push(p0: (FileTreeWalk.WalkState..FileTreeWalk.WalkState?)): (FileTreeWalk.WalkState..FileTreeWalk.WalkState?) defined in java.util.Stack[JavaMethodDescriptor]

'directoryState' @ [68:28] ==> private final fun directoryState(root: File): FileTreeWalk.DirectoryState defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'start' @ [68:43] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'if (start.isFile) {
                state.push(SingleFileState(start))
            } else {
                done()
            }' @ [69:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'start' @ [69:24] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'isFile' @ [69:30] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'state' @ [70:17] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'push' @ [70:23] ==> public open fun push(p0: (FileTreeWalk.WalkState..FileTreeWalk.WalkState?)): (FileTreeWalk.WalkState..FileTreeWalk.WalkState?) defined in java.util.Stack[JavaMethodDescriptor]

'SingleFileState' @ [70:28] ==> public constructor SingleFileState(rootFile: File) defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState[ClassConstructorDescriptorImpl]

'start' @ [70:44] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'done' @ [72:17] ==> protected final fun done(): Unit defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'gotoNext' @ [78:28] ==> private final tailrec fun gotoNext(): File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'if (nextFile != null)
                setNext(nextFile)
            else
                done()' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nextFile' @ [79:17] ==> val nextFile: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.computeNext[LocalVariableDescriptor]

'setNext' @ [80:17] ==> protected final fun setNext(value: File): Unit defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'nextFile' @ [80:25] ==> val nextFile: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.computeNext[LocalVariableDescriptor]

'done' @ [82:17] ==> protected final fun done(): Unit defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'when (direction) {
                FileWalkDirection.TOP_DOWN -> TopDownDirectoryState(root)
                FileWalkDirection.BOTTOM_UP -> BottomUpDirectoryState(root)
            }' @ [87:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FileTreeWalk.DirectoryState, entry1: FileTreeWalk.DirectoryState): FileTreeWalk.DirectoryState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DirectoryState

'direction' @ [87:26] ==> private final val direction: FileWalkDirection defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'TOP_DOWN' @ [88:35] ==> enum entry TOP_DOWN defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

'TopDownDirectoryState' @ [88:47] ==> public constructor TopDownDirectoryState(rootDir: File) defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[ClassConstructorDescriptorImpl]

'root' @ [88:69] ==> value-parameter root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.directoryState[ValueParameterDescriptorImpl]

'BOTTOM_UP' @ [89:35] ==> enum entry BOTTOM_UP defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

'BottomUpDirectoryState' @ [89:48] ==> public constructor BottomUpDirectoryState(rootDir: File) defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[ClassConstructorDescriptorImpl]

'root' @ [89:71] ==> value-parameter root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.directoryState[ValueParameterDescriptorImpl]

'state' @ [95:17] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'empty' @ [95:23] ==> public open fun empty(): Boolean defined in java.util.Stack[JavaMethodDescriptor]

'state' @ [100:28] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'peek' @ [100:34] ==> public open fun peek(): (FileTreeWalk.WalkState..FileTreeWalk.WalkState?) defined in java.util.Stack[JavaMethodDescriptor]

'topState' @ [101:24] ==> val topState: FileTreeWalk.WalkState defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'step' @ [101:33] ==> public abstract fun step(): File? defined in kotlin.io.FileTreeWalk.WalkState[SimpleFunctionDescriptorImpl]

'if (file == null) {
                // There is nothing more on the top of the stack, go back
                state.pop()
                return gotoNext()
            } else {
                // Check that file/directory matches the filter
                if (file == topState.root || !file.isDirectory || state.size >= maxDepth) {
                    // Proceed to a root directory or a simple file
                    return file
                } else {
                    // Proceed to a sub-directory
                    state.push(directoryState(file))
                    return gotoNext()
                }
            }' @ [102:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'file' @ [102:17] ==> val file: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'state' @ [104:17] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'pop' @ [104:23] ==> public open fun pop(): (FileTreeWalk.WalkState..FileTreeWalk.WalkState?) defined in java.util.Stack[JavaMethodDescriptor]

'gotoNext' @ [105:24] ==> private final tailrec fun gotoNext(): File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'if (file == topState.root || !file.isDirectory || state.size >= maxDepth) {
                    // Proceed to a root directory or a simple file
                    return file
                } else {
                    // Proceed to a sub-directory
                    state.push(directoryState(file))
                    return gotoNext()
                }' @ [108:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'file' @ [108:21] ==> val file: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'topState' @ [108:29] ==> val topState: FileTreeWalk.WalkState defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'root' @ [108:38] ==> public final val root: File defined in kotlin.io.FileTreeWalk.WalkState[PropertyDescriptorImpl]

'!' @ [108:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [108:47] ==> val file: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'isDirectory' @ [108:52] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'state' @ [108:67] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'size' @ [108:73] ==> public open val size: Int defined in java.util.Stack[JavaPropertyDescriptor]

'maxDepth' @ [108:81] ==> private final val maxDepth: Int defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'file' @ [110:28] ==> val file: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'state' @ [113:21] ==> private final val state: Stack<FileTreeWalk.WalkState> defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[PropertyDescriptorImpl]

'push' @ [113:27] ==> public open fun push(p0: (FileTreeWalk.WalkState..FileTreeWalk.WalkState?)): (FileTreeWalk.WalkState..FileTreeWalk.WalkState?) defined in java.util.Stack[JavaMethodDescriptor]

'directoryState' @ [113:32] ==> private final fun directoryState(root: File): FileTreeWalk.DirectoryState defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'file' @ [113:47] ==> val file: File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.gotoNext[LocalVariableDescriptor]

'gotoNext' @ [114:28] ==> private final tailrec fun gotoNext(): File? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator[SimpleFunctionDescriptorImpl]

'DirectoryState' @ [120:69] ==> public constructor DirectoryState(rootDir: File) defined in kotlin.io.FileTreeWalk.DirectoryState[ClassConstructorDescriptorImpl]

'rootDir' @ [120:84] ==> value-parameter rootDir: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState.<init>[ValueParameterDescriptorImpl]

'!' @ [132:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'failed' @ [132:22] ==> private final var failed: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'fileList' @ [132:32] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'onEnter' @ [133:25] ==> private final val onEnter: ((File) -> Boolean)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [133:34] ==> public abstract operator fun invoke(p1: File): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'root' @ [133:41] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'fileList' @ [137:21] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'root' @ [137:32] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'listFiles' @ [137:37] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'fileList' @ [138:25] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'onFail' @ [139:25] ==> private final val onFail: ((f: File, e: IOException) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [139:33] ==> public abstract operator fun invoke(f: @ParameterName File, e: @ParameterName IOException): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'root' @ [139:40] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'AccessDeniedException' @ [139:46] ==> public constructor AccessDeniedException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.AccessDeniedException[ClassConstructorDescriptorImpl]

'root' @ [139:75] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'failed' @ [140:25] ==> private final var failed: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'if (fileList != null && fileIndex < fileList!!.size) {
                    // First visit all files
                    return fileList!![fileIndex++]
                } else if (!rootVisited) {
                    // Then visit root
                    rootVisited = true
                    return root
                } else {
                    // That's all
                    onLeave?.invoke(root)
                    return null
                }' @ [143:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'fileList' @ [143:21] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'fileIndex' @ [143:41] ==> private final var fileIndex: Int defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'fileList' @ [143:53] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'size' @ [143:64] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'fileList' @ [145:28] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'fileIndex' @ [145:39] ==> private final var fileIndex: Int defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'if (!rootVisited) {
                    // Then visit root
                    rootVisited = true
                    return root
                } else {
                    // That's all
                    onLeave?.invoke(root)
                    return null
                }' @ [146:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [146:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rootVisited' @ [146:29] ==> private final var rootVisited: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'rootVisited' @ [148:21] ==> private final var rootVisited: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'root' @ [149:28] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'onLeave' @ [152:21] ==> private final val onLeave: ((File) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [152:30] ==> public abstract operator fun invoke(p1: File): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'root' @ [152:37] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState[PropertyDescriptorImpl]

'DirectoryState' @ [159:68] ==> public constructor DirectoryState(rootDir: File) defined in kotlin.io.FileTreeWalk.DirectoryState[ClassConstructorDescriptorImpl]

'rootDir' @ [159:83] ==> value-parameter rootDir: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.<init>[ValueParameterDescriptorImpl]

'if (!rootVisited) {
                    // First visit root
                    if (onEnter?.invoke(root) == false) {
                        return null
                    }

                    rootVisited = true
                    return root
                } else if (fileList == null || fileIndex < fileList!!.size) {
                    if (fileList == null) {
                        // Then read an array of files, if any
                        fileList = root.listFiles()
                        if (fileList == null) {
                            onFail?.invoke(root, AccessDeniedException(file = root, reason = "Cannot list files in a directory"))
                        }
                        if (fileList == null || fileList!!.size == 0) {
                            onLeave?.invoke(root)
                            return null
                        }
                    }
                    // Then visit all files
                    return fileList!![fileIndex++]
                } else {
                    // That's all
                    onLeave?.invoke(root)
                    return null
                }' @ [169:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [169:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rootVisited' @ [169:22] ==> private final var rootVisited: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'onEnter' @ [171:25] ==> private final val onEnter: ((File) -> Boolean)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [171:34] ==> public abstract operator fun invoke(p1: File): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'root' @ [171:41] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'rootVisited' @ [175:21] ==> private final var rootVisited: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'root' @ [176:28] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'if (fileList == null || fileIndex < fileList!!.size) {
                    if (fileList == null) {
                        // Then read an array of files, if any
                        fileList = root.listFiles()
                        if (fileList == null) {
                            onFail?.invoke(root, AccessDeniedException(file = root, reason = "Cannot list files in a directory"))
                        }
                        if (fileList == null || fileList!!.size == 0) {
                            onLeave?.invoke(root)
                            return null
                        }
                    }
                    // Then visit all files
                    return fileList!![fileIndex++]
                } else {
                    // That's all
                    onLeave?.invoke(root)
                    return null
                }' @ [177:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'fileList' @ [177:28] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileIndex' @ [177:48] ==> private final var fileIndex: Int defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileList' @ [177:60] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'size' @ [177:71] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'fileList' @ [178:25] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileList' @ [180:25] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'root' @ [180:36] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'listFiles' @ [180:41] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'fileList' @ [181:29] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'onFail' @ [182:29] ==> private final val onFail: ((f: File, e: IOException) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [182:37] ==> public abstract operator fun invoke(f: @ParameterName File, e: @ParameterName IOException): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'root' @ [182:44] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'AccessDeniedException' @ [182:50] ==> public constructor AccessDeniedException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.AccessDeniedException[ClassConstructorDescriptorImpl]

'root' @ [182:79] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileList' @ [184:29] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileList' @ [184:49] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'size' @ [184:60] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'onLeave' @ [185:29] ==> private final val onLeave: ((File) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [185:38] ==> public abstract operator fun invoke(p1: File): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'root' @ [185:45] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileList' @ [190:28] ==> private final var fileList: Array<File>? defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'fileIndex' @ [190:39] ==> private final var fileIndex: Int defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'onLeave' @ [193:21] ==> private final val onLeave: ((File) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'invoke' @ [193:30] ==> public abstract operator fun invoke(p1: File): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'root' @ [193:37] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState[PropertyDescriptorImpl]

'WalkState' @ [199:63] ==> public constructor WalkState(root: File) defined in kotlin.io.FileTreeWalk.WalkState[ClassConstructorDescriptorImpl]

'rootFile' @ [199:73] ==> value-parameter rootFile: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState.<init>[ValueParameterDescriptorImpl]

'_Assertions' @ [203:21] ==> @PublishedApi internal object _Assertions defined in kotlin in file AssertionsJVM.kt[FakeCallableDescriptorForObject]

'ENABLED' @ [203:33] ==> @PublishedApi @JvmField internal final val ENABLED: Boolean defined in kotlin._Assertions[PropertyDescriptorImpl]

'assert' @ [204:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file AssertionsJVM.kt[SimpleFunctionDescriptorImpl]

'rootFile' @ [204:28] ==> value-parameter rootFile: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState.<init>[ValueParameterDescriptorImpl]

'isFile' @ [204:37] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'visited' @ [208:21] ==> private final var visited: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState[PropertyDescriptorImpl]

'visited' @ [209:17] ==> private final var visited: Boolean defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState[PropertyDescriptorImpl]

'root' @ [210:24] ==> public final val root: File defined in kotlin.io.FileTreeWalk.FileTreeWalkIterator.SingleFileState[PropertyDescriptorImpl]

'FileTreeWalk' @ [223:16] ==> private constructor FileTreeWalk(start: File, direction: FileWalkDirection = ..., onEnter: ((File) -> Boolean)?, onLeave: ((File) -> Unit)?, onFail: ((f: File, e: IOException) -> Unit)?, maxDepth: Int = ...) defined in kotlin.io.FileTreeWalk[ClassConstructorDescriptorImpl]

'start' @ [223:29] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'direction' @ [223:36] ==> private final val direction: FileWalkDirection defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'function' @ [223:57] ==> value-parameter function: (File) -> Boolean defined in kotlin.io.FileTreeWalk.onEnter[ValueParameterDescriptorImpl]

'onLeave' @ [223:77] ==> private final val onLeave: ((File) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onFail' @ [223:95] ==> private final val onFail: ((f: File, e: IOException) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'maxDepth' @ [223:114] ==> private final val maxDepth: Int defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'FileTreeWalk' @ [230:16] ==> private constructor FileTreeWalk(start: File, direction: FileWalkDirection = ..., onEnter: ((File) -> Boolean)?, onLeave: ((File) -> Unit)?, onFail: ((f: File, e: IOException) -> Unit)?, maxDepth: Int = ...) defined in kotlin.io.FileTreeWalk[ClassConstructorDescriptorImpl]

'start' @ [230:29] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'direction' @ [230:36] ==> private final val direction: FileWalkDirection defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onEnter' @ [230:47] ==> private final val onEnter: ((File) -> Boolean)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'function' @ [230:56] ==> value-parameter function: (File) -> Unit defined in kotlin.io.FileTreeWalk.onLeave[ValueParameterDescriptorImpl]

'onFail' @ [230:66] ==> private final val onFail: ((f: File, e: IOException) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'maxDepth' @ [230:74] ==> private final val maxDepth: Int defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'FileTreeWalk' @ [239:16] ==> private constructor FileTreeWalk(start: File, direction: FileWalkDirection = ..., onEnter: ((File) -> Boolean)?, onLeave: ((File) -> Unit)?, onFail: ((f: File, e: IOException) -> Unit)?, maxDepth: Int = ...) defined in kotlin.io.FileTreeWalk[ClassConstructorDescriptorImpl]

'start' @ [239:29] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'direction' @ [239:36] ==> private final val direction: FileWalkDirection defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onEnter' @ [239:47] ==> private final val onEnter: ((File) -> Boolean)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onLeave' @ [239:56] ==> private final val onLeave: ((File) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'function' @ [239:65] ==> value-parameter function: (File, IOException) -> Unit defined in kotlin.io.FileTreeWalk.onFail[ValueParameterDescriptorImpl]

'maxDepth' @ [239:75] ==> private final val maxDepth: Int defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'depth' @ [251:13] ==> value-parameter depth: Int defined in kotlin.io.FileTreeWalk.maxDepth[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [252:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'depth' @ [252:78] ==> value-parameter depth: Int defined in kotlin.io.FileTreeWalk.maxDepth[ValueParameterDescriptorImpl]

'FileTreeWalk' @ [253:16] ==> private constructor FileTreeWalk(start: File, direction: FileWalkDirection = ..., onEnter: ((File) -> Boolean)?, onLeave: ((File) -> Unit)?, onFail: ((f: File, e: IOException) -> Unit)?, maxDepth: Int = ...) defined in kotlin.io.FileTreeWalk[ClassConstructorDescriptorImpl]

'start' @ [253:29] ==> private final val start: File defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'direction' @ [253:36] ==> private final val direction: FileWalkDirection defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onEnter' @ [253:47] ==> private final val onEnter: ((File) -> Boolean)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onLeave' @ [253:56] ==> private final val onLeave: ((File) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'onFail' @ [253:65] ==> private final val onFail: ((f: File, e: IOException) -> Unit)? defined in kotlin.io.FileTreeWalk[PropertyDescriptorImpl]

'depth' @ [253:73] ==> value-parameter depth: Int defined in kotlin.io.FileTreeWalk.maxDepth[ValueParameterDescriptorImpl]

'TOP_DOWN' @ [262:71] ==> enum entry TOP_DOWN defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

'FileTreeWalk' @ [263:9] ==> internal constructor FileTreeWalk(start: File, direction: FileWalkDirection = ...) defined in kotlin.io.FileTreeWalk[ClassConstructorDescriptorImpl]

'this' @ [263:22] ==> <this> defined in kotlin.io.walk[ReceiverParameterDescriptorImpl]

'direction' @ [263:28] ==> value-parameter direction: FileWalkDirection = ... defined in kotlin.io.walk[ValueParameterDescriptorImpl]

'walk' @ [269:47] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io in file FileTreeWalk.kt[SimpleFunctionDescriptorImpl]

'TOP_DOWN' @ [269:70] ==> enum entry TOP_DOWN defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

'walk' @ [275:48] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io in file FileTreeWalk.kt[SimpleFunctionDescriptorImpl]

'BOTTOM_UP' @ [275:71] ==> enum entry BOTTOM_UP defined in kotlin.io.FileWalkDirection[FakeCallableDescriptorForObject]

