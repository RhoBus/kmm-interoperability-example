import Foundation
import UIKit
import ComposeApp

class InteropExampleImpl : InteropExample {
    
    func doSomethingNative() -> String {
        return UIDevice.current.model
    }
}

